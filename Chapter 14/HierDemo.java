class HierDemo{
	public static void main(String[] args){
		Gen<Integer> iGen = new Gen<>(11);
		Gen2<Integer> iGen2 = new Gen2<>(3);
		Gen2<String> sGen2 = new Gen2<>("Hello");
		
		//check if iGen is an instance of Gen
		if(iGen instanceof Gen<?>){
			System.out.println("iGen in an instance of Gen");
		}
		
		//check if iGen in an instance of Gen2
		if(iGen instanceof Gen2<?>){
			System.out.println("iGen is an instance of Gen2");
		} else {
			System.out.println("iGen is not an instance of Gen2");
		}

		//check of iGen2 is an instance of Gen and Gen2
		if(iGen2 instanceof Gen<?>){
			System.out.println("iGen2 is an instance of Gen");
		}
		if(iGen2 instanceof Gen2<?>){
			System.out.println("iGen2 is an instance of Gen2");
		}
	}
}

class Gen<T>{
	T val;
	Gen(T v){
		val = v;
	}
}
class Gen2<T> extends Gen<T>{
	Gen2(T o){
		super(o);
	}
}
