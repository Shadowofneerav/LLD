package strategy.BotPlayingStrategy;

import models.Board;
import models.CellState;
import models.Move;

public class EasyMakeMoveStrategy implements BotMakeMoveStrategy{
    @Override
    public Move makemove(Board board) {
        for(int i=0;i<board.getSize();i++)
        {
            for(int j=0;j<board.getSize();j++)
            {
                if(board.getCell().get(i).get(j).getCellState().equals(CellState.EMPTY))
                {
                    return new Move(null, board.getCell().get(i).get(j));
                }
            }
        }
        return null;
    }
}
