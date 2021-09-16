class GenConsDemo{
	public static void main(String [] args){
		GenCons o = new GenCons(33);
		o.showVal();
	}
}

class GenCons{
	Double d;
	<T extends Number> GenCons(T val){
		d = val.doubleValue();
	}
	public void showVal(){
		System.out.println("The Value is :" + d);
	}
}
