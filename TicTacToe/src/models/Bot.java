package models;

import factory.BotPlayStrategyFactory;
import strategy.BotPlayingStrategy.BotMakeMoveStrategy;

public class Bot extends Player{
    private BOTDifficultyType botDifficultyType;

    public Bot(String name, long id, Symbol symbol, PlayerType playerType, BOTDifficultyType botDifficultyType) {
        super(name, id, symbol, playerType);
        this.botDifficultyType = botDifficultyType;
    }

    public BOTDifficultyType getBotDifficultyType() {
        return botDifficultyType;
    }

    public void setBotDifficultyType(BOTDifficultyType botDifficultyType) {
        this.botDifficultyType = botDifficultyType;
    }
    public Move makemove(Board board)
    {
        BotMakeMoveStrategy botMakeMoveStrategy =BotPlayStrategyFactory.getBotPlayingStrategy(botDifficultyType);
        Move move = botMakeMoveStrategy.makemove(board);
        move.setPlayer(this);
        return move;
    }

}
