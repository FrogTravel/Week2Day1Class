/**
 * Created by ekaterina on 08.08.16.
 */
public class Goldsmine {
    private Diamond diamond;

    public void consume() {
        //TODO
        diamond = Main.minerArrayList.get(Main.minerArrayList.size() - 1);
        System.out.println("Goldsmine: consume");
    }

    public void process() {
        //TODO
        diamond.setState(Diamond.State.FACETED);
        System.out.println("Goldsmine: process");
    }

    public void provide() {
        //TODO
       Main.goldsmithArrayList.add(diamond);
        System.out.println("Goldsmine: provide");
    }
}
