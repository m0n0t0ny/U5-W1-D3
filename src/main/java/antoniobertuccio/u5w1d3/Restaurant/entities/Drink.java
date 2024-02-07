package antoniobertuccio.u5w1d3.Restaurant.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Drink extends Item{
  public Drink(String name, int calories, double price) {
    super(name, calories, price);
  }
}
