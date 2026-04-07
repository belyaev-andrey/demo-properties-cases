package io.spring.demopropertiescases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ParentProperties.class, DuplicateProperties.class})
public class DemoPropertiesCasesApplication {

    static void main(String[] args) {
        SpringApplication.run(DemoPropertiesCasesApplication.class, args);
    }

}
