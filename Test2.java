package pkg1;
import java.io.FileWriter;
import java.io.IOException;
public class Test2 {

	public static void main(String[] args)throws IOException {
		int date1=20241215;
		FileWriter fw1=new FileWriter("transactions_"+date1+ ".txt");
		fw1.write("Ramya: 6000"+"\n");
		fw1.write("Sowmya :12000"+"\n");
		fw1.close();
		
				

	}

}
