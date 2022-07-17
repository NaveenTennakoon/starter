package com.naveen.starter.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student naveen = new Student(
                    "Naveen",
                    "naveen.tennakoon@gmail.com",
                    LocalDate.of(1997, 8, 5),
                    24
            );

            Student sachini = new Student(
                    "Sachini",
                    "sachini.nayanathara@gmail.com",
                    LocalDate.of(1995, 5, 2),
                    27
            );

            repository.saveAll(
                    List.of(naveen, sachini)
            );
        };
    }
}
