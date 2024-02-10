package BattleshipGame;

import java.time.LocalDate;
import java.util.*;

public class Game {

	Collection<Player> player;
	GameOutcome Outcome;

    public Collection<Player> getPlayer() {
        return player;
    }

    public void setPlayer(Collection<Player> player) {
        this.player = player;
    }

    public GameOutcome getOutcome() {
        return Outcome;
    }

    public void setOutcome(GameOutcome Outcome) {
        this.Outcome = Outcome;
    }

    public int[] getPoint() {
        return point;
    }

    public void setPoint(int[] point) {
        this.point = point;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int[] getTorpedoes() {
        return torpedoes;
    }

    public void setTorpedoes(int[] torpedoes) {
        this.torpedoes = torpedoes;
    }

    public Player getPlayers() {
        return players;
    }

    public void setPlayers(Player players) {
        this.players = players;
    }
	int[] point;
	Board board;
	int[] torpedoes;
	private LocalDate startTime;
	private LocalDate endTime;
	private Player players;

	public Game() {
		// TODO - implement Game.Game
		throw new UnsupportedOperationException();
	}

	public LocalDate getStartTime() {
		return this.startTime;
	}

	public LocalDate getEndTime() {
		return this.endTime;
	}

	public GameType getGameType() {
		// TODO - implement Game.getGameType
		throw new UnsupportedOperationException();
	}

	public void startGame() {
		// TODO - implement Game.startGame
		throw new UnsupportedOperationException();
	}

	public void endGame() {
		// TODO - implement Game.endGame
		throw new UnsupportedOperationException();
	}

	public String getGameOutcome() {
		// TODO - implement Game.getGameOutcome
		throw new UnsupportedOperationException();
	}

        
        public static void main(String args[])
        {
            Player player1 = new Player();
            
            Player player2 = new Player();
            
            Ship ships = new Ship();
           //  Torpedo player1torp1 = new Torpedo(player1,1,1);
            
        }
}