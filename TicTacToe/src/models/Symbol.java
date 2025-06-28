package models;

public class Symbol {
    public Symbol(Character symbol) {
        this.symbol = symbol;
    }

    private Character symbol;

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }
}
