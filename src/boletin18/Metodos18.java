package boletin18;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Metodos18 {

    private int numero;

    private int arrayNumeros[] = new int[6];

    public Metodos18() {
    }

    public void cargarArray() {

        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i]=i;
        }

    }
    
   public void visualizarArray(){
       int x;
   for (int j = 0; j < arrayNumeros.length; j++) {
       x= (int) (Math.random()*50);
       
     arrayNumeros[j]=Math.round(x);
       
     JOptionPane.showMessageDialog(null, x);
   
   }
   
   
   
   }

}
