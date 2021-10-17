package calculator;

public class StringCalculator {
	static int count = 0;

	public int GetCalledCount() {
		return count;
	}

	public int add(String numbers) {
		++count;
		int size = numbers.length();
		if (size == 0) {
			return 0;
		}
		int sum = 0;
		String s;
		try {
			for (int i = 0; i < size - 1; i++) {
				if (numbers.charAt(i) == '-' && Character.isDigit(numbers.charAt(i + 1))) {
					throw new MyException(numbers);
				}
			}
		} catch (MyException e) {
			

		}
		for (int i = 0; i < size; i++) {
			if (!Character.isDigit(numbers.charAt(i))) {
				continue;
			} else if (numbers.charAt(i) == '1' && size - i > 3 && Character.isDigit(numbers.charAt(i+1))&& Character.isDigit(numbers.charAt(i+2))&& Character.isDigit(numbers.charAt(i+3))){
				s = numbers.charAt(i) + "" + numbers.charAt(i + 1) + "" + numbers.charAt(i + 2) + ""
						+ numbers.charAt(i + 3);
				int n = Integer.parseInt(s);

				if (n > 1000) {
					i = i + 3;
				}
			} else {
				sum += Integer.parseInt(String.valueOf(numbers.charAt(i)));
			}
		}
		return sum;
	}
}

class MyException extends Exception {
	public MyException(String s) {
		System.err.print("negatives not allowed ");
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '-' && Character.isDigit(s.charAt(i + 1))) {
				System.out.print(s.charAt(i) + "" + s.charAt(i + 1));
			}
		}
	}
}
