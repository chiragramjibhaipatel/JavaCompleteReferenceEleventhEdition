class LambdaExceptionDemo{
	public static void main(String[] args) throws EmptyArrayException{
		DoubleNumericFunction f;
		f = d ->  {
			if (d.length == 0){
				throw new EmptyArrayException();
			}
			double sum = 0;
			for(int i=0; i<d.length; i++){
				sum += d[i];
			}		
			return sum / d.length;	
		};

		System.out.println(f.func(new double[0]));
	}
}

interface DoubleNumericFunction{
	double func(double[] d) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
	EmptyArrayException(){
		super("Empty Array");
	}
}
