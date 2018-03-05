package domino.client;

/**
 * Created by romanow on 07.02.2018.
 */
public class Domino {
    private int v1=0,v2=0;
    private int id=0;
    public int getId() {
        return id;
    }
    public String toString(){
        return ""+id+":"+v1+"-"+v2;
        }
    public Domino(int v1, int v2, int vNum) {
        this.v1 = v1;
        this.v2 = v2;
        this.id = vNum;
        }
    public void setId(int vNum) {
        this.id = vNum;
    }
    public Domino(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
        }
    public void swap(){ int vv=v1; v1=v2; v2=vv; }
    public int getV1() {
        return v1;
    }
    public void setV1(int v1) {
        this.v1 = v1;
    }
    public int getV2() {
        return v2;
    }
    public void setV2(int v2) {
        this.v2 = v2;
    }
    public boolean testVal(int vv){
        return vv==v1 || vv==v2;
        }
    public boolean testAndSwap(int vv, boolean left){
        if (left){
            if (v2==vv)
                return true;
            if (v1==vv){
                swap();
                return true;
                }
            return false;
            }
        if (v1==vv)
            return true;
        if (v2==vv){
            swap();
            return true;
            }
        return false;

    }
}
