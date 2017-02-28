package pan;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Pangram {

	static int N;
	static String[] Alph = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", "z" };
	static String[] phrases;

	public Pangram() {
		// TODO Auto-generated constructor stub
	}
	
	static boolean checkString(String S){
		Boolean b = false;
		int i = 0;
		for (int j = 0; j < Alph.length; j++) {
			//CharSequence Alphi ;
			if(S.contains(Alph[i])){
				b = true;
				j = Alph.length + 10;
			}
		}
		
		return b;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a phrase : ");
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		int i = 0;
		
		if(checkString(S)){
			System.out.println("Pangram");
		}else{
			System.out.println("Try Again");
		}
		
	}

}
