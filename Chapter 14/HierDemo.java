class HierDemo{
	public static void main(String[] args){
		Gen2<Integer, String> iOb = new Gen2<>(3, "message");	
		iOb.showValue();	
	}
}

class Gen<T>{
	T val;
	Gen(T v){
		val = v;
	}
	void showValue(){
		System.out.println("(in super class)Value of val is: " + val);
	}
}
class Gen2<T, V> extends Gen<T>{
	V ob;
	Gen2(T o, V v){
		super(o);
		ob = v;
	}
	void showValue(){
		super.showValue();
		System.out.println("(in sub class)Value of ob is: " + ob);
	}
}
