package entities;

// HERDANDO DA CLASSE ACCOUNT
// A CLASSE SAVINGSACCOUNT É UMA SUBCLASSE DA CLASSE ACCOUNT
// O TERMO FINAL INDICA QUE A CLASSE NAO PODE SER HERDADA POR OUTRA CLASSE

public final class SavingsAccount extends Account {

  // ATRIBUTO - TAXA DE JUROS

  private Double interestRate;

  // CONSTRUTOR PADRAO - CHAMA O CONSTRUTOR DA SUPERCLASSE

  public SavingsAccount() {
    super();
  }

  // CONSTRUTOR COM ARGUMENTOS - CHAMA O CONSTRUTOR DA SUPERCLASSE

  public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  // GETTERS E SETTERS

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  // METODOS
  // OPERACAO DE ATUALIZACAO DE SALDO COM JUROS

  public void updateBalance() {
    balance += balance * interestRate;
  }

  // OVERRIDE PARA INDICAR AO COMPILADOR QUE O METODO WITHDRAW ESTA SENDO
  // SOBRESCRITO

  @Override
  // SOBRESCREVENDO O METODO WITHDRAW DA SUPERCLASSE

  // aplicando final no metodo
  
  public final void withdraw(double amount) {
    balance -= amount;
  }
  // O METODO WITHDRAW NAO PODE SER SOBRESCRITO EM OUTRA CLASSE QUE HERDE DE SAVINGSACCOUNT

}
