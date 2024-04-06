package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.Interval;
import org.junit.jupiter.api.Test;

public class IntervalTest {

    @Test
    public void givenIntervalWhenIncludeWithIncludedValueThenTrue(){
        assertTrue(new Interval(true, -1.7, true, 5555.0).include(0.0));
    }

    @Test
    public void givenIntervalWhenIncludeWithNotIncludedValueThenFalse(){
        assertFalse(new Interval(true, -1.7,true, 5555.0).include(9000.0));
    }

    @Test
    public void givenIntervalWhenIncludeWithLimitValueThenFalse(){
        assertFalse(new Interval(true, -1.7,true, 5555.0).include(5555.0));
    }

}