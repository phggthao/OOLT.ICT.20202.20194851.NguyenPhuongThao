//Linear System (with 2 variables) Solver
import javax.swing.JOptionPane;
class LinearSys {
    public int a11,a12,b1; //coefficients of the 1st eq
    public int a21,a22,b2; //coefficients of the 2nd eq

    public void result() {
        int D = a11*a22 - a21*a12;
        int Dx = b1*a22 - b2*a12;
        int Dy = a11*b2 - a21*b1;

        if (D!=0) JOptionPane.showMessageDialog(null,"The system has a unique solution (x1,x2) = (" + (float) Dx/D + "," + (float) Dy/D + ")");
        else if (D==0 && Dx==0 && Dy==0) JOptionPane.showMessageDialog(null,"The system has infinite solution");
        else JOptionPane.showMessageDialog(null,"The system has no solution"); 
    }
}

public class LinearSysSolve {
    public static void main(String[] args) {
        LinearSys sys = new LinearSys();

        String a_11 = JOptionPane.showInputDialog("Enter coefficient a11: ");
        sys.a11 = Integer.parseInt(a_11);
        String a_12 = JOptionPane.showInputDialog("Enter coefficient a12: ");
        sys.a12 = Integer.parseInt(a_12);
        String b_1 = JOptionPane.showInputDialog("Enter coefficient b1: ");
        sys.b1 = Integer.parseInt(b_1);
        String a_21 = JOptionPane.showInputDialog("Enter coefficient a21: ");
        sys.a21 = Integer.parseInt(a_21);
        String a_22 = JOptionPane.showInputDialog("Enter coefficient a22: ");
        sys.a22 = Integer.parseInt(a_22);
        String b_2 = JOptionPane.showInputDialog("Enter coefficient b2: ");
        sys.b2 = Integer.parseInt(b_2);

        sys.result();
    }
}