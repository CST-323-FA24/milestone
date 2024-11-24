package org.gcu.milestone.logging;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Slf4j
@Aspect
@Component
@AllArgsConstructor
public class Logger
{
    private final ObjectMapper objectMapper;

    @Pointcut("within(org.gcu.milestone..*)")
    public void pointcut() {}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint)
    {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getName();
        String args;
        try
        {
            args = objectMapper.writeValueAsString(joinPoint.getArgs());
        }
        catch (JsonProcessingException e)
        {
            args = Arrays.toString(joinPoint.getArgs());
        }
        Date date = new Date();
        log.info("[{}] Entering {}.{}(), arguments: {}", date, className, methodName, args);
    }

    @AfterReturning(pointcut = "pointcut()", returning = "returnValue")
    private void afterReturning(JoinPoint joinPoint, Object returnValue)
    {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getName();
        String returnString;

        try
        {
            returnString = objectMapper.writeValueAsString(returnValue);
        } catch (JsonProcessingException e)
        {
            returnString = returnValue.toString();
        }

        Date date = new Date();
        log.info("[{}] Exiting {}.{}(), returning {}", date, className, methodName, returnString);
    }
}
