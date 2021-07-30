import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification, strResult;
        
        strNum1 = JOptionPane.showInputDialog(null, 
                    "Please input the first double number: ", "Input the first number", 
                    JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, 
                    "Please input the second double number: ", "Input the second number", 
                    JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double quotient = num1/num2;

        strResult = "Sum = " + sum + "\nDifference = " + diff + "\nProduct = " + prod + "\nQuotient = " + quotient;
        strNotification = "The sum, difference, product, quotient of " + strNum1 + " and " + strNum2 + ":\n" + strResult;

        JOptionPane.showMessageDialog(null, strNotification, "Calculate two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
