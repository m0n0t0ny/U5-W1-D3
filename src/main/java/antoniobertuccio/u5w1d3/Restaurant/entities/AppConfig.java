package antoniobertuccio.u5w1d3.Restaurant.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@PropertySource("application.properties")
@Configuration
public class AppConfig {


  @Value("${cover.charge.price}")
  private double coverChargePrice;

  //  TOPPING 🧀

  @Bean
  Topping getCheese() {
    return new Topping("cheese", 92, 0.69);
  }

  @Bean
  Topping getHam() {
    return new Topping("ham", 35, 0.99);
  }

  @Bean
  Topping getOnions() {
    return new Topping("onions", 22, 0.69);
  }

  @Bean
  Topping getPineapple() {
    return new Topping("pineapple", 24, 0.99);
  }

  @Bean
  Topping getSalami() {
    return new Topping("salami", 92, 0.69);
  }

  @Bean
  Topping getTomato() {
    return new Topping("tomato", 92, 0.69);
  }

  //  DRINK 🍷

  @Bean
  Drink getLemonade() {
    return new Drink("lemonade", 128, 1.29);
  }

  @Bean
  Drink getWater() {
    return new Drink("water", 0, 1.29);
  }

  @Bean
  Drink getWine() {
    return new Drink("wine", 607, 7.49);
  }

  //  PIZZA 🍕

  @Bean
  Pizza getPizzaMargherita() {
    List<String> toppingPizzaMargherita = new ArrayList<>(Arrays.asList(getTomato().getName(), getCheese().getName()));
    return new Pizza("Margherita", 1104, 4.99, toppingPizzaMargherita);
  }

  @Bean
  Pizza getPizzaHawaiian() {
    List<String> toppingPizzaHawaiian = new ArrayList<>(Arrays.asList(getTomato().getName(), getCheese().getName(), getHam().getName(), getPineapple().getName()));
    return new Pizza("Hawaiian", 1024, 6.49, toppingPizzaHawaiian);
  }

  @Bean
  Pizza getPizzaSalami() {
    List<String> toppingPizzaSalami = new ArrayList<>(Arrays.asList(getTomato().getName(), getCheese().getName(), getSalami().getName()));
    return new Pizza("Salami", 1160, 5.99, toppingPizzaSalami);
  }

  //  MENU 📜
  
  @Bean
  Menu getMenu(@Value("${cover.charge.price}") double coverCharge) {
    List<Pizza> pizzas = new ArrayList<>(Arrays.asList(getPizzaMargherita(), getPizzaHawaiian(), getPizzaSalami()));
    List<Drink> drinks = new ArrayList<>(Arrays.asList(getWine(), getWater(), getLemonade()));
    List<Topping> toppings = new ArrayList<>(Arrays.asList(getSalami(), getHam(), getCheese(), getPineapple(), getOnions(), getTomato()));

    return new Menu(pizzas, drinks, toppings);
  }
}
