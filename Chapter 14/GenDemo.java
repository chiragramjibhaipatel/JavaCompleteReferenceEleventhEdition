class GenDemo{
	public static void main(String[] args){
		
		Gen<Integer> iOb = new Gen<>(4);
		iOb.showType();
		System.out.println("Value of iOb is: " + iOb.getOb());

		Gen<String> sOb = new Gen<>("message");
		sOb.showType();
		System.out.println("Value of sOb is: " + sOb.getOb());
	}
}

class Gen<T>{

	T ob;

	public Gen(T o){
		ob = o;
	}

	public T getOb(){
		return ob;
	}

	void showType(){
		System.out.println("Type of T is:" + ob.getClass().getName());
	}
}
