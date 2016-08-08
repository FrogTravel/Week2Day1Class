/**
 * Created by ekaterina on 08.08.16.
 */
public class Diamond {

    enum State{
        RAW, FACETED;
    }

    State state;

    public Diamond(){
        this.state = State.RAW;
    }

    public State getState(){
        return state;
    }

    public void setState(State state){
        this.state = state;
    }
}
