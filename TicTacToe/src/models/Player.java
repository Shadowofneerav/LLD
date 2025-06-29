package models;

import java.util.Scanner;

public class Player {
    private String name;
    private long id;
    private Symbol symbol;
    private PlayerType playerType;
    private Scanner scn;

    public Player(String name, long id, Symbol symbol, PlayerType playerType) {
        this.name = name;
        this.id = id;
        this.symbol = symbol;
        this.playerType = playerType;
        this.scn = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
    public Move makemove(Board board)
    {
        System.out.println("Enter the position to play the move");
        System.out.print("Enter row : ");
        int row = scn.nextInt();
        System.out.print("Enter column : ");
        int column = scn.nextInt();
        return new Move(this,new Cell(row,column));
    }
}
