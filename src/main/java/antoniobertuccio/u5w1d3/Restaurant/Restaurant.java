package antoniobertuccio.u5w1d3.Restaurant;

import antoniobertuccio.u5w1d3.Restaurant.entities.Menu;
import antoniobertuccio.u5w1d3.Restaurant.entities.Order;
import antoniobertuccio.u5w1d3.Restaurant.entities.OrderState;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.ArrayList;

@SpringBootApplication
public class Restaurant implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(Restaurant.class, args);
  }

  @Override
  public void run(String... args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Restaurant.class);

    Menu menu = (Menu) ctx.getBean("getMenu");

    Order order = new Order(1, OrderState.RUNNING, 4, LocalDateTime.now(), new ArrayList<>(), 0.0);

    System.out.println("\nMenu:");
    System.out.println(menu);

    System.out.println("\nOrdini:");
    System.out.println(order);

    ctx.close();
  }
}
