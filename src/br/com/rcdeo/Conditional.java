package br.com.rcdeo;

public class Conditional {

    public static void main(String[] args) {

        int    nota = 100;
        String graducao;

        if (nota >= 80) {
            graducao = "A";
        } else if (nota < 80 && nota >= 70) {
            graducao = "B";
        } else if (nota < 70 && nota >= 60) {
            graducao = "C";
        } else if (nota < 60 && nota >= 0) {
            graducao = "D";
        } else {
            graducao = "";
        }

        switch (graducao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado.");
                break;
            default:
                System.out.println("Graduação inválida");
        }

    }
}
