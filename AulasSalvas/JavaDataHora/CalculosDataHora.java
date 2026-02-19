package JavaDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Subtraindo uma semana
        LocalDate semanaPassadaLocalDate = d04.minusWeeks(1);
        LocalDate semanaSeguinteLocalDate = d04.plusDays(7);

        LocalDateTime semanaSeguinte = d05.plusDays(7);
        LocalDateTime semanaPassada = d05.minusWeeks(1);

        Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant semanaSeguinteInstant = d06.minus(7, ChronoUnit.DAYS);

        System.out.println(d04);
        System.out.println(semanaPassadaLocalDate);
        System.out.println(semanaSeguinteLocalDate);

        System.out.println(semanaSeguinte);
        System.out.println(semanaPassada);

        System.out.println(semanaSeguinteInstant);
        System.out.println(semanaPassadaInstant);

        // Calcular duração (Espaço de tempo entre duas dataHora)

        // Duration t1 = Duration.between(semanaPassadaLocalDate.atTime(0, 0), d04.atTime(0, 0));
        Duration t1 = Duration.between(semanaPassadaLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(semanaPassada, d05);
        Duration t3 = Duration.between(semanaPassadaInstant, d06);

        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());

    }

}
