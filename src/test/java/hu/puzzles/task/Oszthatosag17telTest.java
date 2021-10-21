package hu.puzzles.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class Oszthatosag17telTest extends BaseTest{
    private Oszthatosag17tel oszthatosag17tel;

    @BeforeEach
    void setUp() {
        oszthatosag17tel = new Oszthatosag17tel();
    }

    @Test
    void testRun1() {
        bemenet = Arrays.asList("132770");
        elvartKimenet = Arrays.asList("IGEN", "13277 1292 119");
        assertThat("Hibás kimenet! Bemenet = " + bemenet, oszthatosag17tel.run(bemenet), is(elvartKimenet));
    }

    @Test
    void testRun2() {
        bemenet = Arrays.asList("132771");
        elvartKimenet = Arrays.asList("NEM", "13272 1317 96");
        assertThat("Hibás kimenet! Bemenet = " + bemenet, oszthatosag17tel.run(bemenet), is(elvartKimenet));
    }

    @Test
    void testRun3() {
        bemenet = Arrays.asList("51");
        elvartKimenet = Arrays.asList("IGEN", "0");
        assertThat("Hibás kimenet! Bemenet = " + bemenet, oszthatosag17tel.run(bemenet), is(elvartKimenet));
    }

    @Test
    void testRun4() {
        bemenet = Arrays.asList("27");
        elvartKimenet = Arrays.asList("NEM", "");
        assertThat("Hibás kimenet! Bemenet = " + bemenet, oszthatosag17tel.run(bemenet), is(elvartKimenet));
    }

}