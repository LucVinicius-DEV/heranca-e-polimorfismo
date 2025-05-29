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
    if (getAnualIncome() < 20000.0) { // se a renda anual for menor que 20000,00
      return getAnualIncome() * 0.15 - getHealthExpenditures() * 0.5; // entao a taxa de imposto é 15% da renda anual menos 50% das despesas medicas
    } else { // senao
      return getAnualIncome() * 0.25 - getHealthExpenditures() * 0.5; // a taxa de imposto é 25% da renda anual menos 50% das despesas medicas
    }
  }

}
