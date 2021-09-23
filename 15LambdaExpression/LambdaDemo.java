import java.lang.*;
class LambdaDemo{
	public static void main(String[] args){
		MyNumber num;
		
		num = () -> 223;
		System.out.println(num.getValue());		

		num = () -> Math.random() * 100;
		System.out.println(num.getValue());
	}
}

interface MyNumber{
	double getValue();
}
