/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.or.difference;
import java.util.Scanner;
/**
 *
 * @author konda babu
 */
public class SumOrDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
           int N1=input.nextInt();
        int N2=input.nextInt();
        if(N1>N2)
           System.out.println(N1-N2);
        else
           System.out.println(N1+N2);
 
    }
    
}
