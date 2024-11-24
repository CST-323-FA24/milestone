package org.gcu.milestone.logging;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@Aspect
@AllArgsConstructor
public class AopConfig
{
    private final ObjectMapper mapper;

    @Pointcut("within(org.gcu.milestone..*)")
    public void pointcut()
    {
    }

    @Bean
    public Tracer performanceMonitorInterceptor()
    {
        return new Tracer(true, mapper);
    }

    @Bean
    public Advisor advisor()
    {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("org.gcu.milestone.logging.AopConfig.pointcut()");
        return new DefaultPointcutAdvisor(pointcut, performanceMonitorInterceptor());
    }
}
