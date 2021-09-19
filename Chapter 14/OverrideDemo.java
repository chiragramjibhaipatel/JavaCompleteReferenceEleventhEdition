class OverrideDemo{
	public static void main(String [] args){
		Gen<Integer> iOb1 = new Gen<>(11);
		Gen2<Integer, String> iOb = new Gen2<>(33, "message");
		System.out.println(iOb1.getOb());
		System.out.println(iOb.getOb());
	}
}

class Gen<T>{
	T ob; 
	Gen(T o){
		ob = o;
	}
	T getOb(){
		System.out.println("Gen's getOb");
		return ob;
	}
}

class Gen2<T, V> extends Gen<T>{
	V val;
	Gen2(T o, V v){
		super(o);
		val = v;
	}
	T getOb(){
		System.out.println("Gen2's getOb");
		return ob;
	}

	/*
	be cautious, following two functions have same erasure, this won't compile
	void printThis(V v){
		System.out.println(v);
	}

	void printThis(T t){
		System.out.println(t);
	}
	*/
}
