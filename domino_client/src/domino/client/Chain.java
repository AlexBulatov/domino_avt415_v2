package domino.client;

import java.util.ArrayList;

/**
 * Created by User on 15.02.2018.
 */
public class Chain extends ArrayList<Domino> {
    public int getLeft(){
        if (size()==0)
            return -1;
        return get(0).getV1();
        }
    public int getRight(){
        if (size()==0)
            return -1;
        return get(size()-1).getV2();
        }
    public void addLeft(Domino dd){
        if (size()==0)
            add(dd);
        else
            add(0,dd);
        }
    public void addRight(Domino dd){
        add(dd);
        }
}
