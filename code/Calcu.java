/**
 * Diego Vásquez - 211628
 * Clase Calcu, que tiene los métodos necesarios 
 * para realizar las operaciones matemáticas.
 */


import java.util.ArrayList;

public class Calcu {

    //Método add que obtiene el primer operando y verifica los posibles fallos.
    public String add(ArrayList<Integer> num){
    String result = "";
        if(num.size() != 0){
        int suma = num.remove((num.size()-1));  
        if(num.size() == 0){
            result = "f"; //f se refiere al fallo.
        }else{
            while(!num.isEmpty()){
                suma += num.remove((num.size()-1));  
            }
            result = String.valueOf(suma);    
        }
        }else{
            result = "f";
        }
    return result;
    }

    //Método Substraction que hace la resta, obteniendo el primer operando y verifica los posibles fallos.
    public String Substraction(ArrayList<Integer> num){
    String result = "";
    if(num.size() == 0){result = "f";}
    else{
        int resta = num.remove((num.size()-1)); 
    if(num.size() == 0){
        result = "f";
    }else{
        while(!num.isEmpty()){
            resta  -= num.remove((num.size()-1));  
        }
        result = String.valueOf(resta);    
    }
    }
    return result;
    }
    
    //Método Divition, que realiza la división, obteniendo el primer operando y verifica los fallos
    public String Divition(ArrayList<Integer> num){
    String result = "";
    if(num.size() == 0){result = "f";}
    else{
        int divi = num.remove((num.size()-1));
    if(num.size() == 0){
        result = "f";
    }else{
        while(!num.isEmpty()){
            divi /= num.remove((num.size()-1));  
        }
        result = String.valueOf(divi);    
    }
    }
    return result;
    }
    
    //Método Multiply que realiza la multiplicación, obteniendo el primer operando y verifica los posibles fallos.
    public String Multiply(ArrayList<Integer> num){
        String result = "";
        if(num.size() == 0){result = "f";}
        else{
            int multi = num.remove((num.size()-1));

            if(num.size() == 0){
                result = "f";
            }else{
                while(!num.isEmpty()){
                    multi *= num.remove((num.size()-1));  
                }
                result = String.valueOf(multi);    
            }
        }
    return result;
    }   
     
    
}