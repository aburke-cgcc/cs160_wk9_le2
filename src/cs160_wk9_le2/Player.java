package cs160_wk9_le2;

public class Player {
	//members
	public String name;
	public PlayerClass playerClass;
	int health;
	String race;
	int xp;
	Milestone[] completedMilestones;
	
	//constructor
	public Player(String n, PlayerClass pC, int h, String r, int x) {
		name = n;
		playerClass = pC;
		health = h;
		race = r;
		xp = x;
	}
}
