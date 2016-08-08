import java.util.ArrayList;

/**
 * Created by ekaterina on 08.08.16.
 */
public class Main {
    static ArrayList<Diamond> minerArrayList = new ArrayList<>();
    static ArrayList<Diamond> goldsmithArrayList = new ArrayList<>();

    public static void main(String[] args){
        Miner miner = new Miner();
        Rich rich = new Rich();
        Diamond diamond = new Diamond();
        Goldsmine goldsmine = new Goldsmine();


        for(int i = 0; i < 100; i++){
            miner.mine();//Get new diamond
            miner.provide();//Put new diamond
            goldsmine.consume();//Takes last diamond from arrayList
            goldsmine.process();
            goldsmine.provide();//Write diamond to new ArrayList
            rich.consume();//Takes last diamond from ArrayList
        }
    }

}
