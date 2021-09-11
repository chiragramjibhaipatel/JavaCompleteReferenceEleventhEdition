class Hypot{
	public static void main(String[] args){
		double sideA, sideB;
		double hypot;
		sideA = 2.0;
		sideB = 4.0;
		hypot = Math.sqrt(Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0));
		System.out.println("Given sides of lenth " + sideA + " and " + sideB + " the hypoteneous is " + hypot);
	}
}
