package entities;

// classe Individual que herda de TaxPayer
public class Individual extends TaxPayer {

  // atribui ao TaxPayer Individual as despesas medicas
  private Double healthExpenditures;

  // construtor padrao
  public Individual() {
    super();
  }

  // construtor com argumentos
  public Individual(String name, Double anualIncome, Double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  // getters e setters

  public Double getHealthExpenditures() {
    return healthExpenditures;
  }

  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  // Implementar o método tax()
  @Override
  public Double tax() {
    if (getAnualIncome() < 20000.0) {
      return getAnualIncome() * 0.15 - getHealthExpenditures() * 0.5;
    } else {
      return getAnualIncome() * 0.25 - getHealthExpenditures() * 0.5;
    }
  }

}
