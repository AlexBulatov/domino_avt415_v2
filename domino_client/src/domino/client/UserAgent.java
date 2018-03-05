package domino.client;
import java.io.*;
import java.net.*;


/**
 * Created by romanow on 24.02.2018.
 */
public class UserAgent extends BaseUser{
    public UserAgent(ControlEvents ev, Model model0, UserData data) {
        super(ev, model0, data);
    }

    private Socket socket = null;

    class Listener extends Thread {
        //listener
        class Connect{
            //creating socket
        }
//        class
    }



    @Override
    public void takeDomino(Domino dom) {

    }

    @Override
    public void setStep(boolean your) {

    }

    @Override
    public void message(String mes) {

    }

    @Override
    public void setLeft(Domino dom) {

    }

    @Override
    public void setRight(Domino dom) {

    }

    @Override
    public void startPlay() {
//        getCtrl().startPlay(this, getName();
    }

    @Override
    public void stopPlay() {

    }
}
