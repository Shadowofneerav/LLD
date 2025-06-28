package models;

import exceptions.DuplicateSymbolsException;
import exceptions.MultipleBotsException;
import exceptions.NotEnoughPlayersException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> player;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    private int nextPlayerMoveIndex;

//    public Game(Player winner, List<Player> player, Board board, List<Move> moves, GameState gameState) {
//        this.winner = winner;
//        this.player = player;
//        this.board = board;
//        this.moves = moves;
//        this.gameState = gameState;
//    }
    private Game(int dimension, List<Player> player)
    {
        this.board = new Board(dimension);
        this.player = player;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerMoveIndex = 0;

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
        public Game build() throws NotEnoughPlayersException {
            validateGame(dimension,players);
            return new Game(dimension,players);
        }
        private void validateGame(int dimension,List<Player> players) throws NotEnoughPlayersException {
            validate_count();
            validate_symbols();
            validate_bots();
        }
        private void validate_symbols()
        {
            HashMap<Character,Integer> symbols = new HashMap<>();
            for(Player player: players)
            {
                if(!symbols.containsKey(player.getSymbol().getSymbol()))
                {
                    symbols.put(player.getSymbol().getSymbol(),1);
                }
                else
                {
                    throw new DuplicateSymbolsException("Duplicate Symbols present in the game. Cannot start the game");
                }
            }
        }

        private void validate_bots()
        {
            int bot_count = 0;
            for(Player player:players)
            {
                if(player.getPlayerType()==PlayerType.BOT)
                {
                    bot_count++;
                }
            }
            if(bot_count>1)
            {
                throw new MultipleBotsException("Only one bot is allowed in the Game");
            }
        }

        private void validate_count() throws NotEnoughPlayersException {
            if(players.size()!=dimension-1)
            {
                throw new NotEnoughPlayersException("Not enought player present");
            }
        }


        public List<Player> getPlayers() {
            return players;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public int getDimension() {
            return dimension;
        }

        public GameBuilder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
    }
}
