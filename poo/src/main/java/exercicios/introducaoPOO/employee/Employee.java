package exercicios.introducaoPOO.employee;

public class Employee {

    // define fields

    private String name;
    private double GrossSalary;
    private double tax;

    // define constructors

    public Employee(){}

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.GrossSalary = grossSalary;
        this.tax = tax;
    }

    // define getters ands setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return GrossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        GrossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    // define toString

    @Override
    public String toString() {
        return "e8.exe2.Employee{" +
                "name='" + name + '\'' +
                ", GrossSalary=" + GrossSalary +
                ", Tax=" + tax +
                '}';
    }

    // define methods

    public double netSalary(){
        return (getGrossSalary() - getTax());
    }

    public void increaseSalary(double percentage) {
        percentage = percentage / 100;
        setGrossSalary((getGrossSalary() * percentage) + getGrossSalary());

    }



    }

