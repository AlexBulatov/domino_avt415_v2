package domino.client;

/**
 * Created by User on 15.02.2018.
 */
public interface ControlCommands {
    public void takeDomino(Domino dom);
    public void setStep(boolean your);
    public void message(String mes);
    public String getName();
    void setLeft(Domino dom);
    void setRight(Domino dom);
    void startPlay();
    void stopPlay();
}
