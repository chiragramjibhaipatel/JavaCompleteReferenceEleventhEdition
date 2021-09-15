class GenMethDemo{
	static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
		for(int i=0; i<y.length; i++){
			if(x.equals(y[i])){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		Integer i = 34;
		Integer[] nums = {1, 2, 3, 4};
		if(GenMethDemo.isIn(i, nums)){
			System.out.println(i + " is in nums");
		} else {
			System.out.println(i + " is not in nums");
		}

		String[] words = {"one", "two", "three"};
		if(GenMethDemo.isIn("one", words)){
			System.out.println("one" + " is in nums");
		} else {
			System.out.println("one" + " is not in nums");
		}
	}
}
