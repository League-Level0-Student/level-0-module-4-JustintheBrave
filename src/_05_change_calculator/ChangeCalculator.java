package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nick = JOptionPane.showInputDialog("How many nickel u have?");
		// Convert their answer to an int using Integer.parseInt()
int nickel = Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
String dime = JOptionPane.showInputDialog("How many dime u have?");
int dimes = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
String quarter = JOptionPane.showInputDialog("How many quarter u have?");
		// Calculate how much money the user has and save it in a double variable 
int quart = Integer.parseInt(quarter);
		// Tell the user how much money they have

double total = (quart * 0.25) + (nickel * 0.05) + (dimes * 0.1);

JOptionPane.showMessageDialog(null, "you have " + total);

	}
}

