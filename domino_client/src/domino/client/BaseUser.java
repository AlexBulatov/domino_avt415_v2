package domino.client;

/**
 * Created by User on 22.02.2018.
 */
public abstract class BaseUser implements ControlCommands {
    private Model model;
    private ControlEvents ctrl;
    private UserData myData;

    public UserData getData(){ return myData; }
    public Model getModel() {
       return model;
        }
    public ControlEvents getCtrl() {
        return ctrl;
        }
    public BaseUser(ControlEvents ev, Model model0, UserData data){
        myData = data;
        ctrl = ev;
        model = model0;
        }
    @Override
    public String getName() {
            return "???";
        }
    }

