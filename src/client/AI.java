package client;

import client.model.*;
import common.util.Log;

import java.util.Random;

import static common.network.JsonSocket.TAG;

/**
 * AI class.
 * You should fill body of the method {@link }.
 * Do not change name or modifiers of the methods or fields
 * and do not add constructor for this class.
 * You can add as many methods or fields as you want!
 * Use world parameter to access and modify game's
 * world!
 * See World interface for more details.
 */
public class AI {

    Random rnd=new Random();

    void simpleTurn(World game) {

        Log.d(TAG,"lightTurn Called"+" Turn:"+game.getCurrentTurn());

        int t=rnd.nextInt();
        if(t%3==2){
            game.createArcherTower(rnd.nextInt(4),rnd.nextInt(game.getMyDefenceMap().getWidth()),rnd.nextInt(game.getMyDefenceMap().getHeight()));

        }else if(t%3==1){
            game.createHeavyUnit(rnd.nextInt(game.getPaths().size()));

        }else if(t%3==0){
            game.createLightUnit(rnd.nextInt(game.getPaths().size()));
        }
    }

    void complexTurn(World game) {

        Log.d(TAG,"HeavyTurn Called"+" Turn:"+game.getCurrentTurn());

        int t=rnd.nextInt();
        if(t%3==2){
            game.createStorm(rnd.nextInt(game.getMyDefenceMap().getWidth()),rnd.nextInt(game.getMyDefenceMap().getHeight()));
        }else if(t%3==1){
            game.plantBean(rnd.nextInt(game.getMyDefenceMap().getWidth()),rnd.nextInt(game.getMyDefenceMap().getHeight()));

        }else if(t%3==0){
            game.createCannonTower(rnd.nextInt(4),rnd.nextInt(game.getMyDefenceMap().getWidth()),rnd.nextInt(game.getMyDefenceMap().getHeight()));

        }
    }
}
