/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transiciones;

/**
 *
 * @author Fran
 */
public class TransicionAFD {
    private int estadoInicial;
    private char caracter;
    private int estadoFinal;
    
    public TransicionAFD(){
        this.estadoInicial = this.estadoFinal = 0;
        this.caracter = '1';
    }
    public TransicionAFD(int ini, char car, int fin){
        this.estadoInicial = ini;
        this.caracter = car;
        this.estadoFinal = fin;
    }
    
    public void setEstadoInicial(int ei) {   estadoInicial = ei;   }
    public void setCaracter (char car)   {   caracter = car;       }
    public void setEstadoFinal(int ef)   {    estadoFinal = ef;    }
    
    public int getEstadoInicial() { return estadoInicial;   }
    public char getCaracter()     { return caracter;        }
    public int getEstadoFinal()   { return estadoFinal;     }
    
}
