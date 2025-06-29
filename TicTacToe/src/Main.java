import controllers.GameController;
import exceptions.NotEnoughPlayersException;
import models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NotEnoughPlayersException {
        System.out.println("Starting the Game");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the dimensions of the Board :");
        int dimension = scn.nextInt();
        List<Player> players = new ArrayList<>(Arrays.asList(new Player("Neerav",1,new Symbol('X'), PlayerType.HUMAN),new Bot("Deepak",2,new Symbol('Y'),PlayerType.BOT, BOTDifficultyType.EASY)));
        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension,players);

        while(game.getGameState().equals(GameState.IN_PROGRESS))
        {
            game.displayBoard();
            gameController.makeMove(game);

        }
        if(game.getGameState().equals(GameState.DRAW))
        {
            System.out.println("Game has been drawn");
        }
        if(game.getGameState().equals(GameState.ENDED))
        {
            System.out.println("The winner is "+game.getWinner().getName());

        }
        game.displayBoard();
    }
}
