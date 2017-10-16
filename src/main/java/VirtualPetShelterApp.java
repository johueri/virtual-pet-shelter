import java.util.Scanner;

public class VirtualPetShelterApp {
	static int choice; // Donnie says making these static was overkill for this particular application.
	static Scanner input = new Scanner(System.in); // Also said we would have a better understanding of this next week.

	public static void main(String[] args) {
		// https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/tree/master/exercises/virtual-pet-shelter

		VirtualPetShelter myShelter = new VirtualPetShelter();

		VirtualPet pet1 = new VirtualPet("Cliff", "is a big red dog.", 60, 60, 60, 60, 60);
		VirtualPet pet2 = new VirtualPet("Charl", "is a gregarious spider.", 20, 20, 20, 20, 20);
		VirtualPet pet3 = new VirtualPet("Hank", "a cowdog and retired head of ranch security.", 40, 40, 40, 40, 40);
		VirtualPet pet4 = new VirtualPet("Jar.J", "No one is really sure what he is...but he's definitely the worst.",
				30, 30, 30, 30, 30);

		myShelter.add(pet1);
		myShelter.add(pet2);
		myShelter.add(pet3);
		myShelter.add(pet4);

		System.out.println("Welcome to the Franklin County Animal Shelter!");
		System.out.println("");
		System.out.println("This is the status of our current pets");
		System.out.println("|Name\t" + "|Hunger\t" + "|Thirst\t" + "|Boredom" + "|\t");

		for (VirtualPet current : myShelter.petStats()) {
			System.out.println("|" + current.getName() + "\t|" + current.getHunger() + "\t|" + current.getThirst()
					+ "\t|" + current.getBordeom() + "\t|");
		}

		do {
			System.out.println("\nWhat would you like to do?");
			System.out.println("Press 1 to feed all the pets");
			System.out.println("Press 2 to give water to all the pets");
			System.out.println("Press 3 to play with a pet");
			System.out.println("Press 4 to adopt a pet");
			System.out.println("Press 5 to admit a pet");
			System.out.println("Press 6 to exit");
			choice = input.nextInt();
			myShelter.petsTick();

			if (choice == 1) {
				System.out.println("You feed all the pets.");
				System.out.println(" ");
				System.out.println("|Name\t" + "|Hunger\t" + "|Thirst\t" + "|Boredom" + "|\t");
				myShelter.feedAll();
				for (VirtualPet current : myShelter.petStats()) {
					System.out.println("|" + current.getName() + "\t|" + current.getHunger() + "\t|"
							+ current.getThirst() + "\t|" + current.getBordeom() + "\t|");

				}

			} else if (choice == 2) {
				System.out.println("You give water to all the pets in the shelter.");
				System.out.println(" ");
				System.out.println("|Name\t" + "|Hunger\t" + "|Thirst\t" + "|Boredom" + "|\t");
				myShelter.waterAll();
				for (VirtualPet current : myShelter.petStats()) {
					System.out.println("|" + current.getName() + "\t|" + current.getHunger() + "\t|"
							+ current.getThirst() + "\t|" + current.getBordeom() + "\t|");
				}

			} else if (choice == 3) {

				System.out.println("You would like to play with one of the animals.");
				System.out.println("Here are the animals and their descriptions: ");
				for (VirtualPet current : myShelter.petStats()) {
					System.out.println(current.getName() + " " + current.getDescription());

				}
				input.nextLine();

				System.out.println("Type the name of the pet you would like to play with?");
				String playWithOne = input.nextLine();

				myShelter.getPet(playWithOne).playPet();
				System.out.println("You play with " + playWithOne + "!");
				System.out.println("|Name\t" + "|Hunger\t" + "|Thirst\t" + "|Boredom" + "|\t");
				for (VirtualPet current : myShelter.petStats()) {
					System.out.println("|" + current.getName() + "\t|" + current.getHunger() + "\t|"
							+ current.getThirst() + "\t|" + current.getBordeom() + "\t|");

				}
			} else if (choice == 4) {
				System.out.println("Here are the pets available for adotpion");
				for (VirtualPet current : myShelter.petStats()) {
					System.out.println(current.getName() + " " + current.getDescription());
				}
				input.nextLine();

				System.out.println("Please type the name of the pet you'd like to adopt.");
				String adoptedPetName = input.nextLine();

				myShelter.adoptPet(adoptedPetName);
				System.out.println("You have adopted " + adoptedPetName + ".");
				System.out.println("No givesies backsies please.");

			} else if (choice == 5) {
				System.out.println("So you'd like to admit a new pet?");

				input.nextLine();

				System.out.println("Please give him or her a 4-letter name");
				String userCreatedName = input.nextLine();

				input.nextLine();

				System.out.println("Thanks. Now describe the pet you are submitting.");
				String userCreatedDescr = input.nextLine();
				myShelter.add(new VirtualPet(userCreatedName, userCreatedDescr, 50, 50, 50, 50, 50));
				System.out.println(" ");
				System.out.println("All done. We'll do our best to give " + userCreatedName + " a good home.");

			} else if (choice == 6) {
				System.out.println("Thank you for dropping by. See you later!");
				break;
			}
			System.out.println("What else would you like to do?");

		} while (choice != -1);
	}
}
