
import javax.swing.JOptionPane;

public class areasFiguras {
    public static void main(String[] args) {
        String figura = JOptionPane.showInputDialog("Elija la figura para calcular el area \n"
                + "'a' area de triangulo \n"
                + "'b' area del cuadrado \n"
                + "'c' area del circulo \n"
                + "'d' area del rectangulo \n"
        );
        
        switch(figura){
            case "a":
                int base = Integer.parseInt(JOptionPane.showInputDialog("ingrese la base del triangulo: "));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("ingrese la altura del triangulo: "));
                int area = (base * altura) / 2;
                JOptionPane.showConfirmDialog(null, "el area del triangulo es de: " + area);
            break;
            case "b":
                int lado = Integer.parseInt(JOptionPane.showInputDialog("ingrese el lado del cuadrado: "));
                int area2 = lado * lado;
                JOptionPane.showConfirmDialog(null, "el area del cuadrado es de: " + area2);
            break;
            case "c":
                int radio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el radio del circulo: "));
                double area3 = 3.1415 * (radio * radio);
                JOptionPane.showConfirmDialog(null, "el area del triangulo es de: " + area3);
            break;
            case "d":
                int baseRec = Integer.parseInt(JOptionPane.showInputDialog("ingrese la base del triangulo: "));
                int alturaRec = Integer.parseInt(JOptionPane.showInputDialog("ingrese la altura del triangulo: "));
                int area4 = baseRec * alturaRec;
                JOptionPane.showConfirmDialog(null, "el area del triangulo es de: " + area4);
            break;
            default:
                JOptionPane.showConfirmDialog(null, "ingrese un valor valido");
            break;
        }
        
    }
      
}
