import { Customer } from "./customer";
import { Address } from "./address";
import { Order } from "./order";
import { OrderItem } from "./order-item";

export class Purchase {
  customer: Customer = null as unknown as Customer;
  shippingAddress: Address = null as unknown as Address;
  billingAddress: Address = null as unknown as Address;
  order: Order = null as unknown as Order;
  orderItems: OrderItem[] = [];
}
