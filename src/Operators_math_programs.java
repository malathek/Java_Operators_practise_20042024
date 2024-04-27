import static java.lang.Math.pow;

public class Operators_math_programs {
    public static void main(String[] args) {
        //Max between 3 Numbers with ? operators
        int a =80;
        int b=75;
        int c = 95;
        int max_num = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("The maximum number is  " + max_num);

        // increment Operator
        int d = 10;
        /*Guess
        11+11+12 =34
         */
        System.out.println(++d + d++ + d++);

        // increment & decrement Operator
        int e = 10;
        /*Guess
        9+9+11 =29
         */
        System.out.println(--e + e++ + ++e);
        //Value of x,y, z - double
        double x =2.3;
        double y=3.5;
        double z = -1.75;
        double power_of = 2;

        double result_1 = Math.pow(x,power_of);
        double result_2 = Math.pow(y,power_of);
        double result_3 = Math.abs(z);
        double result_final = Math.cbrt(result_1+result_2-result_3);

       System.out.println(result_final);


    }
}
