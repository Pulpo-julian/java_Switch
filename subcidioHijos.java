import javax.swing.JOptionPane;

public class subcidioHijos {
    public static void main(String[] args) {
        double subcidio = 35_000;
        int cantHijos = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de hijos"));
        
        switch(cantHijos) {
            case 0:
                JOptionPane.showConfirmDialog(null, "su subcidio es de 0");
            break;
            case 1:
                JOptionPane.showConfirmDialog(null, "su subcidio es de " + subcidio);
            break;
            case 2:
                subcidio = subcidio + (subcidio * 0.05);
                JOptionPane.showConfirmDialog(null, "su subcidio es de " + subcidio);
            break;
            case 3:
                subcidio = subcidio + (subcidio * 0.1);
                JOptionPane.showConfirmDialog(null, "su subcidio es de " + subcidio);
            break;
            case 4:
                subcidio = subcidio + (subcidio * 0.15);
                JOptionPane.showConfirmDialog(null, "su subcidio es de " + subcidio);
            break;
            case 5:
                subcidio = subcidio + (subcidio * 0.2);
                JOptionPane.showConfirmDialog(null, "su subcidio es de " + subcidio);
            break;
            default:
                subcidio = subcidio + (subcidio * 0.2);
                JOptionPane.showConfirmDialog(null, "tienes mas de 5 hijos y su subcidio es de " + subcidio);
            break;
            
        } 
    }
}
