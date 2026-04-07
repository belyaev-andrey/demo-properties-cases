package io.spring.demopropertiescases;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/props")
class PropertiesController {

    private final ParentProperties parentProperties;
    private final DuplicateProperties duplicateProperties;
    private final DuplicatePropertiesConfiguration.DuplicateProperties2 duplicateProperties2;
    private final Environment environment;

    PropertiesController(ParentProperties parentProperties, DuplicateProperties duplicateProperties, DuplicatePropertiesConfiguration.DuplicateProperties2 duplicateProperties2, Environment environment) {
        this.parentProperties = parentProperties;
        this.duplicateProperties = duplicateProperties;
        this.duplicateProperties2 = duplicateProperties2;
        this.environment = environment;
    }

    @GetMapping("nested")
    public ResponseEntity<String> getNestedProperties() {
        String a = parentProperties.getNested().getA();
        return ResponseEntity.ok("custom.config.nest.a: %s".formatted(a));
    }

    @GetMapping("duplicate")
    public ResponseEntity<String> getDuplicates() {
        String a = duplicateProperties.getData();
        String b = duplicateProperties2.getData();
        String c = environment.getProperty("duplicate.config.data");
        return ResponseEntity.ok("duplicate.config.data 1: %s and 2: %s, env: %s".formatted(a, b, c));
    }

}
