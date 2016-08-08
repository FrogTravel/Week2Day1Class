/**
 * Created by ekaterina on 08.08.16.
 */
public class Miner {

    public void main(){
        System.out.print("Make new Diamond");
        diamond = new Diamond();
    }

    private Diamond diamond;


    public void mine() {
        //TODO
        System.out.println("Miner: mine");
        diamond = new Diamond();
    }


    public void provide() {
        //TODO
        System.out.println("Miner: provide");
        Main.minerArrayList.add(diamond);
    }
}
