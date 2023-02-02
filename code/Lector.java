import java.util.ArrayList;

/**
 * Diego Vásquez - 211628
 * Clase Lector que realiza el decode de los operandos y verifica fallos.
 * Valida la operacion y muestra el resultado, y obtiene todos los números.
 */

public class Lector {
    private Stack st = new Stack<Integer>();
    private Calcu calc = new Calcu();
    
    //Evalua los posibles errores de sintaxis y verifica que existan signos en la expresión.
    //Así mismo se observa que caracter estamos obteniendo. Y coloca el resultado en la pila.
    public String DecodeExpresion(String line){
    int result = 0;
    boolean evaluate = true;
    boolean valid = false;
    String message = "";
    for(int n = 0; n <line.length(); n ++){
        char c = line.charAt(n);
        switch(c){
            case '+' ->{
                ArrayList<Integer> in = NumbersGetter();
                String R = calc.add(in);
                if(R.equals("f")){
                    evaluate = false;
                }else{
                    result = Integer.valueOf(R);
                    st.push(result);
                    valid = true;
                }
            }
            case '-' ->{
                ArrayList<Integer> in = NumbersGetter();
                String R = calc.Substraction(in);
                if(R.equals("f")){
                    evaluate = false;
                    
                }else{
                    result = Integer.valueOf(R);
                    st.push(result);
                    valid = true;
                }
            }
            case '/'->{
                ArrayList<Integer> in = NumbersGetter();
                String R = calc.Divition(in);
                if(R.equals("f")){
                   evaluate = false;
                }else{
                    result = Integer.valueOf(R);
                    st.push(result);
                }

            }
            case '*'-> {
                ArrayList<Integer> in = NumbersGetter();
                String R = calc.Multiply(in);
                if(R.equals("f")){
                    evaluate = false;
                }else{
                    result = Integer.valueOf(R);
                    st.push(result);
                    valid = true;
                    
                }
            }
            default->{ //Verificacion de que sea un número.
                boolean number_check = Character.isDigit(c);
                if(number_check){
                    String c_string = String.valueOf(c);
                    st.push(Integer.valueOf(c_string));
                }
            }
        }
    }
    if (evaluate && valid){
     message = String.valueOf(result);
     
    }else{
        message = "Error de sintaxis";
        
    }
        return message;
    } 

    //Se obtiene el número.
    private ArrayList<Integer> NumbersGetter(){
         ArrayList<Integer> numbers = new ArrayList<>();
         while(!st.empty()) {
             int p = (int) st.pull();
             numbers.add(p);
         }
         return numbers;
     }
}