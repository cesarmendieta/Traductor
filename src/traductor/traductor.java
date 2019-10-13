/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;


public class traductor {

    
   /* public static void main(String[] args) {
        
    String entrada = "0100110100110";
    char [] cadena = entrada.toCharArray();
    System.out.println("resultado:" + p(cadena,0).toString());    
   
    }
    */
 
    static Integer p( char [] entrada, int i){
        if(entrada.length > i ){
            if(entrada[i] == '0'){
                return S0(entrada,i+1);
            }
            else if(entrada[i] == '1'){
                return S1(entrada,i+1);
            }
        }
            
        return 0;
        
    }
    
    static Integer S0( char [] entrada, int i){
        
        if(entrada.length > i ){
            if(entrada[i] == '0'){
                return T0(entrada,i+1);
            }
            else if(entrada[i] == '1'){
                return S1(entrada,i+1);
            }
        }
        
        return 0;
        
    }
    static Integer T0( char [] entrada, int i){
        
        if(entrada.length > i ){
            if(entrada[i] == '0'){
                int r = S0(entrada,i+1);
                return 1;
            }
            else if(entrada[i] == '1'){
                return S1(entrada,i+1);
            }
        }
        
        return 0;
    }
    static Integer S1( char [] entrada, int i){
        
        if(entrada.length > i ){
            if(entrada[i] == '0'){
                return S0(entrada,i+1);
            }
            else if(entrada[i] == '1'){
                return T1(entrada,i+1);
            }
        }
        
        return 0;
    }
    static Integer T1( char [] entrada, int i){
        
        if(entrada.length > i ){
            if(entrada[i] == '0'){
                return S0(entrada,i+1);
                
            }
            else if(entrada[i] == '1'){
                int r = S1(entrada,i+1);
                return 1;
            }
        }
        
        return 0;
    }
}
