package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.IncludedMax;
import org.junit.jupiter.api.Test;

public class IncludedMaxTest {


    @Test
    public void givenMaxClosedWhenGreaterWithLessValueThenTrue(){
        assertTrue(new IncludedMax(4).isIncluded(0.0));
    }

    @Test
    public void givenMaxClosedWhenGreaterWithGreaterValueThenFalse(){
        assertFalse(new IncludedMax(4).isIncluded(5.0));
    }

    @Test
    public void givenMaxCloseWhenGreaterWithEqualValueThenFalse(){
        assertTrue(new IncludedMax(4).isIncluded(4));
    }

}