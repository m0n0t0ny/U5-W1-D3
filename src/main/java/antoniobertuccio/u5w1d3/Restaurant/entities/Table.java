package antoniobertuccio.u5w1d3.Restaurant.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Table {
  public int tableNumber;
  private int guestsNumber;
  public boolean isBusy;

}
