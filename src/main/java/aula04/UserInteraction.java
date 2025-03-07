package aula04;

/*
Exercício 3: Pergunta e Resposta
Objetivo: Criar um programa que interage com o usuário fazendo perguntas e respondendo com base na entrada.
Siga os passos:
   1) Criar um novo arquivo chamado `UserInteraction.java`.
   2) Implementar o seguinte código:
   3) Executar o código e testar com diferentes respostas.
      Exemplo de entrada e saída:
      ```java
      Qual é o seu nome? João
      Quantos anos você tem? 25
      Olá, João! Você tem 25 anos.
      ```
   4) Altere o programa para modificar as perguntas e a resposta.
 */

import java.util.Scanner;

public class UserInteraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String name = scanner.nextLine();

        System.out.print("Quantos anos você tem? ");
        int age = scanner.nextInt();

        System.out.println("Olá, " + name + "! Você tem " + age + " anos.");

        scanner.close();
    }
}
