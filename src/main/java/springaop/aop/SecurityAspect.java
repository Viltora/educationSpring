package springaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class SecurityAspect {

  @Before("springaop.aop.MyPointcuts.beforeGetSecurity()")
  private void beforeGetSecurityAdvice(JoinPoint joinPoint){
    System.out.println("Aop - security - before method - first");
    System.out.println("-----------------------------");

    System.out.println("join point - args - " + joinPoint.getArgs());
    System.out.println("join point - kind - " + joinPoint.getKind());
    System.out.println("join point - signature - " + joinPoint.getSignature());
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    System.out.println("join point - MethodSignature  - " + methodSignature);
    System.out.println("join point - MethodSignature method  - " + methodSignature.getMethod().getName());
    System.out.println("join point - MethodSignature  return type- " + methodSignature.getReturnType());
    System.out.println("join point - target - " + joinPoint.getTarget());
    System.out.println("join point - this - " + joinPoint.getThis());

  }
}
