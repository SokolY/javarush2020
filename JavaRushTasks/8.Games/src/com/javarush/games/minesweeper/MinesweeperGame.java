package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private  static final int Side = 9;

    public void initialize(){
        setScreenSize(Side, Side);
    }
}
