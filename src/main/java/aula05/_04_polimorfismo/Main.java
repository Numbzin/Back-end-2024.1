package aula05._04_polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cat(); // Polimorfismo
        myAnimal.makeSound(); // Executa o método da subclasse Cat
    }
}
