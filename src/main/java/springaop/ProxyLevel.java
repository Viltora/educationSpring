package springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProxyLevel {
  @Before("execution(public void getBook())")
  public void loggingAdvice(){
    System.out.println("Aop - logging - before method");
  }
}
