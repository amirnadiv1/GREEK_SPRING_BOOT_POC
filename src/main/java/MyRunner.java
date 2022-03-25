package com.zetcode;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private MessageSource messageSource;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(messageSource.getMessage("w1",
                null, Locale.GERMAN));
        System.out.println(messageSource.getMessage("w1",
                null, Locale.ENGLISH));
        System.out.println(messageSource.getMessage("w1",
                null, new Locale("sk", "SK")));

        System.out.println(messageSource.getMessage("w1",
                null, new Locale("gr", "GR")));
    }
}