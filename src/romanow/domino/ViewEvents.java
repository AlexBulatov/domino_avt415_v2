package romanow.domino;

/**
 * Created by romanow on 07.02.2018.
 */
public interface ViewEvents {
    void pushBreak();           // Конец игры
    void pushFromMarket();      // Взять с базара
    void pushNoStep();          // Пропуск хода
    void pushDomino(Domino dom, boolean left);   // Кликнули по 2 костям
    void startPlay(String name);
}
