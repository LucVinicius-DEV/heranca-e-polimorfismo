package entities;

public class BusinessAccount extends Account {

  // ATRIBUTO

  private Double loanLimit;

  // CONSTRUTOR PADRAO - CHAMA O CONSTRUTOR DA SUPERCLASSE

  public BusinessAccount() {
    super();
  }

  // CONSTRUTOR COM ARGUMENTOS - CHAMA O CONSTRUTOR DA SUPERCLASSE

  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance);
    this.loanLimit = loanLimit;
  }

  // GETTERS E SETTERS

  public Double getLoanLimit() {
    return loanLimit;
  }

  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  // METODOS

  // OPERACAO DE EMPRESTIMO
  public void loan(double amount) {
    if (amount <= loanLimit) {
      balance += amount - 10.0;
    }

    // SOBRESCREVENDO O METODO WITHDRAW DA SUPERCLASSE

    @Override

      public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
      }
  }
}
