class TwoGen{
	public static void main(String[] args){
		Gen<Integer, String> obj = new Gen<>(4, "this is message");
		obj.showTypes();
	}
}

class Gen<T, V>{
	T ob1;
	V ob2;
	
	public Gen(T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}

	public void showTypes(){
		System.out.println("Type of T is: " + ob1.getClass().getName() + " and Type of V is:  " + ob2.getClass().getName());
	}
}
