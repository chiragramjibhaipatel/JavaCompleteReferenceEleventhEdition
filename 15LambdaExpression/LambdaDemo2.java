class LambdaDemo2{
	public static void main(String[] args){
		NumberTest isPositive;

		isPositive = val -> val>0;
		
		int n = 3;
		System.out.println(n + " is positive: " + isPositive.test(n) );

		n = -5;
		System.out.println(n + " is positive: " + isPositive.test(n) );
				 
		NumberTest isEven;
		isEven = val -> val%2 == 0;

		
		System.out.println(n + " is even: " + isEven.test(n) );

	}
}
interface NumberTest{
	boolean test(int n);
}
