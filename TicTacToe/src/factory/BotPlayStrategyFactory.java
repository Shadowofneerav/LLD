package factory;

import models.BOTDifficultyType;
import strategy.BotPlayingStrategy.BotMakeMoveStrategy;
import strategy.BotPlayingStrategy.EasyMakeMoveStrategy;
import strategy.BotPlayingStrategy.HardMakeMoveStrategy;
import strategy.BotPlayingStrategy.MediumMakeMoveStrategy;

public class BotPlayStrategyFactory {
    public static BotMakeMoveStrategy getBotPlayingStrategy(BOTDifficultyType difficultyType)
    {
        if(difficultyType.equals(BOTDifficultyType.EASY))
        {
            return new EasyMakeMoveStrategy();
        }
        else
            if(difficultyType.equals(BOTDifficultyType.MEDIUM))
            {
                return new MediumMakeMoveStrategy();
            }
            else
            {
                return new HardMakeMoveStrategy();
            }
//            return null;
    }

}
