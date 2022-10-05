public class ReverseNum{

	 static int rev(int n) {

		int digit=(int)(Math.log10(n))+1;
		return helper(n,digit);
	 }

	 static int helper(int n,int digit)
	 {

		if(n%10==n){
			return n;  
		}
		int rem=n%10;
		return rem*(int)(Math.pow(10,digit-1))+helper(n/10, digit-1);
	 }
	 public static void main(String[] args) {
		int n=123;

		int rev=rev(123);
		System.out.println(rev);

	 }




}