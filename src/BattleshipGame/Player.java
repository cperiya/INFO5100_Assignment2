package BattleshipGame;

public class Player {

	private Ship ships[];
	private int points;
	private Torpedo torpedoes[];

	public Player() {
        this.ships = new Ship[6];
		// TODO - implement Player.Player
		throw new UnsupportedOperationException();
	}

	public Ship getShip() {
		// TODO - implement Player.getShip
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Ship
	 */
	public void setShip(Ship Ship) {
		// TODO - implement Player.setShip
		throw new UnsupportedOperationException();
	}

	public int getPoints() {
		return this.points;
	}

	/**
	 * 
	 * @param points
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	public void placeShips() {
		// TODO - implement Player.placeShips
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void throwTorpedo(int x, int y) {
		// TODO - implement Player.throwTorpedo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param outcome
	 */
	public void collectPoints(GameOutcome outcome) {
		// TODO - implement Player.collectPoints
		throw new UnsupportedOperationException();
	}

}