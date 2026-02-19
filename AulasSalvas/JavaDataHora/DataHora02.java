package JavaDataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DataHora02 {

    public static void main(String[] args) throws ParseException {

        // Padrão ISO 8601
        // Formato: yyyy-MM-ddTHH:mm:ssZ
        // exemplo: 2018-06-25T15:45:07Z

        /*
            O formato ISO 8601 possuí uma letra T para
            separar a data da hora. E uma letra Z no
            final para representar o formato UTC, que
            é o horário baseado no reino unido.
        */

        // Estou criando um objeto SimpleDateFormat
        // É um formato para converter datas, no caso
        // eu instanciei um formato personalizado.
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        // Criando dois objetos data e passando
        // duas strings convertidas para o formatos
        // instanciados acima.
        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Declarando uma data no fuso-horário UTC

        // Instanciando uma data
        // com a data atual
        Date x1 = new Date();

        // Instanciando uma data e enviando como parâmetro
        // o horário atual de uma região específica
        Date x2 = new Date(System.currentTimeMillis());

        // Instanciando uma data e enviando o momento em
        // milisegundos.
        Date x3 = new Date(0L);

        // Instanciando uma data e enviando o momento em
        // milisegundos.
        // 1seg = 1000Ms
        // 1min = 1seg * 60
        // 1H = 1min * 60
        // 5H = 1H * 5
        Date x4 = new Date(1000L * 60L * 60L * 5L);

        // A saída mostra respectivamente:
        // O dia da semana, o mês, o dia, horário, fuso-horário, ano
        System.out.println(y1); // Saída: Mon Jun 25 00:00:00 BRT 2018
        System.out.println(y2); // Saída: Mon Jun 25 15:42:07 BRT 2018
        System.out.println(y3); // Saída: Mon Jun 25 12:42:07 BRT 2018

        // Estamos convertendo a data para os formatos
        // antes instanciados.
        System.out.println("SDF1 | x1: " + sdf1.format(x1)); // Saída: 22/11/2025
        System.out.println("SDF1 | y1: " + sdf1.format(y1)); // Saída: 25/06/2018
        System.out.println("SDF1 | y2: " + sdf1.format(y2)); // Saída: 25/06/2018

        System.out.println("SDF2 | x1: " + sdf2.format(x1)); // Saída: 22/11/2025 15:13:03
        System.out.println("SDF2 | y1: " + sdf2.format(y1)); // Saída: 25/06/2018 00:00:00
        System.out.println("SDF2 | y2: " + sdf2.format(y2)); // Saída: 25/06/2018 15:42:07

        System.out.println("\n\n\n");

        System.out.println("SDF1 | x1: " + sdf1.format(x1)); // Saída: 22/11/2025
        System.out.println("SDF1 | x2: " + sdf1.format(x2)); // Saída: 22/11/2025
        System.out.println("SDF1 | x3: " + sdf1.format(x3)); // Saída: 31/12/1969
        System.out.println("SDF1 | x4: " + sdf1.format(x4)); // Saída: 01/01/1970

        // O horário está 3 horas atrasado em relação ao UTC
        // Pois este é o fuso-horário de São Paulo
        System.out.println("SDF2 | x1: " + sdf2.format(x1)); // Saída: 22/11/2025 15:13:03
        System.out.println("SDF2 | x2: " + sdf2.format(x2)); // Saída: 22/11/2025 15:13:03
        System.out.println("SDF2 | x3: " + sdf2.format(x3)); // Saída: 31/12/1969 21:00:00
        System.out.println("SDF2 | x4: " + sdf2.format(x4)); // Saída: 01/01/1970 02:00:00

        System.out.println("\n\n\n FORMATO UTC: 3 HORAS ADIANTADO");

        // O horário está 3 horas atrasado em relação ao UTC
        // Pois este é o fuso-horário de São Paulo
        System.out.println("SDF2 | x1: " + sdf3.format(x1)); // Saída: 22/11/2025 15:13:03
        System.out.println("SDF2 | x2: " + sdf3.format(x2)); // Saída: 22/11/2025 15:13:03
        System.out.println("SDF2 | x3: " + sdf3.format(x3)); // Saída: 31/12/1969 21:00:00
        System.out.println("SDF2 | x4: " + sdf3.format(x4)); // Saída: 01/01/1970 02:00:00



    }

}
