package domino.client;

/**
 * Created by romanow on 07.02.2018.
 */
public class DominoV extends DominoVH {
    public DominoV(Domino dom, DominoPushed back0) {
        super(dom, back0, true);
        }
    public int getW(){ return sz; }
    public int getH(){ return sz*2; }
}
