package domino.client;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by User on 15.02.2018.
 */
public class Model {
    private Chain chain = new Chain();
    private UserData hand = new UserData();

    public Chain getChain() {
        return chain;
    }

    public UserData getHand() {
        return hand;
    }

  /*  public static void main(String args[])
    {
        Model mod = new Model();
        Market m = new Market();
        m = mod.GenerateMarket();
        System.out.println(m.toString());
    }*/
}
