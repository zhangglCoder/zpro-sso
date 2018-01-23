package cn.zpro.sso.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhanggl
 */
@SpringBootApplication(scanBasePackages = {"cn.zpro.sso"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
