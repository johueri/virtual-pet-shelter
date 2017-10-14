import java.util.Scanner;


public class VirtualPetShelterApp {

	public static void main(String[] args) {
		// 
		VirtualPetShelter myShelter = new VirtualPetShelter();
		
		VirtualPet pet1 = new VirtualPet ("Cliff", "He is a big red dog", 60, 60, 60, 60, 60);
		VirtualPet pet2 = new VirtualPet ("Charl", "She is a gregarious spider.", 20, 20, 20, 20, 20);
		VirtualPet pet3 = new VirtualPet ("Hank", "He's a cowdog and retired head of ranch security", 40, 40, 40, 40, 40);
		VirtualPet pet4 = new VirtualPet ("Jar.J", "No one is really sure what he is...but he's definitely the worst", 30, 30, 30, 30, 30);
		
		myShelter.add(pet1);
		myShelter.add(pet2);
		myShelter.add(pet3);
		myShelter.add(pet4);
		
		String userCreatedName;
		String userCreatedDescr;
		
		System.out.println("Welcome to the Franklin County Animal Shelter");
		System.out.println("");
		System.out.println("This is the status of our current pets");
		System.out.println("|Name\t" + "|Hunger\t" + "|Thirst\t" + "|Boredom" + "|\t");
		for (VirtualPet current : myShelter.petStats()) {
			System.out.println("|" + current.getName() + "\t|" + current.getHunger() + "\t|" + current.getThirst() + "\t|" + 
		current.getBordeom()+ "\t|");
		}
		
		
		
		
		
		
				

				

}
}
