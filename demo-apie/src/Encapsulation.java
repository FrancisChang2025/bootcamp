public class Encapsulation {
  public static void main(String[] args) {
    // Encapsulation

    // Role of writing program
    // ! 1. Author
    // ! 2. User

    // ! Author
      // Customer, Order, Item
      // Customer has Ordrs (Order[])
      // Order has Item (Item[])
        // Customer.class -> add(Order order)
        // Customer.class -> remove(Order order)
        // Order.class -> add(Item item)
        // Order.class -> remove(Item item)

    // Encapsulation (done by Author)
      // 1. Author use array to present ONE to MANY (In future, Author can use ArrayList instead of array)
      // AND
      // 2. Only Provide add() and remove() for Customer, but NO setter & getter

      // ! from Author perspective
        // Access Control for attributes (read and write)
        // The way to store data (data structure)


      // ! from user perspective
      // Readability (Convenient for calling method, easy to understand)
        // customerA.add(order)
        // orderA.add(itemA)

  }
}
