package domino.client;

import java.util.ArrayList;

/**
 * Created by User on 15.02.2018.
 */
public class UserData {
    private ArrayList<Domino> data = new ArrayList<>();
    public void add(Domino dd){ data.add(dd); }
    public ArrayList<Domino> data(){ return data; }
    public void removeById(Domino dom){
        for(int i=0;i<data.size();i++){
            Domino dd = data.get(i);
            if (dd.getId()==dom.getId()){
                data.remove(dd);
            }
        }
    }
}

