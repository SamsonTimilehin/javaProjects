package customerInvoice;

import java.util.Scanner;

public class ItemTest {

    public static void main(String[] args) {

        Item items = new Item();
        Cart customer = new Cart();

        Scanner scanDouble = new Scanner(System.in);

        Scanner scanString = new Scanner(System.in);

        Scanner scanInteger = new Scanner(System.in);

        System.out.println("Enter product name");
        String productName = scanString.nextLine();
        items.setName(productName);

        System.out.println("Enter product price");
        double productPrice = scanDouble.nextDouble();
        items.setPrice(productPrice);

        System.out.println("Enter Quantity of product");
        int unitSold = scanInteger.nextInt();
        items.setQuantity(unitSold);

        customer.addItems(items);
        System.out.println(customer.getItemList());
        System.out.println(customer.calculateTotalPrice());
        System.out.println(items);
    }
}
