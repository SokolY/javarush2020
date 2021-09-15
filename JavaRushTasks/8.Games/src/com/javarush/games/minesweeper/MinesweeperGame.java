package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private boolean isGameStopped;
    private int countClosedTiles = SIDE * SIDE;
    private final static String MINE = "\uD83D\uDCA3";
    private final static String FLAG = "\uD83D\uDEA9";
    private int countFlags;
    private int counter = 0;
    private int score;
    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
//        isGameStopped = false;
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
                setCellValue(x,y,"");
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }
    private void countMineNeighbors(){
        for (int y = 0; y<SIDE; y++){
            for(int x = 0; x<SIDE; x++){
                if (gameField[y][x].isMine == false){
                    List<GameObject> results=  getNeighbors(gameField[y][x]);
                    for(GameObject item: results){
                        if(item.isMine){
                            gameField[y][x].countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }
    private void openTile(int x, int y) {
             GameObject gameObject = gameField[y][x];
        if(gameObject.isOpen || gameObject.isFlag || isGameStopped == true){
            return;
        }
//        if(gameObject.isOpen == true){
//
//        }
        gameObject.isOpen = true;
        countClosedTiles--;
        setCellColor(x, y, Color.GREEN);
        if (gameObject.isOpen && !gameObject.isMine){
            score +=5;
        }

        if (gameObject.isMine) {
            setCellValue(gameObject.x, gameObject.y, MINE);
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        } else if (gameObject.countMineNeighbors == 0) {
            setCellValue(gameObject.x, gameObject.y, "");
            List<GameObject> neighbors = getNeighbors(gameObject);
            for (GameObject neighbor : neighbors) {
                if (!neighbor.isOpen) {
                    openTile(neighbor.x, neighbor.y);
                }
            }

        }
        else {
            setCellNumber(x, y, gameObject.countMineNeighbors);
        }
        setScore(score);
        System.out.println("Method openTile run times: " + counter++);
        if (countMinesOnField == countClosedTiles && !gameObject.isMine){
            win();
        }
    }
    private void markTile(int x, int y){
        GameObject gameObject = gameField[y][x];
        if(gameObject.isOpen){
        }
        else if(countFlags == 0 && !gameObject.isFlag){
        }
        else if (gameObject.isFlag == false){
            gameObject.isFlag = true;
            countFlags--;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, Color.YELLOW);
        }
        else if(gameObject.isFlag == true){
            gameObject.isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.ORANGE);
        }
        else if (isGameStopped == true){
            
        }
    }
    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.BLUEVIOLET, "Game Over", Color.BISQUE, 22);
    }
    private void restart(){
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        countMinesOnField = 0;
        setScore(score);

        createGame();
    }
    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.BLUEVIOLET, "Congratulations yoo win!", Color.CHOCOLATE, 25);
    }
    @Override
    public void onMouseLeftClick(int x, int y) {

//        super.onMouseLeftClick(x, y);

        if(isGameStopped) {
            restart();
        }
        else {
            openTile(x,y);
        }
    }
    @Override
    public void onMouseRightClick(int x, int y){
        markTile(x,y);
    }
}