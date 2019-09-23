package _04_knock_knock;

import javax.swing.JOptionPane;

// 1. Create a class called KnockKnock.

public class KnockKnock {
	
	// 2. Add a main method.

	public static void main(String[] args) {
		// 3. Find your favorite knock-knock joke.
		// Use pop-ups to display each line of the joke:
		
		JOptionPane.showMessageDialog(null, "Knock knock");
		JOptionPane.showMessageDialog(null, "Who's there?");
		JOptionPane.showMessageDialog(null, "Interrupting cow");
		JOptionPane.showMessageDialog(null, "Interrupting cow wh--");
		JOptionPane.showMessageDialog(null, "Mooooo!!!");
	}
}
