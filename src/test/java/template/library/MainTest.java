package template.library;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    public void shouldReturnHelloWorld() {
        String result = Main.hello();
        assertThat(result).isEqualTo("Hello World!");
    }

}





