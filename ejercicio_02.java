
import javax.swing.JOptionPane;


public class ejercicio_02 {
    public static void main(String[] args) {
        String numDia;
        
        
        numDia = JOptionPane.showInputDialog("Escriba el nombre del dia en minusculas");
                
        switch(numDia){
        case "domingo": 
            JOptionPane.showConfirmDialog(null,"1");
        break;
        case "lunes": 
            JOptionPane.showConfirmDialog(null, "2");
        break;
        case "martes": 
            JOptionPane.showConfirmDialog(null, "3");
        break;
        case "miercoles": 
            JOptionPane.showConfirmDialog(null, "4");
        break;
        case "jueves": 
            JOptionPane.showConfirmDialog(null, "5");
        break;
        case "viernes": 
            JOptionPane.showConfirmDialog(null, "6");
        break;
        case "sabado": 
            JOptionPane.showConfirmDialog(null, "7");
        break;
        default:
            JOptionPane.showConfirmDialog(null, "el nombre del dia es incorrecto");
        break;
        
        }
    }
}