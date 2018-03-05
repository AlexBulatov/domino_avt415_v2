package domino.client;

/**
 * Created by User on 15.02.2018.
 */
public interface ControlEvents {
    public void pushDomino(BaseUser from, Domino dom, boolean left);
    void pushBreak(BaseUser from);           // Конец игры
    void pushFromMarket(BaseUser from);      // Взять с базара
    void pushNoStep(BaseUser from);          // Пропуск хода
    void startPlay(BaseUser from, String name);
//    void connect(String ip, String name);
}
