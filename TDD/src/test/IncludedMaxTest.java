package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import main.IncludedMax;
import org.junit.jupiter.api.Test;

public class IncludedMaxTest {

    @Test
    public void givenMaxClosedWhenGreaterWithLessValueThenTrue(){
        assertTrue(new IncludedMax(4).isOnLeft(0.0));
    }

}