import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	// map needs 2 type params (1 for key and 1 for the value)
		Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
		
		public Collection<VirtualPet> petStats() {
			return pets.values();
}
		
		public void add(VirtualPet pet) {
			pets.put(pet.getName(), pet); // adds a pet
		}
		
		public VirtualPet getPet(String petName) {
			return pets.get(petName); // this is a getter that pulls one individual pet name, which will serve as the key to your map. 
		}
		
		public VirtualPet adoptPet(String petName) {
			return pets.remove(petName); // whatever account has the key that I reference, get rid of it. 
		}
		// Pet Tick Method
		public void  petsTick() {  //// WORK ON that syntax
		for (VirtualPet currentPet : pets.values()) {
			currentPet.tick(); // In the app, you will need .get(tick). I think. Ugh. 
}
		}
		public void feedAll () { 
		}
		public void waterAll () {
}
		public void playWithOne() {
		}
		}
