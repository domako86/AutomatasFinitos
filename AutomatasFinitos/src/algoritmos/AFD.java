/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.ArrayList;
import java.util.List;
import transiciones.TransicionAFD;

/**
 *
 * @author Fran
 */
public class AFD {
    private int[] estados;
    private String inicio;
    private String fin;
    private List<TransicionAFD> transiciones;
    
    public AFD(){
        transiciones = new ArrayList<>();
    }
    
    
}
