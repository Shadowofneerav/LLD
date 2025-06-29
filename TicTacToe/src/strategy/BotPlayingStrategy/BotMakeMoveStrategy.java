package strategy.BotPlayingStrategy;

import models.Board;
import models.Move;

public interface BotMakeMoveStrategy {
    public Move makemove(Board board);
}
