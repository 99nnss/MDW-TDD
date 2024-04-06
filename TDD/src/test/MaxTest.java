package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.Max;
import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    public void givenMaxOpenedWhenGreaterWithLessValueThenTrue(){
        assertTrue(new Max(4, true).greaterOrEquals(0.0));
    }

    @Test
    public void givenMaxOpenedWhenGreaterWithGreaterValueThenFalse(){
        assertFalse(new Max(4, true).greaterOrEquals(5.0));
    }

    @Test
    public void givenMaxOpenedWhenGreaterWithEqualValueThenFalse(){
        assertFalse(new Max(4, true).greaterOrEquals(4));
    }

    @Test
    public void givenMaxClosedWhenGreaterWithLessValueThenTrue(){
        assertTrue(new Max(4, false).greaterOrEquals(0.0));
    }

    @Test
    public void givenMaxClosedWhenGreaterWithGreaterValueThenFalse(){
        assertFalse(new Max(4, false).greaterOrEquals(5.0));
    }

    @Test
    public void givenMaxClosedWhenGreaterWithEqualValueThenFalse(){
        assertTrue(new Max(4, false).greaterOrEquals(4));
    }

}