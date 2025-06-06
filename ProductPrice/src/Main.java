// heranca e polimorfismo

package main.java;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws ParseException {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Product> list = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.println("Product #" + i + " data:");
      System.out.print("Common, used or imported (c/u/i)? ");
      char type = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Price: ");
      double price = sc.nextDouble();
      if (type == 'c') {
        list.add(new Product(name, price));
      } else if (type == 'u') {
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        Date date = Date.from(Instant.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(sc.next())));
        list.add(new UsedProduct(name, price, date));
      } else {
        System.out.print("Customs fee: ");
        double customsFee = sc.nextDouble();
        list.add(new ImportedProduct(name, price, customsFee));
      }
    }
    System.out.println();
    System.out.println("PRICE TAGS:");
    for (Product prod : list) {
      System.out.println(prod.priceTag());
    }
    sc.close();
  }
}
