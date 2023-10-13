package exercicios.introducaoPOO.projetoRH.app.entities;

public class Department {

    // define fields
    private String name;

    // define constructors
    public Department(String name) {
        this.name = name;
    }

    // define getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // define toString()
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }

}
