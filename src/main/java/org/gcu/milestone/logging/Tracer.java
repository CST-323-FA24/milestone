package org.gcu.milestone.logging;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.springframework.aop.interceptor.AbstractMonitoringInterceptor;
import org.springframework.context.annotation.Bean;

import java.util.Date;

public class Tracer extends AbstractMonitoringInterceptor
{
    private final ObjectMapper mapper;

    public Tracer(boolean useDynamicLogger, ObjectMapper mapper)
    {
        this.mapper = mapper;
        setUseDynamicLogger(useDynamicLogger);
    }

    @Override
    protected Object invokeUnderTrace(MethodInvocation invocation, Log logger) throws Throwable
    {
        Object result = null;
        String name = createInvocationTraceName(invocation);
        String args = mapper.writeValueAsString(invocation.getArguments());
        String resultJson;

        long start = System.currentTimeMillis();
        logger.info(String.format("[%s] Entering %s(), arguments: %s", new Date(), name, args));
        try {
            result = invocation.proceed();
            return result;
        }
        finally {
            long end = System.currentTimeMillis();
            long time = end - start;
            resultJson = mapper.writeValueAsString(result);

            logger.trace(String.format("[%s] Exiting %s(), returning: %s, execution lasted %dms", new Date(), name, resultJson, time));

            if (time > 10){
                logger.warn("Method execution longer than 10 ms: ");
            }
        }
    }
}
