package antoniobertuccio.u5w1d3.Restaurant.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {
  private int orderNumber;
  private OrderState orderState;
  private int numberOfDiners;
  private LocalDateTime orderTime;
  private List<Item> items;
  private double totalAmount;
}
