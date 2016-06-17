import java.util.Random;

public class Random1Player extends Player {
	public Random1Player(String name) {
		super(name);
	
	}
	





	@Override
	public Roshambo generateRoshambo() {
		Roshambo[] moves = Roshambo.values();
	    Random random = new Random();
	    int index = random.nextInt(moves.length);
	    return moves[index];
	}

	
	
	
	
	
}
