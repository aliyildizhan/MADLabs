package msku.ceng.madlab.week7;

public interface BoardView {

    char PLAYER_1_Symbol = 'X';
    char PLAYER_2_Symbol = 'Y';

    byte DRAW = 0;
    byte PLAYER_1_WINNER = 1;
    byte PLAYER_2_WINNER = 2;

    void newGame();

    void putSymbol(char symbol, byte row, byte col);

    void gameEnded(byte winner);

    void invalidPlay(byte row, byte col);
}
