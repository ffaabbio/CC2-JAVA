package fr.esgi;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Size size;
    private List<Position> aliveCells;

    Game(Size size) {
        this.size = size;
    }
    Game(Size size, List<Position> aliveCells) {
        this.size = size;
        this.aliveCells = aliveCells;
    }

    public Size getSize() {
        return this.size;
    }

    public List<Position> getAliveCells(){
        return this.aliveCells;
    }

    public List<Position> getAliveCellsNextGen(){
        if(this.aliveCells.size() == 1 || this.aliveCells.size() == 2){
            return new ArrayList<Position>();
        }
        return this.aliveCells;
    }
}
