package com.redant.coolproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.TimeZone;

@SpringBootApplication
@ComponentScan({"com.redant"})
public class CoolprojectApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Brussels"));
        Locale.setDefault(new Locale("nl",""));
        SpringApplication.run(CoolprojectApplication.class, args);
    }

}
