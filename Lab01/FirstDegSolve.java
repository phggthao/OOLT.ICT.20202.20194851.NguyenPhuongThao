//First Degree Equation Solver
import javax.swing.JOptionPane;
class FirstDegEq {
    public int a;
    public int b;
    public void result() {
        if (a==0 && b==0) JOptionPane.showMessageDialog(null,"The equation has infinite solution");
        else if (a==0 && b!=0) JOptionPane.showMessageDialog(null,"The equation has no solution");
        else if (a!=0) JOptionPane.showMessageDialog(null,"x = " + (float)(-b)/a);
    }
}
 
public class FirstDegSolve {
    public static void main(String[] args) {
        FirstDegEq eq = new FirstDegEq();
        String a1 = JOptionPane.showInputDialog("Enter coefficient a: ");
        eq.a = Integer.parseInt(a1);
        String b1 = JOptionPane.showInputDialog("Enter coefficient b: ");
        eq.b = Integer.parseInt(b1);
        eq.result();
    }
}