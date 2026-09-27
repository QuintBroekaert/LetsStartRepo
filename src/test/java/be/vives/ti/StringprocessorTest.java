package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class StringprocessorTest {
    private Stringprocessor stringprocessor;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        stringprocessor = new Stringprocessor();
    }
    @Test
    void addToEmpty(){
        stringprocessor.appendIfMissing("test");
        assertThat(stringprocessor.getString().equals("test"));
    }
    @Test
    void appendToEsistingSuffix(){
        stringprocessor.appendIfMissing("123test");
        stringprocessor.appendIfMissing("test");
        assertThat(stringprocessor.getString().equals("123test"));
    }
}