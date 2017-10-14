
public class VirtualPet {
	// Instance Data
	private int hunger; // instance variable
	private int boredom;
	private int affection;
	private int bathroom;
	private int thirst;
	private String name;
	private String description;

	// Constructor
	public VirtualPet(int hunger, int boredom, int affection, int bathroom, int thirst) {
		this.hunger = hunger;
		this.boredom = boredom;
		this.affection = affection;
		this.bathroom = bathroom;
		this.thirst = thirst;
	}

	// Overloading Constructor
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	// Tick Method
	 public void tick() { 
		int time = 1;
	 hunger += time;
	 boredom += time;
	 affection += time;
	 bathroom += time;
	 thirst += time;
	 }

	// Gettor
	public int getHunger() {
		return hunger;
	}

	public int getBordeom() {
		return boredom;
	}

	public int getAffection() {
		return boredom;
	}

	public int getBathroom() {
		return boredom;
	}

	public int getThirst() {
		return boredom;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return name;
	}

	// Method of Behavior
	public void feedPet(int food) {
		hunger -= food;
		thirst += (food / 2);
	}

	public void playPet(int play) {
		boredom -= play;
	}

	public void rubPet(int rub) {
		affection -= rub;
	}

	public void letOut(int poop) {
		bathroom -= poop;
	}

	public void giveWater(int water) {
		thirst -= water;
		bathroom += (water / 3);
	}
}