import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CalorieConverter {

    static void Intro(){

        JOptionPane.showMessageDialog(null,"Enter 1 to convert kilocalories (kcal) to kiloJoules (kJ).\nEnter 2 to convert kiloJoules(kJ) to kilocalories (kcal).");
        JOptionPane.showMessageDialog(null,"The exchange rate is 1kcal = 4.184kj");

    }
    static void KJ(){

        String s2 = JOptionPane.showInputDialog("Enter food calorie in kcal");//User enter the food calorie on kcal.
		double n2 =  Double.parseDouble(s2);//n2 represents the food calorie in kcal(input by user).
	    double kc = n2 *4.184;
	    double v1=Math.round(kc*1000)/1000.0;//v1 represents the food calorie in kJ(after rounding off to 2 decimal places).
	    JOptionPane.showMessageDialog(null,"Total = " + v1 +"kJ");

    }

    static void KCAL(){

        String s3 = JOptionPane.showInputDialog("Enter food calorie in kJ");//User enter the food calorie in kJ.
		double n3 =  Double.parseDouble(s3);//n3 represents the food calorie in kcal(input by user).
	    double kj = n3 * 1/4.184;
	    double v2=Math.round(kj*1000)/1000.0;//v2 represents the food calorie in kJ(after rounding off to 2 decimal places).
	    JOptionPane.showMessageDialog(null,"Total = " + v2 +"kcal");

    }

    static void Error(){

	    JOptionPane.showMessageDialog(null,"Invalid input! Please enter valid input!");


    }

    public static void main(String[] args){

        Intro();
        String s1 = JOptionPane.showInputDialog("Please select your choice.");//User enters his/her choice.
        int n1 = Integer.parseInt(s1);

            switch(n1){

            case(1):{

                KJ();
                break;

            }

            case(2):{

                KCAL();
                break;

            }

            default:{

                Error();
                break;

            }

        }

    }

}
