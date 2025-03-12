package aula05._01_instancia;

public class Car {
    // Atributos (estado do objeto)
    private String brand;
    private int year;

    // Construtor (inicializa o objeto)
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Método (comportamento)
    public void displayInfo() {
        System.out.println("Marca: " + brand + ", Ano: " + year);
    }
}
