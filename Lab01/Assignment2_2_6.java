import javax.swing.JOptionPane;
public class Assignment2_2_6 {
    public static void main(String args[]) {
        String option;
        option = JOptionPane.showInputDialog(null, "Choose the index of type of equation: \n " 
                                                  +"1. first-degree equation (linear equation) with one variablen\n" 
                                                  +"2. system of first-degree equations (linear system) with two variables\n"
                                                  +"3. second-degree equation with one variable.", JOptionPane.INFORMATION_MESSAGE);

        if (option.equals("1")) { // String.equals(string) - compare values in string
            String strA, strB;

            strA = JOptionPane.showInputDialog(null, "Enter A: ", JOptionPane.INFORMATION_MESSAGE);
            double a = Double.parseDouble(strA);

            strB = JOptionPane.showInputDialog(null, "Enter B: ", JOptionPane.INFORMATION_MESSAGE);
            double b = Double.parseDouble(strB);

            if (a == 0) {
                if (b == 0) JOptionPane.showMessageDialog(null, "The equation has infinite solution","Result",  JOptionPane.INFORMATION_MESSAGE);
                else JOptionPane.showMessageDialog(null, "The equation has no solution","Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                double res = -b/a;
                JOptionPane.showMessageDialog(null, "The solution is x = " + String.valueOf(res),"Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        // 2. system of first-degree equations (linear system) with two variables
        else if (option.equals("2")){
            //input data
            String strA11, strA12, strA21, strA22, strB1, strB2;

            strA11 = JOptionPane.showInputDialog(null, "Enter a11: ", JOptionPane.INFORMATION_MESSAGE);
            double a11 = Double.parseDouble(strA11);
            strA12 = JOptionPane.showInputDialog(null, "Enter a12: ", JOptionPane.INFORMATION_MESSAGE);
            double a12 = Double.parseDouble(strA12);
            strB1 = JOptionPane.showInputDialog(null, "Enter b1: ", JOptionPane.INFORMATION_MESSAGE);
            double b1 = Double.parseDouble(strB1);
            strA21 = JOptionPane.showInputDialog(null, "Enter a21: ", JOptionPane.INFORMATION_MESSAGE);
            double a21 = Double.parseDouble(strA21);
            strA22 = JOptionPane.showInputDialog(null, "Enter a22: ", JOptionPane.INFORMATION_MESSAGE);
            double a22 = Double.parseDouble(strA22);
            strB2 = JOptionPane.showInputDialog(null, "Enter b2: ", JOptionPane.INFORMATION_MESSAGE);
            double b2 = Double.parseDouble(strB2);
            
            //Calculate determinant
            double D = a11*a22 - a21*a12, D1 = b1*a22 - b2*a12, D2 = a11*b2 - a21*b1;
            if (D == 0){ 
                if (D1 == 0 && D2 == 0)
                    JOptionPane.showMessageDialog(null, "The equation has infinite solution","Result",  JOptionPane.INFORMATION_MESSAGE);
                else JOptionPane.showMessageDialog(null, "The equation has no solution","Result",  JOptionPane.INFORMATION_MESSAGE);
            } else {
                double x = D1/D, y = D2/D;
                JOptionPane.showMessageDialog(null, "The solution is x = " + String.valueOf(x) + ", y = " + String.valueOf(y) ,"Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            String strA, strB, strC;

            strA = JOptionPane.showInputDialog(null, "Enter a: ", JOptionPane.INFORMATION_MESSAGE);
            double a = Double.parseDouble(strA);
            strB = JOptionPane.showInputDialog(null, "Enter b: ", JOptionPane.INFORMATION_MESSAGE);
            double b = Double.parseDouble(strB);
            strC = JOptionPane.showInputDialog(null, "Enter c: ", JOptionPane.INFORMATION_MESSAGE);
            double c = Double.parseDouble(strC);

            if (a == 0) {
                double res = -b/a;
                JOptionPane.showMessageDialog(null, "The solution is x = " + String.valueOf(res),"Result", JOptionPane.INFORMATION_MESSAGE);    
            } else {
                double delta = b*b - 4*a*c;
                if (delta < 0) JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
                else if (delta > 0) {
                    double square_root_delta = Math.sqrt(delta), f = -b/(2*a);
                    double x1 = f - square_root_delta, x2 = f + square_root_delta;
                    JOptionPane.showMessageDialog(null, "The solution is x1 = " + String.valueOf(x1) + ", x2 = " + String.valueOf(x2) ,"Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    double f = -b/(2*a);
                    JOptionPane.showMessageDialog(null, "The equation has one solution is x = " + String.valueOf(f),"Result", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        }

        System.exit(0);
    }
}
