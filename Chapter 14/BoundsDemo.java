class BoundsDemo{
	
	public static void main(String[] args){
		
		Double[] dNumbers = {1.0, 3.0, 4.0 };
		Stats<Double> stats = new Stats<>(dNumbers);
		System.out.println("Average of dNumbers is " + stats.average());

		Integer[] iNumbers = {1, 3, 4};
		Stats<Integer> iStats = new Stats<>(iNumbers);
		System.out.println("Average of iNumbers is: " + iStats.average());
	
		if(stats.sameAverage(iStats)){
			System.out.println("Average of iNumbers and dNumbers are same");
		} else {
			System.out.println("Average of iNumbers and dNumbers are not same");
		}
	}
}


class Stats<T extends Number>{
	T[] numbers;
	public Stats(T[] o){
		numbers = o;
	}

	double average(){
		double sum = 0.0;
		for(int i=0; i<numbers.length; i++){
			sum += numbers[i].doubleValue();
		}
		return sum / numbers.length;
	}
	
	boolean sameAverage(Stats<?> that){
		if(average() == that.average()){
			return true;
		}
		return false;

	}
}
