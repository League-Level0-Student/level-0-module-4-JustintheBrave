package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String score = JOptionPane.showInputDialog("What did you get on the test");
double test = Double.parseDouble(score);
if(test>= 80) {
	JOptionPane.showMessageDialog(null, "you must've studied really hard to get a " + test);
}
if(test<= 79.99999999999999999999999999999999999999999999999999999999999) {
	JOptionPane.showMessageDialog(null, "Maybe you should try harder next time becuase you only got a " + test);
}
		
		
	}

}
