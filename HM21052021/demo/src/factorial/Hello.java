package factorial;

import com.Factorial;

import javax.swing.*;

public class Hello {
    public static void main(String[] args) {
        System.out.println("HELLLLO");
        JOptionPane.showMessageDialog(null, "Hello Demo Module!");

        int a = 6;
        int b = Factorial.calculate(a);
        System.out.printf("Factorial of %d is equal to %d \n", a, b);
    }
}
