class GenConsDemo{
	GenCons val1 = new GenCon(33);
	System.out.println("Val 1: " + val1.getVal());
}
class GenCons{
	private double val;
	<T extends Number> GenCon(T o){
		val = o.doubleValue();
	}
	
	public double getVal(){
		return val;
	}
}
