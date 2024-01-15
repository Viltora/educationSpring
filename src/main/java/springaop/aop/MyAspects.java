package springaop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class MyAspects {

  @Before("springaop.aop.MyPointcuts.beforeGetLogging()")
  public void beforeLoggingAdvice() {
    System.out.println("Aop - logging - before method");
    System.out.println("-----------------------------");
  }

  @Before("springaop.aop.MyPointcuts.beforeGetAuth()")
  public void beforeAuthAdvice() {
    System.out.println("Aop - auth - before method");
    System.out.println("-----------------------------");
  }

  @Before("springaop.aop.MyPointcuts.beforeGetAuth() || springaop.aop.MyPointcuts.beforeGetLogging()")
  public void beforeAuthAndLoggingAdvice() {
    System.out.println("Aop - auth and logging - before method");
    System.out.println("-----------------------------");
  }
}
