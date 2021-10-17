package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorShould {
	StringCalculator stringCalculator = new StringCalculator();

	@Test
    public void empty_string_should_return_0() {
        
        assertEquals(0, stringCalculator.add(""));
    }
	@Test
	public void string_with_single_number_should_return_number_as_int() {
		assertEquals(1,stringCalculator.add("1"));
	}
	@Test
	public void string_with_double_number_should_return_sum_of_numbers_as_int() {
		assertEquals(3,stringCalculator.add("1,2"));
	}

}
