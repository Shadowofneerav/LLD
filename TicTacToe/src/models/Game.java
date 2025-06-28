package models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> player;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;

//    public Game(Player winner, List<Player> player, Board board, List<Move> moves, GameState gameState) {
//        this.winner = winner;
//        this.player = player;
//        this.board = board;
//        this.moves = moves;
//        this.gameState = gameState;
//    }
    private Game(int dimenstion, List<Player> player)
    {

    }
    public static GameBuilder getBuilder()
    {
        return new GameBuilder();
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
    public static class GameBuilder{
        private int dimension;
        private List<Player> players;
        public Game build()
        {

            return new Game(dimension,players);
        }

        public List<Player> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player> players) {
            this.players = players;
        }

        public int getDimension() {
            return dimension;
        }

        public void setDimension(int dimension) {
            this.dimension = dimension;
        }
    }
}
