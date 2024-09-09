package program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\eric-\\OneDrive\\Documentos\\ERIC CURSO\\PROGRAMAÇAO\\JAVA\\program\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			if (sc.hasNextLine()) {
				System.out.println(sc.nextLine());

			}
		} catch (IOException e) {
			System.out.println("error : " + e.getMessage());

		}

		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}