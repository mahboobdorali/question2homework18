package all;

import java.util.Scanner;

public class Main {
    private static Product product ;
    private static Person person=new Person();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter your name:");
        String name=scanner.nextLine();
        person.setName(name);
        System.out.println("type->samsung  name->mobile\ntype->shoes  name->sport");
        System.out.println("enter product type :");
        String productType=scanner.nextLine();
        System.out.println("enter name of product");
        String nameProduct=scanner.nextLine();
        Product samsungMobile=new Product(productType,nameProduct,"notAvailable");
        System.out.println(samsungMobile);
        System.out.println("when exist:");
        samsungMobile.signUpObserver(person);
        samsungMobile.setAvailability("available");
    }
}
