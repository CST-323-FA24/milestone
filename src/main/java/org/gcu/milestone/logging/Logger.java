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
    // Autowired object mapper for argument serialization
    private final ObjectMapper objectMapper;

    // Pointcut defining packages to log
    @Pointcut("within(org.gcu.milestone..*)")
    public void pointcut() {}

    /**
     * Log method entry
     * @param joinPoint
     */
    @Before("pointcut()")
    public void before(JoinPoint joinPoint)
    {
        // Get method details
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getName();
        String args;

        // Attempt to serialize args, else use default toString()
        try
        {
            args = objectMapper.writeValueAsString(joinPoint.getArgs());
        }
        catch (JsonProcessingException e)
        {
            args = Arrays.toString(joinPoint.getArgs());
        }

        // Log method entry
        Date date = new Date();
        log.info("[{}] Entering {}.{}(), arguments: {}", date, className, methodName, args);
    }

    /**
     * Log method exit
     * @param joinPoint
     * @param returnValue
     */
    @AfterReturning(pointcut = "pointcut()", returning = "returnValue")
    private void afterReturning(JoinPoint joinPoint, Object returnValue)
    {
        // Get method details
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getName();
        String returnString;

        // Attempt to serialize value to JSON, else use default toString()
        try
        {
            returnString = objectMapper.writeValueAsString(returnValue);
        } catch (JsonProcessingException e)
        {
            returnString = returnValue.toString();
        }

        // Log method exit
        Date date = new Date();
        log.info("[{}] Exiting {}.{}(), returning {}", date, className, methodName, returnString);
    }
}
