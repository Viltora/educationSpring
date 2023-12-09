package springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);

    Library library = context.getBean("library", Library.class);
    library.getBook();

    context.close();
  }
}
