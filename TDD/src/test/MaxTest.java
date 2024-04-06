package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.Max;
import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    public void givenMaxOpenedWhenGreaterWithLessValueThenTrue(){
        assertTrue(new Max(4).isIncluded(0.0));
    }

    @Test
    public void givenMaxOpenedWhenGreaterWithGreaterValueThenFalse(){
        assertFalse(new Max(4).isIncluded(5.0));
    }

    @Test
    public void givenMaxOpenedWhenGreaterWithEqualValueThenFalse(){
        assertFalse(new Max(4).isIncluded(4));
    }

}