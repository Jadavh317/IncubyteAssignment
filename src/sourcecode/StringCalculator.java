package sourcecode;

public class StringCalculator {

	public int addNum(String numbers) {
		if (numbers == null) {
			throw new IllegalArgumentException("Numbers must not be null");
		}
		numbers = numbers.trim();
		if (numbers.equals("")) {
			return 0;
		}

		return 0;
	}

}
