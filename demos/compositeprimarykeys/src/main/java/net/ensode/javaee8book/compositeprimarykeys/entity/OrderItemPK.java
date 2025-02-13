package net.ensode.javaee8book.compositeprimarykeys.entity;

import java.io.Serializable;
import java.util.Objects;

public class OrderItemPK implements Serializable
{
  public Long orderId;
  public Long itemId;

  public OrderItemPK()
  {

  }

  public OrderItemPK(Long orderId, Long itemId)
  {
    this.orderId = orderId;
    this.itemId = itemId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
      }
    OrderItemPK that = (OrderItemPK) o;
    return Objects.equals(orderId, that.orderId) && Objects.equals(itemId, that.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, itemId);
  }


}
