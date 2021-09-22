package customerInvoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemTest {

    public static void main(String[] args) {

        Item items = new Item();
        Cart customer = new Cart();

        Scanner scanDouble = new Scanner(System.in);

        Scanner scanString = new Scanner(System.in);

        Scanner scanInteger = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);
        String decision;
        List<Item> store = new ArrayList<>();

        do{
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
            store.add(items);
            System.out.println("Press Yes to continue or No to Exit");
             decision = scan.nextLine();

        }while (decision.equalsIgnoreCase("yes"));


        System.out.println(store);

        System.out.println(customer.calculateTotalPrice());
    }
}
