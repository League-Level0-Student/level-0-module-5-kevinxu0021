import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
	String input = JOptionPane.showInputDialog("Pick a number");
	
	int number = Integer.parseInt(input);
	
	boolean isPrime = true;
	for (int i = 2; i < number; i++) {
		if(number % i == 0) {
		isPrime = false;
		
		break;
		}
	}
	if(isPrime == true) {
		JOptionPane.showMessageDialog(null, "The number " + number + " is prime.");
	}else if(isPrime == false) {
		JOptionPane.showMessageDialog(null, "The number " + number + " is not prime.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
