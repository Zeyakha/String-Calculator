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
	@Test
	public void allow_the_add_method_to_handle_new_lines_between_numbers_instead_of_commas(){
		assertEquals(6,stringCalculator.add("1\n2,3"));
	}
	@Test
	public void  support_different_delimiters() {
		assertEquals(3,stringCalculator.add("//;\\n1;2"));
	}
	@Test
	public void numbers_bigger_than_1000_should_be_ignored() {
		assertEquals(2,stringCalculator.add("21001"));
	}
	@Test
	public void delimiters_can_be_of_any_length() {
		assertEquals(6,stringCalculator.add("//[***]\\n1***2***3"));
	}
	@Test
	public void allow_multiple_delimiters_like_this() {
		assertEquals(6,stringCalculator.add("//[*][%]\\n1*2%3"));
		
	}
	@Test
	public void make_sure_you_can_also_handle_multiple_delimiters_with_length_longer_than_one_char() {
		assertEquals(6,stringCalculator.add("//[**][%%]\\n1**2%%3"));
	}

}
