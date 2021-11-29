package shoppingApp;


import java.util.Scanner;

public class ItemTest {

    public static void main(String[] args) {


        Cart cart = new Cart();

        Scanner scanString1 = new Scanner(System.in);

        Scanner scanString2 = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);

        String decision;
        String productName;
        double productPrice;
        int unit;

        do{

            Item item = new Item();

            System.out.println("Enter product name");
            productName = scanString2.nextLine();
            item.setName(productName);


            System.out.println("Enter product price");
            productPrice = scan.nextDouble();
            item.setPrice(productPrice);

            System.out.println("Enter Quantity of product");
            unit = scan.nextInt();
            item.setQuantity(unit);

            cart.addItems(item);

            System.out.println("Press Yes to change item or No to proceed");
            decision = scanString1.nextLine();

            if (decision.equalsIgnoreCase("yes")){

                System.out.println("Enter the product-name you want to change");
                productName = scanString2.nextLine();
                cart.changeItemInCart(productName,item);

                System.out.println("Enter new product name");
                productName = scanString2.nextLine();
                item.setName(productName);

                System.out.println("Enter product price");
                productPrice = scan.nextDouble();
                item.setPrice(productPrice);

                System.out.println("Enter Quantity of product");
                unit = scan.nextInt();
                item.setQuantity(unit);
            }

            System.out.println("Press Yes to add more item or No to Exit");
             decision = scanString1.nextLine();

        }while (decision.equalsIgnoreCase("yes"));


        System.out.println(cart.getItemList());

        System.out.println("Total Cost : " + cart.calculateTotalPrice());


    }
}
