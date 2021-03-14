package com.mvoland.cov19api;

import com.mvoland.cov19api.data.entity.CovidHospitIncidRegEntity;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

@SpringBootApplication
public class Cov19Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Cov19Application.class);


    public static void main(String[] args) {
        new SpringApplicationBuilder(Cov19Application.class).run(args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            LOGGER.info("** START CLR **");

            LOGGER.info("** END   CLR **");
        };
    }


}