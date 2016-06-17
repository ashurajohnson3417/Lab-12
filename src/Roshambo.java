public enum Roshambo {
	ROCK, PAPER, SCISSORS;

	@Override
	public String toString() {
		switch (this) {
		case ROCK:
			return "This is a rock!";
		case PAPER:
			return "This is a paper!";
		case SCISSORS:
			return "This is a scissors!";
		default:
			break;
		}
		return "never reaches this";
	}
}