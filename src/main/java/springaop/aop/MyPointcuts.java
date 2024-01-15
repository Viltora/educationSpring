package springaop.aop;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

  @Pointcut("execution (* get*(..)) ")
  public void beforeGetLogging() {
  }

  @Pointcut("execution (* get*(..))")
  public void beforeGetAuth() {
  }

  @Pointcut("execution (* get*(..))")
  public void beforeGetSecurity() {
  }
}
