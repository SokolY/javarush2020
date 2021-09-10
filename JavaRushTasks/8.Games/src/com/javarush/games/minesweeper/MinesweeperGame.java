package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private void createGame(){
        for(int i = 0; i<gameField.length; i++){
            for (int j = 0; j<gameField[i].length; j++){
                boolean haveMine = getRandomNumber(10)<1;
                gameField[j][i] = new GameObject(i, j, haveMine);
                setCellColor(j, i, Color.ORANGE);
                if(haveMine) countMinesOnField++;
            }
        }
    }
    @Override
    public void initialize(){
        setScreenSize(SIDE, SIDE);
        createGame();
    }
}
