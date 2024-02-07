package antoniobertuccio.u5w1d3.Restaurant.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public abstract class Item {
  protected String name;
  protected int calories;
  protected double price;
}
