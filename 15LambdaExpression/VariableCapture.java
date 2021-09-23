class VariableCapture{
	public static void main(String[] args){
		int n = 3;
		MyFunc f = num -> {
			int res = num + n;
//			n++;
			return res;
			
		};
		System.out.println(f.func(33));		
	}
}

interface MyFunc{
	int func(int n);
}
