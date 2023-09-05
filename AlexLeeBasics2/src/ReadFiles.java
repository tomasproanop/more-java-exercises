import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFiles {

	public static void main(String[] args) throws IOException {
		
		File file = new File("/home/tomas/Desktop/2701-0.txt");
		Scanner scan = new Scanner(file);
		
		String fileContent = "made by us!!!!!! \n";
		while(scan.hasNextLine()) {
			//System.out.println(scan.nextLine()); prints each lin
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		//System.out.println(scan.nextLine());
		
		FileWriter writer = new FileWriter("/home/tomas/Desktop/hello.txt");
		writer.write(fileContent);
		writer.close();	
		}

}
