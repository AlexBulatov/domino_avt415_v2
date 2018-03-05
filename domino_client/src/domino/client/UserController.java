package domino.client;

/**
 * Created by romanow on 07.02.2018.
 */
public class UserController extends BaseUser implements ViewEvents {
    private ViewCommands view;
    public UserController(ControlEvents ev, Model model0, UserData data) {
        super(ev, model0,data);
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
    public String getName() {
        return null;
    }

    @Override
    public void setLeft(Domino dom) {

    }

    @Override
    public void setRight(Domino dom) {

    }

    @Override
    public void startPlay() {

    }

    @Override
    public void stopPlay() {

    }
}

