import java.io.*;

class CopyFile{
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("Usage: java <source_file> <destination_file>");
			return;
		}
		try(var fin  = new FileInputStream(args[0]);
		    var fout = new FileOutputStream(args[1])){
			int i;
			do{
				i = fin.read();
				if(i != -1) fout.write(i);
			}while(i != -1);
		
		}catch(IOException e){
			System.out.println("Some Error while processing files");
		}
	}
}
