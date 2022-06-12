package game;

public class Start {
	public static void main(String[] args) {
		Player p = new Player();
		PlayGame pg = new  PlayGame();
		p.run();
		pg.runGame();
	}
}
