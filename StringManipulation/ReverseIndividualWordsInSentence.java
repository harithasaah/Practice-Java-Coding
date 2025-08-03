/******************************************************************************
 
ReverseIndividualWordsInASentence
 
Input : "Java is Pure"
Output : "avaJ si eruP"
 
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		//use .split(" ")
		String[] words = sentence.split(" ");

		//output 
		StringBuilder str = new StringBuilder();
		for(String s:words){
		    str.append(new StringBuilder(s).reverse().toString()).append(" ");
		}
		System.out.println(str);
	}
}