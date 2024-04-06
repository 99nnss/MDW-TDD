package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import main.Interval;
import org.junit.jupiter.api.Test;

public class IntervalTest {

    @Test
    public void givenIntervalWhenIncludeWithIncludedValueThenTrue(){
        assertTrue(new Interval(-1.7,5555.0).include(0.0));
    }

}