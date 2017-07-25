/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dama;

/**
 *
 * @author jai
 */
public class tablero {
    private ficha[] blancas;
    private ficha[] negras;
     
    //Numero de fichas de cada coloer en el tabler.
    //Numero de movimiento de las fichas de cada color.

    public tablero() {
        
        byte x = 1;
        byte y = 1;
        final byte MOV = 2;
        final byte N_FICHAS = 20;
        
        for (int i=0; i < N_FICHAS  ;i++){
            
            if(( i != 5 )||( i != 10 )){   
                this.blancas[i] = new ficha(false,false,x,y);
                x = (byte) (MOV + x);
            }else{
                if((y % 2) != 0){
                   this.blancas[i] = new ficha(false,false,x,y);
                   y++;
                   x = 1;
                }else{
                   this.blancas[i] = new ficha(false,false,x,y);
                   y++;
                   x = 2;
                }
            }
        }
    }
        
           
        
        
    }

  
   
    
    
}
