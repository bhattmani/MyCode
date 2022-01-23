package MyPractise;

public class PalindromeNumber {
	public static void main(String[] args){
		PalindromeNumber sum = new PalindromeNumber();
		boolean msg = sum.isPalindrome(121);
			System.out.println(msg);
	}
		
	public boolean isPalindrome(int x) {
        int pal = 0;
        int oldNum = x;
        while(x!=0){
            int mod = x%10;
            pal = pal*10 + mod;
            x = x/10;
        }
		if(pal==oldNum && oldNum>=0){
            return true;
        }else{
            return false;
        }
    }
}
