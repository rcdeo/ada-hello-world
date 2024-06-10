package br.com.rcdeo;

public class Loops {

    public static void main(String[] args) {

        // para uma variável que inicie em 1 e vai até 10, mudando de 1-por-1, faça
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "x" + i + " = " + j * i);
            }
        }

    }
}
