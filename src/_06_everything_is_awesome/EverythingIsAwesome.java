package _06_everything_is_awesome;

import javax.swing.JOptionPane;

// 1. Create a class called EverythingIsAwesome.

public class EverythingIsAwesome {
	// 2. Add a main method.
	
	public static void main(String[] args) {
		// 3. Use JOptionPane.showInputDialog to ask the user what they like.
		String userAnswer = JOptionPane.showInputDialog("What do you like?"); // Remember: Use a variable to store their answer.
		
		// 4. Use JOptionPane.showMessageDialog to tell them that thing is awesome (e.g. "space is awesome!")
		String response = userAnswer + " is/are awesome!!!!!";
		JOptionPane.showMessageDialog(null, response);
	}

}
