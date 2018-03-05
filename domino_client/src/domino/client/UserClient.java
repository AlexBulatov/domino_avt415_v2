package domino.client;

/**
 * Created by romanow on 07.02.2018.
 */
public class UserClient implements ViewEvents{
    private ViewCommands view;
    public UserClient(ViewCommands ev) {
        view = ev;
        }

    public void setView(ViewCommands view0){
        view = view0;
        }
    @Override
    public void pushBreak() {

    }

    @Override
    public void pushFromMarket() {

    }

    @Override
    public void pushNoStep() {

    }

    @Override
    public void pushDomino(Domino dom, boolean left) {
    }

    @Override
    public void startPlay(String name) {

    }


}

