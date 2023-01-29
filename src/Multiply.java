public class Multiply {

    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int product = num1 * num2 * num3;
        System.out.println("Product of 3 number = "+product);


        if(num2 < 30)
        {
            throw new ArithmeticException("Number tooo large");
        }

        System.out.println("Product is = "+product);
    }
}
