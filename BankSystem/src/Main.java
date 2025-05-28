// RECURSOS DE HERANCA E POLIMORFISMO
// SISTEMA DE UM BANCO

package main.java;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
  public static void main(String[] args) {

    // INSTANCIANDO UMA CONTA COMUM
    Account acc = new Account(1001, "Alex", 1000.0);
    // INSTANCIANDO UMA CONTA DE NEGOCIOS
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 5000.0, 500.0);

    // UPCASTING
    // A VARIAVEL ACC1 É DO TIPO ACCOUNT, MAS RECEBE UMA INSTANCIA DE
    // BUSINESSACCOUNT

    Account acc1 = bacc;

    // A VARIAVEL ACC2 É DO TIPO BUSINESSACCOUNT, MAS RECEBE UMA INSTANCIA DE
    // ACCOUNT
    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
    // A VARIAVEL ACC3 É DO TIPO ACCOUNT, MAS RECEBE UMA INSTANCIA DE SAVINGSACCOUNT
    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    // DOWNCASTING

    // A VARIAVEL ACC2 É DO TIPO ACCOUNT, ENTAO PARA ATRIBUIR ACC4 DEVE ANTES FAZER
    // O CASTING (BUSINESSACCOUNT)
    BusinessAccount acc4 = (BusinessAccount) acc2;
    // necessario fazer o casting para que a variavel acc4 possa acessar o metodo
    // loan que esta na classe BusinessAccount
    acc4.loan(100.0);

    // DOWNCASTING COM ERRO DE COMPILACAO POIS ACC3 É DO TIPO ACCOUNT E NAO PODE SER
    // CONVERTIDO PARA BUSINESSACCOUNT
    // BusinessAccount acc5 = (BusinessAccount) acc3;

    // PARA EVITAR O ERRO, DEVE-SE FAZER O TESTE DE INSTANCIA COM O OPERADOR
    // INSTANCEOF

    if (acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount) acc3;
      acc5.loan(200.0);
      System.out.println("Loan!");

    }

    // OUTRO EXEMPLO DE DOWNCASTING UTILIZANDO O OPERADOR INSTANCEOF

    if (acc3 instanceof SavingsAccount) {
      SavingsAccount acc5 = (SavingsAccount) acc3;
      acc5.updateBalance();
      System.out.println("Update!");
    }

    // SOBREPOSICAO E @OVERRIDE

    Account acc6 = new Account(1001, "Alex", 1000.0);
    acc6.withdraw(200.0);
    System.out.println(acc6.getBalance());
    // A SAIDA SERA 795.0 POIS O METODO WITHDRAW DA CLASSE ACCOUNT FOI SOBREPOSTO

    Account acc7 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
    acc7.withdraw(200.0);
    System.out.println(acc7.getBalance());
    // A SAIDA SERA 800.0 POIS O METODO WITHDRAW DA CLASSE SAVINGSACCOUNT FOI
    // SOBREPOSTO COM @OVERRIDE

    // SUPER
    // ADICIONA A TAXA DE 2.0 AO METODO WITHDRAW DA CLASSE ACCOUNT COM O SUPER

    Account acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
    acc8.withdraw(200.0);
    System.out.println(acc8.getBalance());
    // A SAIDA SERA 793.0 POIS O METODO WITHDRAW DA CLASSE BUSINESSACCOUNT FOI
    // SOBREPOSTO COM @OVERRIDE E CHAMOU O METODO WITHDRAW DA CLASSE ACCOUNT COM O
    // SUPER

    // POLIMORFISMO

    // CRIA NOVOS OBJETOS

    Account x = new Account(1020, "Alex", 1000.0); 
    // NA CLASSE ACCOUNT O METODO WITHDRAW TEM A TAXA DE 5.0
    Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.); 
    // NA CLASSE SAVINGSACCOUNT O METODO WITHDRAW NAO TEM
                                                               // TAXA

    x.withdraw(50.0); 
    // A SAIDA SERA 945.0 POIS O METODO WITHDRAW DA CLASSE ACCOUNT FOI CHAMADO
    y.withdraw(50.0); 
    // A SAIDA SERA 950.0 POIS O METODO WITHDRAW DA CLASSE SAVINGSACCOUNT FOI
                      // CHAMADO

    // IMPRIME OS SALDOS
    
    System.out.println(x.getBalance());
    System.out.println(y.getBalance());

    // CLASSES ABSTRATAS
    // public abstract class

    List<Account> list = new Arraylist<>();
    // lista generica que pode instanciar tanto objetos SavingsAccount como Business Account

    list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
    list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
    list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
    list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

    // metodo para calcular saldo total nas contas
    double sum = 0.0;
      for (Account acc : list) {
        sum += acc.getBalance();
      }
    // imprime o saldo total
    System.out.printf("Total balance: %.2f%n", sum);
    
    // metodo para adicionar R$10 em cada conta
    for (Account acc : list) {
      acc.deposit(10.0);
    }
    // metodo para imprimir todas as contas acrescidos de R$10,00
    for (Account acc : list) {
      System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
    }
  }
}
