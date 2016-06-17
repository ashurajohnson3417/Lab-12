import java.util.Random;

public abstract class Player {
	// Player class has two fields
	private String myName;
	private Roshambo rps;

	// Player has one constructor
	public Player(String name) {
		myName = name;
	}


	public abstract Roshambo generateRoshambo();
}
