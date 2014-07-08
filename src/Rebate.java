import java.io.*;
import java.util.*;
import java.text.*;
/**
* author: Moises Holguin
* date: Monday, November 26, 2012
* UTCS Problem #1
*/
public class Rebate {
	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		Scanner infile = new Scanner(new File("rebate.dat"));
	    infile.nextLine();
		int count = 0;
		
		while(infile.hasNext()) {
			if(count++!=0)
				System.out.println();
			
			String name = infile.nextLine();
			int num = Integer.parseInt(infile.nextLine());
			double total = 0;
			
			while(num-->0)
				total+=Double.parseDouble(infile.nextLine());
			
			double untaxedTotal = total/1.0825;
			double rebate = untaxedTotal*.1;
			
			System.out.println(name +" spent " + df.format(untaxedTotal)+" before taxes.\nThis qualifies "+name+" for a rebate of "+ df.format(rebate)+".");
		}
	}
}