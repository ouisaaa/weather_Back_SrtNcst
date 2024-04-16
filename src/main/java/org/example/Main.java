package org.example;


//import org.example.repository.ReportRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//@EnableMongoRepositories(basePackageClasses = ReportRepository.class)
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}