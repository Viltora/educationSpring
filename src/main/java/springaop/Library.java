package springaop;

import org.springframework.stereotype.Component;

@Component
public class Library {
  public void getBook(){
    System.out.println("Book is here!");
  }
}
