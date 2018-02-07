package client.model;

import java.util.ArrayList;

/**
 * Created by Parsa on 1/22/2018 AD.
 */
public interface World {

    ArrayList<Unit> getMyUnits();

    ArrayList<Unit> getEnemyUnits();

    ArrayList<Tower> getMyTowers();

    ArrayList<Tower> getVisibleEnemyTowers();

    ArrayList<Path> getPaths();

    Map getMyAttackMap();

    ArrayList<Path> getAttackMapPaths();

    ArrayList<Path> getDefenceMapPaths();

    Map getMyDefenceMap();

    Player getEnemyInformation();

    Player getMyInformation();

    void createLightUnit(int pathIndex);

    void createHeavyUnit(int pathIndex);

    void createArcherTower(int lvl, int x, int y);

    void createCannonTower(int lvl, int x, int y);

    void upgradeTower(int tid);

    void plantBean(int x, int y);

    void createStorm(int x, int y);

    ArrayList<BeanEvent> getBeansInThisTurn();

    ArrayList<StormEvent> getStormsInThisTurn();

    ArrayList<Tower> getDestroyedTowersInThisTurn();

    ArrayList<Unit> getDeadUnitsInThisTurn();

    ArrayList<Unit> getPassedUnitsInThisTurn();

    boolean isTowerConstructable(Cell cell);

    int getCurrentTurn();

}
