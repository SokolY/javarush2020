package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE =4;
    private int[][]gameField = new int [SIDE][SIDE];

    @Override
    public void initialize() {
       setScreenSize(SIDE, SIDE);
       createGame();
        drawScene();
    }
        private void createGame(){
            createNewNumber();
            createNewNumber();
    }
    private void drawScene(){
        for (int y = 0; y<gameField.length; y++){
            for (int x = 0; x<gameField[y].length; x++){
                setCellColor(x, y, Color.RED);
            }
        }
    }
    private void createNewNumber(){
        int randX = getRandomNumber(SIDE);
        int randY = getRandomNumber(SIDE);
        int randNumber = getRandomNumber(10);
        if (gameField[randY][randX]!=0){
            createNewNumber();
        }
        else {
            if (randNumber == 9) {
                gameField[randY][randX] = 4;
            } else gameField[randY][randX] = 2;
        }
    }

}
