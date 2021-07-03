import java.io.FileInputStream;
import java.io.InputStream;

public class IOTest01 {

	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("C:/Temp/test00.txt");
		
		int c;
		while ((c = in.read()) != -1) {
			System.out.println(c);
		}
	}

}
