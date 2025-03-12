package aula05._01_instancia;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2023); // Criando um objeto
        myCar.displayInfo(); // Chama o método

        Car fusca = new Car("VW", 1980);
        fusca.displayInfo();
    }
}
