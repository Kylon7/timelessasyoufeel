package com.kylon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimeRunApplication {
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication application = new SpringApplication(TimeRunApplication.class);
        application.run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  Time less as you feel 启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}