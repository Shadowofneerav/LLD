package models;

public class Bot extends Player{
    private BOTDifficultyType botDifficultyType;

    public BOTDifficultyType getBotDifficultyType() {
        return botDifficultyType;
    }

    public void setBotDifficultyType(BOTDifficultyType botDifficultyType) {
        this.botDifficultyType = botDifficultyType;
    }
}
