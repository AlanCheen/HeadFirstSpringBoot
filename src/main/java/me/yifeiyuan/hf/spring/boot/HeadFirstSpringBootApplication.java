package me.yifeiyuan.hf.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;

@SpringBootApplication
public class HeadFirstSpringBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HeadFirstSpringBootApplication.class, args);
        printInfo(context);
    }

    private static void printInfo(ConfigurableApplicationContext context) {
        ConfigurableEnvironment environment = context.getEnvironment();
        String port = environment.getProperty("server.port");
        System.out.println("Port:" + port);//null 哪里出了问题?
    }

}
