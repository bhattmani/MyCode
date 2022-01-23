package MyPractise;

public class RomanToInteger {
	public static void main(String[] args){
		RomanToInteger convert = new RomanToInteger();
		int integer = convert.romanToInt("MCMXCIV");
		System.out.print(integer);
	}

	private int romanToInt(String s) {
		int sum = 0;
		for (int i=0;i<s.length();i++){			
			int val1 = getIntValue(s.charAt(i));
			if(i<s.length()-1){
				int val2 = getIntValue(s.charAt(i+1));
				if(val1 < val2){
					val1 = val2-val1;
					i++;
				}
				val2=0;
			}
			sum = sum+val1;
		}
		return sum;
	}

	private int getIntValue(char ch) {
		int n = 0;
		if(ch=='M'){
			n=1000;
		}else if(ch=='D'){
			n=500;
		}else if(ch=='C'){
			n=100;
		}else if(ch=='L'){
			n=50;
		}else if(ch=='X'){
			n=10;
		}else if(ch=='V'){
			n=5;
		}else if(ch=='I'){
			n=1;
		}
		return n;
	}
}
