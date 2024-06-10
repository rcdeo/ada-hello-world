package br.com.rcdeo;

public class Boolean {

    public static void main(String[] args) {

        boolean fimDeSemana = false;
        boolean fazendoSol  = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        /*
         * Tabela Verdade
         *
         * Operador && (AND)
         * true && true = true and rest false
         *
         * Operador || (OR)
         * false && false = false and rest true
         * */
        System.out.println(vamosAPraia);

        // Operador Ternário
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

    }
}
