package strategy.GameWinningStrategy;

import models.Board;
import models.Move;
import models.Symbol;

import java.util.HashMap;

public class DiagonalWinningStrategy implements GameWinningStrategy{
    private HashMap<Symbol,Integer> leftdiagonal = new HashMap<>();
    private HashMap<Symbol,Integer> rightdiagonal = new HashMap<>();
    @Override
    public boolean checkwinner(Move move, Board board) {
        int row = move.getCell().getRow();
        int column = move.getCell().getColumn();

        Symbol symbol = board.getCell().get(row).get(column).getPlayer().getSymbol();

        if(row == column)
        {
            if(!leftdiagonal.containsKey(symbol))
            {
                leftdiagonal.put(symbol,1);
            }
            else
            {
                leftdiagonal.put(symbol,leftdiagonal.get(symbol)+1);
            }
            if(leftdiagonal.get(symbol)==board.getSize())
            {
                return true;
            }
        }
        if(row+column == board.getSize()-1)
        {
            if(!rightdiagonal.containsKey(symbol))
            {
                rightdiagonal.put(symbol,1);
            }
            else
            {
                rightdiagonal.put(symbol,rightdiagonal.get(symbol)+1);
            }
            if(rightdiagonal.get(symbol)==board.getSize())
            {
                return true;
            }
        }
        return false;
    }
}
