package entities;

public class Company extends TaxPayer {

  private Integer numberOfEmployees;

  public Company() {
    super();
  }

  public Company(String name, Double anualIncome, Integer numberOfEmployees) {
    super(name, anualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  public Integer getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }


  // Implementar o método tax()
  @Override

  public Double tax() {
    if (getNumberOfEmployees() > 10) {
      return getAnualIncome() * 0.14;
    }
    else { return getAnualIncome() * 0.16;}
    
  }

}
