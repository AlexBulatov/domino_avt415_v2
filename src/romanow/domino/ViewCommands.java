package romanow.domino;

/**
 * Created by romanow on 07.02.2018.
 */
public interface ViewCommands {
    void setOwn(Domino dom);    // Добавить к своим
    void removeOwn(int num);    // Удалить свою
    void setLeft(Domino dom);
    void setRight(Domino dom);
    void startPlay();
    void stopPlay();
    void message(String mes);
}
