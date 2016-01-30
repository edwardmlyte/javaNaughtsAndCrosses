package dai.llew.game;

import java.awt.Dimension;

public class GameConstants {

	/**
	 * The size of the O's & X's
	 */
	public static final int SYMBOL_SIZE = 60;
	/**
	 * The main window width.
	 */
	public static final int WINDOW_WIDTH = 520;
	/**
	 * The main window height.
	 */
	public static final int WINDOW_HEIGHT = 520;
	/**
	 * The main window dimensions.
	 */
	public static final Dimension GAME_DIMENSIONS = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
	/**
	 * The X/Y coordinate of the top left corner of the board.
	 */
	public static final int BOARD_COORD = 100;
	/**
	 * The board dimensions.
	 */
	public static final Dimension BOARD_DIMENSIONS = new Dimension(320, 320);
	/**
	 * The thickness of the lines drawn.
	 */
	public static final int STROKE_SIZE = 15;

	/**
	 * Types to classify if the game is still in play or if it is completed.
	 */
	public enum GameStatus {

		/**
		 * The game is still in play.
		 */
		IN_PLAY,

		/**
		 * A {@link Player} won the game.
		 */
		WON,

		/**
		 * Neither {@link Player} won the game.
		 */
		DRAWN;
	}

	/**
	 * Types to distinguish which player is playing.
	 */
	public enum PlayerType {
		/**
		 * A Human player.
		 */
		HUMAN,

		/**
		 * The computer AI.
		 */
		COMPUTER
	}

	public enum Symbol {
		/**
		 * The Noughts Symbol.
		 */
		NOUGHTS,

		/**
		 * The Crosses Symbol.
		 */
		CROSSES;
	}
}
