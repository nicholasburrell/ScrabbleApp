package mypackage.scrabbleapp;

import androidx.annotation.NonNull;

public class Board {

    private Character[][] boardAndTiles;

    public Board() {
        this.boardAndTiles = new Character[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                this.boardAndTiles[i][j] = '-';
            }
        }

    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder myStringBuilder = new StringBuilder(); //more efficient to use StringBuilder than +=
        for (int i = 0; i < 15; i++) {
            myStringBuilder.append("[");
            for (int j = 0; j < 15; j++) {
                myStringBuilder.append(this.boardAndTiles[i][j].toString());
            }
            myStringBuilder.append("]\n");
        }
        return myStringBuilder.toString();
    }

}
