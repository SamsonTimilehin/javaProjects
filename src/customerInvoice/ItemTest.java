package customerInvoice;


import java.util.Scanner;

public class ItemTest {

    public static void main(String[] args) {


        Cart cart = new Cart();

        Scanner scanDouble = new Scanner(System.in);

        Scanner scanString = new Scanner(System.in);

        Scanner scanInteger = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);

        String decision;


        do{

            Item item = new Item();
            System.out.println("Enter product name");
            String productName = scanString.nextLine();
            item.setName(productName);


            System.out.println("Enter product price");
            double productPrice = scanDouble.nextDouble();
            item.setPrice(productPrice);

            System.out.println("Enter Quantity of product");
            int unit = scanInteger.nextInt();
            item.setQuantity(unit);

            cart.addItems(item);

            System.out.println("Press Yes to continue or No to Exit");
             decision = scan.nextLine();

        }while (decision.equalsIgnoreCase("yes"));

        System.out.println("==============================================");
        System.out.println(cart.getItemList());

        System.out.println("Total Cost : " + cart.calculateTotalPrice());

        System.out.println("======================================================");
    }
}
