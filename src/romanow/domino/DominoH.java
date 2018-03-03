package romanow.domino;

/**
 * Created by romanow on 07.02.2018.
 */
public class DominoH extends DominoVH {
    public DominoH(Domino dom, DominoPushed back0) {
        super(dom, back0, false);
        }
    public int getW(){ return sz*2; }
    public int getH(){ return sz; }
}
