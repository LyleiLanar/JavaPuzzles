package hu.puzzles.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ZenehallgatasTest extends BaseTest{
    private Zenehallgatas zenehallgatas;

    @BeforeEach
    void setUp() {
        zenehallgatas = new Zenehallgatas();
    }

    @Test
    void testRun1() {
        bemenet = Arrays.asList("3 2", "2 4 3", "6 10");
        elvartKimenet = Arrays.asList("2 1");
        assertThat("Hibás kimenet! Bemenet = " + bemenet, zenehallgatas.run(bemenet), is(elvartKimenet));
    }
}