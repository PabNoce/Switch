/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author pnocedalopez
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sw=0;
        for(byte i=0; i<12;i++){
            switch (sw){
                case 0:
                    System.out.println("Hola");
                    sw=1;
                    break;
                case 1:
                    System.out.println("Adios");
                    sw=0;
                    break;
            }
        }
    }
    
}
