package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

import java.util.Arrays;

public class Game2048 extends Game {
    private static final int SIDE =4;
    private int[][]gameField = new int [SIDE][SIDE];
    private boolean isGameStopped = false;
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
        int result = getMaxTileValue();
        if (result==2048){
            win();
        }
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
            case 0: returnColor = Color.WHITE;
                break;
            case 2: returnColor = Color.AZURE;
                    break;
            case 4: returnColor = Color.BEIGE;
                break;
            case 8: returnColor = Color.BLUE;
                 break;
            case 16: returnColor = Color.BLUEVIOLET;
                    break;
            case 32: returnColor = Color.CHARTREUSE;
                break;
            case 64: returnColor = Color.CORAL;
                 break;
            case 128: returnColor = Color.CORNSILK;
                    break;
            case 256: returnColor = Color.DARKCYAN;
                break;
            case 512: returnColor = Color.YELLOW;
                break;
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
    private boolean compressRow(int[] row){
        int[] originalRow = Arrays.copyOf(row, row.length);

        for (int i = 0; i<row.length-1; i++){
            for(int j=i+1; j<row.length; j++){
                if (row[j]!=0 && row[i] == 0){
                    int buf = row[i];
                    row[i] = row[j];
                    row[j] = buf;
                }
            }

        }
        if(Arrays.equals(originalRow, row)){
            return false;
        }
        else return true;
    }
    private boolean mergeRow(int[] row){
        int[] originalRow = Arrays.copyOf(row, row.length);
        for (int i = 0; i<row.length-1; i++){
            if (row[i] == 0){
                continue;
            }
            else if(row[i] == row[i+1]){
                row[i]= row[i] + row[i+1];
                row[i+1]=0;
            }
        }
        if(Arrays.equals(originalRow, row)){
            return false;
        }
        else return true;
    }
    private void rotateClockwise(){
        int[][] tempArray = new int[SIDE][SIDE];

        for (int i = 0; i<SIDE; i++){
            for (int j = 0; j<SIDE; j++){
//                tempArray[SIDE-1-j][i] = gameField[i][j];
                tempArray[i][j]=gameField[SIDE-1-j][i];
            }
        }
        for (int k = 0; k<SIDE; k++){
            for (int m = 0; m<SIDE; m++){
                gameField[k][m]=tempArray[k][m];
            }
        }
    }
    private void moveLeft(){
//        boolean compresedRow = false;
////        boolean margedRow = false;
////        for (int i = 0; i<gameField.length; i++){
////            compresedRow =  compressRow(gameField[i]);
////            margedRow = mergeRow(gameField[i]);
////            if (margedRow){
////                compressRow(gameField[i]);
////            }
////        }
//////        for (int i = 0; i<gameField.length; i++){
//////            if(compressRow(gameField[i])){
//////                compresedRow = true;
//////            }
//////            if (mergeRow(gameField[i])){
//////                margedRow =true;
//////            }
//////            if (compressRow(gameField[i])){
//////                compresedRow = true;
//////            }
//////        }
////        if((compresedRow == true) || (margedRow == true)){
////            createNewNumber();
////        }
////        else {
////            return;
////        }

        boolean isNewNumberNeeded = false;
        for (int[] row : gameField) {
            boolean wasCompressed = compressRow(row);
            boolean wasMerged = mergeRow(row);
            if (wasMerged) {
                compressRow(row);
            }
            if (wasCompressed || wasMerged) {
                isNewNumberNeeded = true;
            }
        }
        if (isNewNumberNeeded) {
            createNewNumber();
        }
    }
    private void moveRight(){
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }
    private void moveUp(){
       rotateClockwise();
       rotateClockwise();
       rotateClockwise();
       moveLeft();
       rotateClockwise();
    }
    private void moveDown(){
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }
    private int getMaxTileValue(){
        int maxValue = 0;
        for (int i=0; i<gameField.length; i++){
            for(int j = 0; j<gameField[i].length;j++){
                if(gameField[i][j]>maxValue)
                    maxValue= gameField[i][j];
            }
        }
        return maxValue;
    }
    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.CADETBLUE, "You win!", Color.RED, 22);
    }
    private boolean canUserMove(){
        boolean canMove = false;
        for (int y = 0; y<gameField.length; y++){
            for (int x = 0; x<gameField[y].length; x++){
                if (gameField[y][x]==0){
                    canMove = true;
                }
                if(x<gameField.length-1){
                    if (gameField[y][x]==gameField[y][x+1]){
                        canMove = true;
                    }
                }
            }
        }
        for (int y = 0; y<gameField.length; y++){
            for (int x = 0; x<gameField[y].length; x++) {
                if(y<gameField.length-1){
                    if (gameField[y][x]==gameField[y+1][x]){
                        canMove = true;
                    }
                }
                }
            }

        return canMove;
    }
    @Override
    public void onKeyPress(Key key){
        boolean isKeyPressed = false;
        if (key == Key.LEFT){
            moveLeft();
            isKeyPressed = true;
        }
        else if(key == Key.RIGHT){
            moveRight();
            isKeyPressed = true;
        }
        else if(key == Key.UP){
            moveUp();
            isKeyPressed = true;
        }
        else if (key == Key.DOWN){
            moveDown();
            isKeyPressed = true;
        }
        if(isKeyPressed){
            drawScene();
        }
    }
}
