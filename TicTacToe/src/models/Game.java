package models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> player;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;

    public Game(Player winner, List<Player> player, Board board, List<Move> moves, GameState gameState) {
        this.winner = winner;
        this.player = player;
        this.board = board;
        this.moves = moves;
        this.gameState = gameState;
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
}
