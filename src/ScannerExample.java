import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(new File("kilometry.dat"));
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());
		}
		catch(FileNotFoundException e) {
			System.out.println("Nie znaleziono pliku kilometry.dat");
		}

	}

}
