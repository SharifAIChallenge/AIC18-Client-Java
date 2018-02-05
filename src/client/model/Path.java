package client.model;

import java.util.ArrayList;

/**
 * Created by Parsa on 1/22/2018 AD.
 */
public class Path {

    private ArrayList<RoadCell> road;

    public Path(ArrayList<RoadCell> road) {
        this.road = road;
    }

    public ArrayList<RoadCell> getRoad() {
        return road;
    }

    @Override
    public String toString() {
        String result = "Path: ";

        for (int i = 0; i < road.size(); i++) {
            result += "(" + road.get(i).getPoint().getX() + "," + road.get(i).getPoint().getY() + ")" + " ";
        }
        return result;
    }
}
