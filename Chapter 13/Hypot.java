import static java.lang.Math.*;

class Hypot{
	public static void main(String[] args){
		double sideA, sideB;
		double hypot;
		sideA = 2.0;
		sideB = 4.0;
		hypot = sqrt(pow(sideA, 2.0) + pow(sideB, 2.0));
		System.out.println("Given sides of lenth " + sideA + " and " + sideB + " the hypoteneous is " + hypot);
	}
}
