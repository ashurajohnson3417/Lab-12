
public class RockPlayer extends Player {

	public RockPlayer(String name) {
		super("Easy");
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}


	
}