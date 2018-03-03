package romanow.domino;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by User on 15.02.2018.
 */
public class Model {
    private Chain chain = new Chain();
    private Market market = new Market();
    private ArrayList<UserData> users = new ArrayList<>();

    public Chain getChain() {
        return chain;
    }

    public Market getMarket() {
        return market;
    }

    public ArrayList<UserData> getUsers() {
        return users;
    }

    public Market GenerateMarket() {
        int i, j, num = 0;
        Domino curr;
        for (i = 0  ; i < 7; i++)
            for (j = i; j < 7; j++) {
                curr = new Domino(i, j, num);
                market.add(curr);
                num++;
            }
        Collections.shuffle(market);
        return market;
    }
  /*  public static void main(String args[])
    {
        Model mod = new Model();
        Market m = new Market();
        m = mod.GenerateMarket();
        System.out.println(m.toString());
    }*/
}
