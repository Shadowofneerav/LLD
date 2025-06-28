package exceptions;

import java.sql.SQLOutput;
import java.sql.Struct;

public class NotEnoughPlayersException extends Exception{
    public NotEnoughPlayersException(String ex)
    {
        System.out.println("Not correct player to play the game");
    }
}
