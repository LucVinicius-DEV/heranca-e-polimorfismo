// programa para calcular taxas de impostos

// importa classes necessarias

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<TaxPayer> list = new ArrayList<>(); // lista de tax payers

    System.out.print("Enter the number of tax payers: ");
    int n = sc.nextInt(); // numero de contribuintes informado pelo usuario

    for (int i=1; i<=n; i++)) { // loop para ler os dados de cada contribuinte
      
      System.out.println("Tax payer #" + i + " data:");
      
      System.out.print("Individual or company (i/c)? ");
      char type = sc.next().charAt(0); // tipo de contribuinte informado pelo usuario

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine(); // nome do contribuinte informado pelo usuario

      System.out.print("Anual income: ");
      Double anualIncome = sc.nextDouble(); // renda anual do contribuinte informado pelo usuario

      if (type == 'i') { // se o contribuinte for pessoa fisica
        System.out.print("Health expenditures: ");
        Double healthExpenditures = sc.nextDouble();
        list.add(new Individual(name, anualIncome, healthExpenditures)); // adiciona o contribuinte na lista de contribuintes do tipo pessoa fisica
      } else { // se o contribuinte for pessoa juridica
        System.out.print("Number of employees: ");
        Integer numberOfEmployees = sc.nextInt();
        list.add(new Company(name, anualIncome, numberOfEmployees)); // adiciona o contribuinte na lista de contribuintes do tipo empresa
      }
    }

    // imprime os dados dos contribuintes e o valor da taxa de imposto de cada um
    System.out.println();
    System.out.println("TAXES PAID:");
    for (TaxPayer tp : list) {
      System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
    }
   // imprime o valor total das taxas de imposto
    System.out.println();
    double sum = 0.0;
    for (TaxPayer tp : list) {
      sum += tp.tax();
    }
    System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

    sc.close();
  }
}
