package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import main.Max;
import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    public void givenMaxWhenGreaterWithLessValueThenTrue(){
        assertTrue(new Max(true, 4).greater(0.0));
    }

}