package Buscaminas;

import javax.swing.JButton;
/**
 *
 * @author LUIS
 */
public class Cuadro extends JButton {
    
    private boolean mina;
    
    public Cuadro()
    {
        super();
        double random = Math.random();
        if (random>0.9) 
            mina=true;
        else
            mina=false;
    }
    
    public boolean estaMinado()
    {
        return mina;
    }
}
