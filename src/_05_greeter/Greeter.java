package _05_greeter;

import javax.swing.JOptionPane;

// 1. Create a class called Greeter.

public class Greeter {
	
	// 2. Add a main method.

	public static void main(String[] args) {
		// 3. Ask the user for their name:
		String nameInput = JOptionPane.showInputDialog("What is your name?");
		
		// 4. Say hi to them:
		String response = "Hey " + nameInput + ", how are you today?";
		JOptionPane.showMessageDialog(null, response);
	}
}
