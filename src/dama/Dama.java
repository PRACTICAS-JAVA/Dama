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
public class Dama {
    
    /**
     * @param args the command line arguments
     */
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        byte x = 1;
        byte y = 1;
        final byte MOV = 2;
        final byte N_FICHAS = 20;
        ficha[] blancas = new ficha[N_FICHAS];
              
        
        for (int i=0; i < blancas.length  ;i++){
            
            if(( i != 5 )&&( i != 10 )&&( i != 15 )){   
                blancas[i] = new ficha(false,false,x,y);
                x = (byte) (MOV + x);
            }else{
               
                if((y % 2) != 0){
                    y++;
                    x = (byte)2;
                    blancas[i] = new ficha(false,false,x,y);
                    x = (byte) (MOV + x);
                }else{
                   y++;
                   x = (byte)1;
                   blancas[i] = new ficha(false,false,x,y);
                   x = (byte) (MOV + x);
                }
            }
           
        }
         for (int i=0; i < blancas.length  ;i++){
           System.out.println(blancas[i] );
         }
    }
    
}
