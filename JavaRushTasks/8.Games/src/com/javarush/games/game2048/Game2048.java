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
//                setCellColor(x, y, Color.RED);
                setCellColoredNumber(x, y, gameField[y][x]);
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
    private Color getColorByValue(int value){
       Color returnColor = null;
        switch (value) {
            case 0: return Color.WHITE;
            case 2: return Color.LIGHTPINK;
            case 4: return Color.BLUEVIOLET;
            case 8: return Color.BLUE;
            case 16: return Color.CYAN;
            case 32: return Color.LIGHTSEAGREEN;
            case 64: return Color.LIMEGREEN;
            case 128: return Color.ORANGE;
            case 256: return Color.INDIANRED;
            case 512: return Color.RED;
            case 1024: returnColor = Color.YELLOWGREEN;
                break;
            case 2048: returnColor = Color.GOLD;
                    break;

        }
        return returnColor;
    }
    private void setCellColoredNumber(int x, int y, int value){
        Color cellColor = getColorByValue(value);
        switch (value) {
            case 0:  setCellValueEx(x, y , cellColor, "");
            break;
            case 2: setCellValueEx(x, y , cellColor, "2");
                break;
            case 4: setCellValueEx(x, y , cellColor, "4");
            break;
            case  8: setCellValueEx(x, y , cellColor, "8");
            break;
            case  16: setCellValueEx(x, y , cellColor, "16");
            break;
            case 32:  setCellValueEx(x, y , cellColor, "32");
            break;
            case 64: setCellValueEx(x, y , cellColor, "64");
                break;
            case 128: setCellValueEx(x, y , cellColor, "128");
            break;
            case 256: setCellValueEx(x, y , cellColor, "256");
                break;
            case 512: setCellValueEx(x, y , cellColor, "512");
                break;
            case 1024: setCellValueEx(x, y , cellColor, "1024");
                break;
            case 2048: setCellValueEx(x, y , cellColor, "2048");
                break;
        }

    }
}
