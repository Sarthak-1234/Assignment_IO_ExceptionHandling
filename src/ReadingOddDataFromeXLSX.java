import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingOddDataFromeXLSX {

	public static void maine(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\DataRead.xlsx"));
		// System.out.println(System.getProperty("user.dir"));
		// C:\Users\sarthakchadha\Desktop\Session 3_Java learning\Session 3_Java
		// learningsrc\DataRead.xlsx
		// C:\Users\sarthakchadha\Desktop\Session 3_Java learning\Session 3_Java
		// learning\src\DataRead.xlsx
		Xls_Reader obj = new Xls_Reader(System.getProperty("user.dir") + "\\DataRead.xlsx");
		int lineNum = 0;
		String line = "";
		while ((line = br.readLine()) != null) {
			lineNum++;
			if (lineNum % 2 != 0) {
				// System.out.println(line);
				System.out.println(obj.getCellData("Sheet1", 0, lineNum)); //Reading data by calling Xls.java
				// continue;
				// else deal with it
			}
		}
	}

}
