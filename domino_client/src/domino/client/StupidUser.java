package domino.client;

/**
 * Created by User on 15.02.2018.
 */
public class StupidUser extends BaseUser{
    public StupidUser(ControlEvents ev, Model model0, UserData data){
        super(ev,model0, data);
        }

    @Override
    public void takeDomino(Domino dom) {
    }

    public boolean tryToStep(){
        ControlEvents ctrl = getCtrl();
        Chain cc = getModel().getChain();
        UserData data = getData();
        for(int i=0;i<data.data().size();i++){
            Domino dd = data.data().get(i);
            if (dd.testAndSwap(cc.getLeft(),true)){
                ctrl.pushDomino(this,dd,true);
                return true;
            }
        }
        for(int i=0;i<data.data().size();i++){
            Domino dd = data.data().get(i);
            if (dd.testAndSwap(cc.getRight(),false)){
                ctrl.pushDomino(this,dd,false);
                return true;
            }
        }
    return false;
    }

    @Override
    public void setStep(boolean your) {
        if (!your)
            return;
        if (!tryToStep())
            getCtrl().pushFromMarket(this);
        }

    @Override
    public void message(String mes) {
    }

    @Override
    public String getName() {
        return "Тупой";
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
    public static void main(String argv[]){
        GameController pp=new GameController(){
            @Override
            public Model getModel() {
                return super.getModel();
            }

            @Override
            public void pushDomino(BaseUser from, Domino dom, boolean left) {
                System.out.println(dom);
                Model mod = getModel();
                if (left){
                    mod.getChain().addLeft(dom);
                    }
                else
                    mod.getChain().addRight(dom);
                from.getData().removeById(dom);
                from.setStep(true);
            }

            @Override
            public void pushBreak(BaseUser from) {

            }

            @Override
            public void pushFromMarket(BaseUser from) {
                System.out.println("11111111111111111");
            }

            @Override
            public void pushNoStep(BaseUser from) {

            }

            @Override
            public void startPlay(BaseUser from, String name) {
            }
        };
        /*BaseUser user = pp.addStupid();
        Model mod = pp.getModel();
        Chain chain = mod.getChain();
        chain.add(new Domino(1,2,1000));
        chain.add(new Domino(2,5,1001));
        chain.add(new Domino(5,4,1002));
        UserData data = user.getData();
        data.add(new Domino(4,3,1003));
        data.add(new Domino(4,4,1004));
        data.add(new Domino(1,6,1005));
        data.add(new Domino(3,3,1006));
        data.add(new Domino(2,6,1007));
        user.setStep(true);*/
    }
}
