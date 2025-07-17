package funcionario;

public class Emplyoee {
	public String Name;
	public double GlossSalary;
	public double Tax;
	
	public void InputValue(String Name, double GlossSalary, double Tax) {
		this.Name=Name;
		this.GlossSalary=GlossSalary;
		this.Tax=Tax;
		
	}
	public double NetSalary() {
		return this.GlossSalary-this.Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		System.out.println( (this.GlossSalary *(percentage/100+1)));
	}
	public String ShowAllData(double percentageIncrease) {
        IncreaseSalary(percentageIncrease);
        return "Name: " + this.Name +
               "\nGross Salary: " + this.GlossSalary +
               "\nTax: " + this.Tax +
               "\nNet Salary: " + NetSalary();
    }
	public String toString() {
		return "Name: "+ this.Name+ "NetSalary: "+NetSalary();
	}


}
