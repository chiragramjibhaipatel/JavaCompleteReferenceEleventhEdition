class HierDemo{
	public static void main(String[] args){
		Gen2<Integer> iOb = new Gen2<>(3);	
		iOb.showValue();	
	}
}

class Gen<T>{
	T ob;
	Gen(T o){
		ob = o;
	}
	public void showValue(){
		System.out.println("Value of ob is: " + ob);
	}
	T getObj(){
		return ob;
	}
}
class Gen2<T> extends Gen<T>{
	Gen2(T o){
		super(o);
	}
}
