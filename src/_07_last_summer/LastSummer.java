/**
 * @fileoverview Goal: Tell the user that you know what they did last summer!
 */

package _07_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		// 1. Use JOptionPane.showInputDialog to ask them their name. 
		// Remember: Use a variable to store their name
		String userName = JOptionPane.showInputDialog("What is your name?");
		
		// 2. Use JOptionPane.showMessageDialog to tell them you know what they did last summer. 
		// (e.g. "I know that you [activity] last summer, [name]. Muhahaha!")
		JOptionPane.showMessageDialog(null, "I know that you ate fish last summer, " + userName);
	}
}
