package de.rkl.demo.webapp;

import java.io.IOException;
import java.util.Properties;

import javax.enterprise.inject.Produces;

public class HelloWorldBean {
    @Produces @Greeting
    private String createGreeting() throws IOException {
        final Properties greetingProperties = new Properties();
        greetingProperties.load(HelloWorldBean.class.getResourceAsStream("/greeting.properties"));
        return greetingProperties.getProperty("de.rkl.demo.greeting");
    }
}
