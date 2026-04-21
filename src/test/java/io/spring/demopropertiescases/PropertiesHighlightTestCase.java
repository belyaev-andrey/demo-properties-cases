package io.spring.demopropertiescases;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
        "foo=BAR"
})
public class PropertiesHighlightTestCase {

    @Test
    void testProperty() {

    }

}
