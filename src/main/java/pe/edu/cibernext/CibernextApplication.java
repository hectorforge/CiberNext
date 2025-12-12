package pe.edu.cibernext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:env.properties", ignoreResourceNotFound = true)
public class CibernextApplication {

    public static void main(String[] args) {
        SpringApplication.run(CibernextApplication.class, args);
    }

}
