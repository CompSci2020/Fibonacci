/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author richardkaune
 */
public class Fibonacci {

    public static void main(String[] args) {
       int num = 6;
       int fibMinusOne=1, fibMinusTwo=1, temp=0;
       
       for (int i =3; i<num; i++){ // 3,4,5,6
           temp = fibMinusOne + fibMinusTwo;
           fibMinusOne = fibMinusTwo;
           fibMinusTwo = temp;
       }
       temp = fibMinusOne + fibMinusTwo;
        System.out.println("The fibonacci number at " + num + " is " + temp);
       
       //System.out.println("Fibonacci at " + num + " is " + fibo(num));
    }

//   public static int fibo (int n) {
//        if (n == 1 || n ==2) {
//            return 1; // 1,1,2,3,5,8...
//        } else {
//            return (fibo(n-1)+fibo(n-2));
//        }
//    }
    
}
