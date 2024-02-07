package AntonioBertuccio.u5w1d1;

import antoniobertuccio.u5w1d3.Restaurant.Restaurant;
import antoniobertuccio.u5w1d3.Restaurant.entities.Drink;
import antoniobertuccio.u5w1d3.Restaurant.entities.Topping;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigTests {
  static private AnnotationConfigApplicationContext context;

  @BeforeAll
  public static void beforeAll() {
    System.out.println("🟢 Beginning tests");
    context = new AnnotationConfigApplicationContext(Restaurant.class);
  }

  @AfterAll
  public static void afterAll() {
    System.out.println("🟢 All tests completed");
  }

  @BeforeEach
  public void beforeEach() {
    System.out.println("--- Beginning NEW test");
  }

//  @Test
//  public void testGetCheese() {
//    Topping cheese = (Topping) context.getBean("getCheese");
//    Assertions.assertEquals("cheese", cheese.getName(), "Testing cheese.getName");
//    Assertions.assertEquals(92, cheese.getCalories(), "Testing cheese.getCalories");
//    Assertions.assertEquals(0.69, cheese.getPrice(), "Testing cheese.getPrice");
//  }

  @ParameterizedTest
  @CsvSource({"cheese, 92, 0.69"})
  public void parametrizedTestGetCheese(String a, int b, double c) {
    Topping cheese = (Topping) context.getBean("getCheese");
    System.out.println("Testing cheese.getName");
    Assertions.assertEquals(a, cheese.getName());
    System.out.println("Testing cheese.getCalories");
    Assertions.assertEquals(b, cheese.getCalories());
    System.out.println("Testing cheese.getPrice");
    Assertions.assertEquals(c, cheese.getPrice());
  }

  @ParameterizedTest
  @CsvSource({"water, 0, 1.29"})
  public void parametrizedTestGetWater(String a, int b, double c) {
    Drink water = (Drink) context.getBean("getWater");
    System.out.println("Testing water.getName");
    Assertions.assertEquals(a, water.getName());
    System.out.println("Testing water.getCalories");
    Assertions.assertEquals(b, water.getCalories());
    System.out.println("Testing water.getPrice");
    Assertions.assertEquals(c, water.getPrice());
  }
}
