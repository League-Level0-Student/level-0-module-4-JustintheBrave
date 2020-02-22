package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	 static int happinessLevel = 0;
	 static String pet;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
pet = JOptionPane.showInputDialog("what pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).)
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What are you gonna do to make ur " + pet + " happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "pet", "feed", "groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void petpet() {
		JOptionPane.showMessageDialog(null, "your " + pet + "made a happy sound");
	}
}