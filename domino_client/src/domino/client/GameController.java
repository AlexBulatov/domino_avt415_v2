package domino.client;

import java.util.ArrayList;
import java.io.*;
import java.net.*;

/**
 * Created by User on 15.02.2018.
 */
public class GameController implements ControlEvents {
    //private Socket socket = new Socket();
    private Model model = new Model();
    private ArrayList<BaseUser>  ctrlList = new ArrayList<>();
    public Model getModel() {
        return model;
        }
//    private listener;

    private BaseUser currentUser = null;

    public BaseUser getCurrentUser() {
        return currentUser;
    }

    public BaseUser changeCurrentUser(){

        return null;
    }

    /*public BaseUser addStupid(){
        UserData data = new UserData();
        BaseUser user = new StupidUser(this,model,data);
        model.getUsers().add(data);
        ctrlList.add(user);
        return user;
    }*/
    @Override
    public void pushDomino(BaseUser from, Domino dom, boolean left) {
        int idx = ctrlList.indexOf(from);
        System.out.println(ctrlList.get(idx).getName()+" "+dom);
    }

    public BaseUser addUserAgent(){
        UserData data = new UserData();
        return new UserAgent(this, model, data);
    }


    @Override
    public void pushBreak(BaseUser from) {

    }

    @Override
    public void pushFromMarket(BaseUser from) {

    }

    @Override
    public void pushNoStep(BaseUser from) {

    }

    @Override
    public void startPlay(BaseUser from, String name) {

    }

//    @Override
//    public void connect(String ip, String name) {
//
//    }

    public static void main(String args[]) {
        GameController pp = new GameController();
        System.out.println("govno piroga 1");

        //pp.addStupid();
//        pp.ctrlList.get(0).setStep(false);
//        pp.ctrlList.get(0).setStep(true);
//        pp.ctrlList.get(0).setStep(true);
    }
}
