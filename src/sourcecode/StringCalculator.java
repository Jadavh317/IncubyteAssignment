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
		
		String number[]=numbers.split(",");
		
		if(number.length==1) {
			return Integer.parseInt(number[0]);
		}
		int sum=0;
		for(int i=0;i<number.length;i++) {
			sum+=Integer.parseInt(number[i]);
		}
		
		return sum;
	}

}
