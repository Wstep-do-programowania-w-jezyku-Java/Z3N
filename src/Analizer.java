import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Analizer {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc=new Scanner(new File("kilometry.dat"));
		Calculator c=new Calculator(sc);
		while(sc.hasNextLine())
			try
		{
			System.out.println(c.parseLine());
		}
		catch(DivisionByZeroException e) {
			System.out.println("Liczba spalonych litrów wynosi 0.");
		}
	}

}

class Calculator{
	private Scanner sc;
	public Calculator(Scanner sc) {
		this.sc=sc;
	}
	
	double parseLine() throws DivisionByZeroException{
		double result=0;
		String s1,s2;
		StringTokenizer st=new StringTokenizer(sc.nextLine());
		s1=st.nextToken();
		s2=st.nextToken();
		int i1=Integer.parseInt(s1);
		int i2=Integer.parseInt(s2);
		if (i2==0) throw new DivisionByZeroException();
		result=((double)i1)/((double)i2);
		return result;
	}
}

class DivisionByZeroException extends Exception{
	public DivisionByZeroException() {
		super("Dzielenie przez zero !");
	}
}
