/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power;

public class POWER {

    public static int Power(int base, int power) {
        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        double x = Power(2,3);
        System.out.println(x);
    }

}
