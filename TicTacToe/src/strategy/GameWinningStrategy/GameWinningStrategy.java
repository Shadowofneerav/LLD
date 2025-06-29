package strategy.GameWinningStrategy;

import models.Board;
import models.Move;

public interface GameWinningStrategy {
    public boolean checkwinner(Move move, Board board);
}
