package strategy.GameWinningStrategy;

import models.Board;
import models.Move;
import models.Symbol;

import java.util.HashMap;

public class ColumnWinningStrategy implements GameWinningStrategy{
    private HashMap<Integer,HashMap<Symbol,Integer>> columnMap = new HashMap<>();
    @Override
    public boolean checkwinner(Move move, Board board) {
        int row = move.getCell().getRow();
        int column = move.getCell().getColumn();
        Symbol symbol = board.getCell().get(row).get(column).getPlayer().getSymbol();
        if(!columnMap.containsKey(column))
        {
            columnMap.put(column,new HashMap<>());
        }

            if(!columnMap.get(column).containsKey(symbol))
            {
                columnMap.get(column).put(symbol,1);
            }
            else
            {
                columnMap.get(column).put(symbol,columnMap.get(column).get(symbol)+1);
            }



        return columnMap.get(column).get(symbol) == board.getSize();
    }
}
