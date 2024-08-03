package br.com.diegojacober.aspects_java_springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
    @Before("execution(* br.com.diegojacober.aspects_java_springaop.dummy.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before " + joinPoint.getSignature());
    }

    @Around("execution(* br.com.diegojacober.aspects_java_springaop.dummy.*.*(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around before: " + proceedingJoinPoint.getSignature());
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("Around after: " + proceedingJoinPoint.getSignature());
        return obj;
    }
}
