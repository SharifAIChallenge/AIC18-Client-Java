package client.model;

import java.util.ArrayList;

/**
 * Created by Parsa on 1/22/2018 AD.
 */
public class Map {

    private Cell[][] cells;
    private int width;
    private int height;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void empty() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Cell tmpCell = cells[i][j];
                if (tmpCell instanceof RoadCell)
                    for (int k = 0; k < ((RoadCell) tmpCell).getUnits().size(); k++) {
                        ((RoadCell) tmpCell).getUnits().remove(k);
                    }
                else if (tmpCell instanceof GrassCell)
                    ((GrassCell) tmpCell).setTower(null);
            }
        }
    }

    @Override
    public String toString() {
        String result = "Map:\n";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result += cells[i][j].toString();
            }
            result += "\n";
        }
        return result;
    }
}
