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

    private int howManyNeighbours(Position cell) {
        int count = 0;
        for (Position p : aliveCells) {

            if (p.equals(new Position(cell.x()+1,cell.y()))
            || p.equals(new Position(cell.x()+1,cell.y()-1))
            || p.equals(new Position(cell.x(),cell.y()-1))
            || p.equals(new Position(cell.x()-1,cell.y()-1))
            || p.equals(new Position(cell.x()-1,cell.y()))
            || p.equals(new Position(cell.x()-1,cell.y()+1))
            || p.equals(new Position(cell.x(),cell.y()+1))
            || p.equals(new Position(cell.x()+1,cell.y()+1))
            ){
                count++;
            }
        }
        return count;
    }

    public List<Position> getAliveCellsNextGen(){
        if(this.aliveCells.size() == 1){
            return new ArrayList<Position>();
        }
        List<Position> nextGen = new ArrayList<>();
        for (Position cell : this.aliveCells) {
            if (howManyNeighbours(cell) >= 2) {
                nextGen.add(cell);
            }
        }
        return nextGen;
    }
}
