package JavaDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora01 {

    public static void main(String[] args) {

        // Data-[hora] local
        // ano-mês-dia-[hora] sem fuso horário
        // A hora é opicional

        // Data-hora Global
        // ano-mês-dia-hora com fuso horário


        // Sintaxe para instanciar um objeto data:
        LocalDate d01 = LocalDate.now();            // Data Local
        LocalDateTime d02 = LocalDateTime.now();    // Data e Hora local
        Instant d03 = Instant.now();                // Data e Hora Global (Baseado no Reino Unido)

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Instanciando uma formatação para data
        // Para conseguir aceitar tipos personalizados de dataHora
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d04 = LocalDate.parse("2022-07-20");  // Transformando String em data
                                                            // Texto ISO 8601 (Padrão internacional para representar data e hora)

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Transformando String em DataTime

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");    // Transformando String em data global no fuso-horário de londres

        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");   // Transformando String em data global
                                                                        // no fuso horário de são paulo que é transformando
                                                                        // no fuso-horário de londres

        // LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        // A String não segue o padrão
        // para dataHora, portanto não
        // é transformado em data.
        // É necessário especificar o padrão personalizado

        LocalDate d09 = LocalDate.parse("20/07/2022 13:20", fmt2); // Usando formatação personalizada de dataHora

        LocalDate d10 = LocalDate.of(2022, 7, 20); // Outra forma de especificar uma dataHora
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);


        // O java automáticamente chama
        // o toString, transformando a data
        // em String
        System.out.println("Data1: " + d01);    // Exibe o dia, mês e ano atual
        System.out.println("Data2: " + d02);    // Exibe o dia, mês, ano, hora e o fuso-horário
        System.out.println("Data3: " + d03);    // Exibe o dia, mês, ano, hora e o fuso-horário de londres
        System.out.println("Data4: " + d04);    // Exibe uma data selecionada por mim
        System.out.println("Data5: " + d05);    // Exibe uma data selecionada por mim
        System.out.println("Data6: " + d06);    // Exibe uma data selecionada por mim
        System.out.println("Data7: " + d07);    // Exibe uma data selecionada por mim
        System.out.println("Data8: " + d08);    // Exibe uma data selecionada por mim
        System.out.println("Data9: " + d09);    // Exibe uma data selecionada por mim
        System.out.println("Data10: " + d10);    // Exibe uma data selecionada por mim
        System.out.println("Data11: " + d11);    // Exibe uma data selecionada por mim



    }

}
