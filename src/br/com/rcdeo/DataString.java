package br.com.rcdeo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class DataString {

    public static void main(String[] args) {

        // Olá, {nome}. Hoje é {dia-da-semana}, {saudacao}!

        String        nome      = "Sicrano";
        LocalDate     data      = LocalDate.now();
        Locale        pais      = new Locale("pt", "BR");
        String        diaSemana = data.getDayOfWeek().getDisplayName(TextStyle.FULL, pais);
        String        saudacao;
        LocalDateTime hora      = LocalDateTime.now();

        if (hora.getHour() >= 0 && hora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (hora.getHour() >= 12 && hora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (hora.getHour() >= 18 && hora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s!%n", nome, diaSemana, saudacao.toLowerCase());

    }
}
