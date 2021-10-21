package hu.puzzles.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SipalyaTest extends BaseTest{
    private Sipalya sipalya;

    @BeforeEach
    void setUp() {
        sipalya = new Sipalya();
    }

    @Test
    void run() {
        bemenet = Arrays.asList("7", "0", "150", "200", "0", "57", "0", "30");
        elvartKimenet = Arrays.asList("3", "2", "1 4 6");
        assertThat("Hibás kimenet! Bemenet = " + bemenet, sipalya.run(bemenet), is(elvartKimenet));
    }
}