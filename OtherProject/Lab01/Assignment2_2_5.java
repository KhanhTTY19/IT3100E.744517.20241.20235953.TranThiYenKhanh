//Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users. 
import javax.swing.JOptionPane;
public class Assignment2_2_5 {
    public static void main(String args[]) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Enter first number: ", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Enter second number: ", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double s = num1 + num2, sub = num1 - num2, mul = num1*num2, sp = num1/num2;

        JOptionPane.showMessageDialog(null, "Sum: " + String.valueOf(s) + "\n" 
                                          + "Substraction: " + String.valueOf(sub) + "\n"
                                          + "Multiplication: " + String.valueOf(mul) + "\n"
                                          + "Division: " + String.valueOf(sp) + "\n", "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    
}
