package controllers;

import exceptions.NotEnoughPlayersException;
import models.Game;
import models.Player;

import java.util.List;

public class GameController {

    public Game startGame(int dimensions, List<Player> players) throws NotEnoughPlayersException {
        return Game.getBuilder()
                .setDimension(dimensions)
                .setPlayers(players)
                .build();
    }
    public void makeMove(Game game) //After Make move we will take input parameter where the user wants to play
    {

    }
    public void getWinner(Game game)
    {

    }
    public void printBoard(Game game)
    {

    }
    public void undo(Game game)
    {

    }
}
