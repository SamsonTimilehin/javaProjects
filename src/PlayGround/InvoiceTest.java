package PlayGround;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice[] invoices = {
                 new Invoice(83,"Electric Sander   ", 7,  57.98),
                 new Invoice(24,"Power Saw         ", 18, 99.99),
                 new Invoice(7, "Sledge Hammer     ", 11, 21.50),
                 new Invoice(77,"Hammer            ", 76, 11.99),
                 new Invoice(39,"Lawn Mower        ", 3,  79.50),
                 new Invoice(68,"Screwdriver       ", 106, 6.99),
                 new Invoice(56,"Jig Saw           ", 21, 11.00),
                 new Invoice(3, "Wrench            ", 34,  7.50)};

        List<Invoice> list = Arrays.asList(invoices);
        list.forEach(System.out::println);

        System.out.println("Sorted price");
        Predicate<Invoice> twoToHundred =
                e -> (e.getPrice() >= 20 && e.getPrice() <= 100);

        list.stream()
                .filter(twoToHundred)
                .sorted(Comparator.comparing(Invoice::getPrice))
                .forEach(System.out::println);

//        Function<Invoice, String> byPartDescription = Invoice::getPartDescription;
//        list.stream()
//                .sorted()
//                .forEach(System.out::println);
    }
}
