package register;

import java.util.Scanner;

public class UserTest {

    public static void main(String[] args) {

        RegisterBook registerList = new RegisterBook();
        Scanner scan = new Scanner(System.in);

        String storeName  =scan.nextLine();
        String storeName1 =scan.nextLine();
        String storeName2 =scan.nextLine();
        String storeName3 =scan.nextLine();

        registerList.register(storeName);
        registerList.register(storeName1);
        registerList.register(storeName2);
        registerList.register(storeName3);


        System.out.println(registerList.getUserList());



    }
}
