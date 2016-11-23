
import java.util.HashMap;
import java.util.Scanner;


public class MolarMass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXELEMENT = 5;
		String[] element = new String [MAXELEMENT];
		String[] number = new String [MAXELEMENT];
		int eIndex = 0;
		boolean gotNumber = false; 
		HashMap periodic = new HashMap();
		periodic.put("C", new Double(12.01));
		periodic.put("N", new Double(14.01));
		periodic.put("O", new Double(16));
		periodic.put("H", new Double(1.01));
		periodic.put("Cl", new Double(35.45));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the formula");
		String formula = scan.nextLine();
		for (int i=0; i<MAXELEMENT; i++) {
			element[i] = new String();
			number[i] = new String();
		}
		
		for (int i=0; i<formula.length(); i++){
			if (Character.isLetter(formula.charAt(i))) {
				if (gotNumber){
					eIndex++;
					gotNumber = false; 
				}
				element[eIndex]+= formula.charAt(i);
			}
			
			else {
				number[eIndex]+= formula.charAt(i);
				gotNumber = true;
			}
			
		}
		
		double molarMass = 0.0;
		for (int i=0; i<=eIndex; i++){
			System.out.println("Element is: " + element[i] + " Number is: " + number[i]);
			double weight = ((Double)periodic.get(element[i])).doubleValue();
			molarMass+= weight*Integer.parseInt(number[i]);
			
		}
		System.out.println(molarMass);
	}

}
