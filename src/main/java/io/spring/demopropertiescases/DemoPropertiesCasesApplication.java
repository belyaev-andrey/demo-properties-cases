package io.spring.demopropertiescases;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ParentProperties.class, DuplicateProperties.class, MyServerProperties.class})
public class DemoPropertiesCasesApplication implements CommandLineRunner {

    private final DuplicatePropertiesConfiguration.DuplicateProperties2 duplicateProperties2;
    private final DuplicateProperties duplicateProperties;

    public DemoPropertiesCasesApplication(DuplicatePropertiesConfiguration.DuplicateProperties2 duplicateProperties2, DuplicateProperties duplicateProperties) {
        this.duplicateProperties2 = duplicateProperties2;
        this.duplicateProperties = duplicateProperties;
    }

    static void main(String[] args) {
        SpringApplication.run(DemoPropertiesCasesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        duplicateProperties.setData("dataTest1");
        duplicateProperties2.setData("dataTest2");
    }
}
