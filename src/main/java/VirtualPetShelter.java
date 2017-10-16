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

	public VirtualPet getPet(String name) {
		return pets.get(name); // this is a getter that pulls one individual pet name, which will serve as a
								// retrieval tool to get a key to your map. Allows you to focus a method one
								// pet. I hope.
	}

	public VirtualPet adoptPet(String name) {
		return pets.remove(name); // whatever account has the key that I reference, get rid of it.
	}

	// Pet Tick Method
	public void petsTick() { //// WORK ON that syntax
		for (VirtualPet currentPet : pets.values()) {
			currentPet.tick(); // In the app, you will need .get(tick). I think. Ugh.
		}
	}

	public void feedAll() {
		for (VirtualPet currentPet : pets.values()) {
			currentPet.feedPet();
		}
	}

	public void waterAll() {
		for (VirtualPet currentPet : pets.values()) {
			currentPet.giveWater();
		}
	}

}
