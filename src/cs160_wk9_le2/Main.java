package cs160_wk9_le2;

public class Main {

	public static void main(String[] args) {
		GameSession session = new GameSession();
		session.type = "DND";
		session.minutes = 60;
		
	}
	
	//helper methods
	private static Player[]createPlayers() {
		return new Player[] {
				new Player(
						"Gandalf", 
						PlayerClass.Wizard, 
						100,
						"Human",
						500
						),
				new Player(
						"Frodo", 
						PlayerClass.Bard, 
						100,
						"Hobbit",
						650
						),
				new Player(
						"Bilbo", 
						PlayerClass.Rogue, 
						100,
						"Hobbit",
						300
						),
				new Player(
						"Smeagol", 
						PlayerClass.Fighter, 
						100,
						"Badguy",
						10000
						),
				new Player(
						"Joe", 
						PlayerClass.Goofball, 
						100,
						"Weirdo",
						0
						)
			};
	}
	
	private static Milestone[] createMilestones() {
		return new Milestone[] {
				new Milestone("survive fall", 100),
				new Milestone("kill goblin", 100),
				new Milestone("dont die", 100)
		};
	}

}
