package domino.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by romanow on 07.02.2018.
 */
public class DominoVH extends JPanel{
    final static int sz=40;
    private JButton b1,b2;
    private Domino dom;
    public Domino getDom() {
        return dom;
        }
    private DominoPushed back;
    public int getW(){ return sz; }
    public int getH(){ return sz*2; }
    public DominoVH(Domino dom, DominoPushed back0, boolean vert){
        back = back0;
        this.dom = dom;
        setLayout(null);
        b1 = new JButton();
        b1.setText(""+dom.getV1());
        b1.setBounds(0,0,sz,sz);
        ActionListener pp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                back.onPush(dom);
            }
        };
        b1.addActionListener(pp);
        add(b1);
        b2 = new JButton();
        b2.setText(""+dom.getV2());
        b2.setBounds(vert ? 0 : sz-5,vert ? sz-5 : 0,sz,sz);
        b2.addActionListener(pp);
        add(b2);
        setSize(vert ? sz : 2*sz,vert ? 2*sz : sz);
        }

}
