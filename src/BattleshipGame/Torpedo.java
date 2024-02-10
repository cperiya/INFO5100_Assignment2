package BattleshipGame;

public class Torpedo {

    	Player player;
	private int x;
	private int y;
        
    public Torpedo(Player player, int x, int y) {
        this.player = player;
        this.x = x;
        this.y = y;
    }



	public int getX() {
		return this.x;
	}

	/**
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	/**
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

}