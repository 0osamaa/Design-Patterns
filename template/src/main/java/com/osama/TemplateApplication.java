package com.osama;

import com.osama.repo.Game;
import com.osama.service.Cricket;
import com.osama.service.Football;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);

        Game football = new Football();
        football.play();
        System.out.println();
        Game cricket = new Cricket();
        cricket.play();
    }

}
