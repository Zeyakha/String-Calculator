package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorShould {
	StringCalculator stringCalculator = new StringCalculator();

	@Test
    public void empty_string_should_return_0() {
        
        assertEquals(0, stringCalculator.add(""));
    }

}
