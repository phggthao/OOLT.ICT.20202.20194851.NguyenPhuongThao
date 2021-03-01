//Second Degree Equation Solver
import javax.swing.JOptionPane;

class SecondDegEq {
    public int a,b,c;

    public void result() {
        int delta = b*b - 4*a*c;
        double delta_root = Math.pow(delta,0.5);
        double x1 = (-b+delta_root)/(2*a);
        double x2 = (-b-delta_root)/(2*a);

        if (a==0) {
            if (b==0 && c==0) JOptionPane.showMessageDialog(null,"The equation has infinite solution");
            else if (b==0 && c!=0) JOptionPane.showMessageDialog(null,"The equation has no solution");
            else if (b!=0) JOptionPane.showMessageDialog(null,"x = " + (float)(-c)/b);
        }

        else if (a!=0) {
            if (delta==0) JOptionPane.showMessageDialog(null,"The equation has double root x1 = x2 = " + (float)(-b)/(2*a));
            else if (delta>0) JOptionPane.showMessageDialog(null,"The equation has 2 distinct roots:\nx1 = " + x1 + "\nx2 = " + x2);
            else JOptionPane.showMessageDialog(null,"The equation has no solution");
        }
    }
}

public class SecondDegSolve {
    public static void main(String[] args) {
        SecondDegEq eq = new SecondDegEq();

        String a1 = JOptionPane.showInputDialog("Enter coefficient a: ");
        eq.a = Integer.parseInt(a1);
        String b1 = JOptionPane.showInputDialog("Enter coefficient b: ");
        eq.b = Integer.parseInt(b1);
        String c1 = JOptionPane.showInputDialog("Enter coefficient c: ");
        eq.c = Integer.parseInt(c1);

        eq.result();
    }
}