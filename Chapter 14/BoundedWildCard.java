class BoundedWildCard{
	public static void main(String[] args){

		TwoD[] td = { new TwoD(0 ,0), new TwoD(1, 0)};
		Coords<TwoD> tdPoints = new Coords<>(td);
		System.out.println("Two-D Coordinates");
		showXY(tdPoints);

		ThreeD threeD[] = { new ThreeD(1, 2, 3), new ThreeD(0, 0, 0) };
		Coords<ThreeD> threeDPoints = new Coords<>(threeD);
		System.out.println("Three-D Coordinates");
		showXY(threeDPoints);
		showXYZ(threeDPoints);
		
		FourD fourD [] = {new FourD(0, 0, 0, 0), new FourD(1, 2, 3, 4)};
		Coords<FourD> fourDPoints = new Coords<>(fourD);	
		System.out.println("Four-D Coordinates");
		showXY(fourDPoints);
		showXYZ(fourDPoints);
		showXYZT(fourDPoints);
	}

	static void showXY(Coords<?> c){
		for(int i=0; i<c.coords.length; i++){
			System.out.println(c.coords[i].x + " " + c.coords[i].y);
		}
	}
	
	static void showXYZ(Coords<? extends ThreeD> c){
		for(int i=0; i<c.coords.length; i++){
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
		}
	}	
	
	static void showXYZT(Coords<? extends FourD> c){
		for(int i=0; i<c.coords.length; i++){
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
		}
	}




	
}

class TwoD{
	int x, y;
	public TwoD(int a, int b){
		x = a;
		y = b;
	}
}
class ThreeD extends TwoD{
	int z;
	public ThreeD(int a, int b, int c){
		super(a, b);
		z = c;
	}
}
class FourD extends ThreeD{
	int t;
	public FourD(int a, int b, int c, int d){
		super (a, b, c);
		t = d;
	}
}

class Coords<T extends TwoD>{
	T[] coords;
	Coords(T[] o){
		coords = o;
	}
}
