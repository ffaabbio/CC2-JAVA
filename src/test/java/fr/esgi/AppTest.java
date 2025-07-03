package fr.esgi;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testWithAssertJ() {
        String test = "test";
        assertThat(test).isNotNull();
        assertThat(test).isNotBlank();
        assertThat(test).isEqualTo("test");
    }

    @Test
    public void testWithJunit5() {
        String test = "test";
        assertNotNull(test, "String value should not be null");
        assertFalse(test.isEmpty(), "String value should not be empty");
        assertEquals("test", test, "Strings must be equal");
    }

    @Test
    public void shouldTakeSize() {
        Size size = new Size(20, 20);
        Game game = new Game(size);
        assertNotNull(game.getSize(), "Game's size value should not be null");
    }
}
