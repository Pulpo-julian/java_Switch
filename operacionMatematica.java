
import javax.swing.JOptionPane;


public class operacionMatematica {
    public static void main(String[] args) {
        int numUno = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
        int numDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
        String operador = JOptionPane.showInputDialog("ingrese el caracter que representa la operacion (+ , -, *, /)");
        int resultado = 0;
        
        
        switch(operador) {
            case "+":
                resultado = numUno + numDos;
                JOptionPane.showConfirmDialog(null,"el resultado de la suma es: " + resultado);
            break;
            case "-":
                resultado = numUno - numDos;
                JOptionPane.showConfirmDialog(null,"el resultado de la resta es: " + resultado);
            break;
            case "*":
                resultado = numUno * numDos;
                JOptionPane.showConfirmDialog(null,"el resultado de la multiplicacion es: " + resultado);
            break;
            case "/":
                if(numDos == 0) {
                    JOptionPane.showConfirmDialog(null,"no se puede dividir por 0");
                } else {
                    resultado = numUno / numDos;
                    JOptionPane.showConfirmDialog(null,"el resultado de la division es: " + resultado);
                }
            break;
            default:
                    JOptionPane.showConfirmDialog(null,"ingrese valores correctos");
            break;
        }
        
    }
}
