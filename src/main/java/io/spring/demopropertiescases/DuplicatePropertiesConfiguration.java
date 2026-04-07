package io.spring.demopropertiescases;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DuplicatePropertiesConfiguration {

    @Bean
    @ConfigurationProperties("duplicate.config")
    public DuplicateProperties2 duplicateProperties2() {
        return new DuplicateProperties2();
    }

    static class DuplicateProperties2 {
        String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        Integer foo = 1;

        public Integer getFoo() {
            return foo;
        }

        public void setFoo(Integer foo) {
            this.foo = foo;
        }
    }
}
