package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.Interval;
import org.junit.jupiter.api.Test;

public class IntervalTest {

    @Test
    public void givenIntervalWhenIncludeWithIncludedValueThenTrue(){
        assertTrue(new Interval(-1.7,5555.0).include(0.0));
    }

    @Test
    public void givenIntervalWhenIncludeWithNotIncludedValueThenFalse(){
        assertFalse(new Interval(-1.7,5555.0).include(9000.0));
    }

}