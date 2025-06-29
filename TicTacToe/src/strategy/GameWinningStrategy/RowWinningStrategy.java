package strategy.GameWinningStrategy;

import models.Board;
import models.Move;
import models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements GameWinningStrategy{
    private HashMap<Integer,HashMap<Symbol,Integer>> rowMap = new HashMap<>();
    @Override
    public boolean checkwinner(Move move, Board board) {
        int row = move.getCell().getRow();
        int column = move.getCell().getColumn();
        Symbol symbol = board.getCell().get(row).get(column).getPlayer().getSymbol();
        if(!rowMap.containsKey(row))
        {
            rowMap.put(row,new HashMap<>());
        }

            if(!rowMap.get(row).containsKey(symbol))
            {
                rowMap.get(row).put(symbol,1);
            }
            else
            {
                rowMap.get(row).put(symbol,rowMap.get(row).get(symbol)+1);
            }



        return rowMap.get(row).get(symbol) == board.getSize();
    }
}
