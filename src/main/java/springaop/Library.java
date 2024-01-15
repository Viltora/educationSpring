package springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Library {

  @Value("Война и мир")
  private String book;

  public void getBook() {
    System.out.println("Book is here!");
  }
}
