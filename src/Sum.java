public class Sum {
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1 + num2 + num3;
        System.out.println("Sum of numbers is = "+sum);
        if(sum < 10)
        {
            sum += 100;
        }
        if(num2 < 30)
        {
            throw new ArithmeticException("Number tooo large");
        }

        System.out.println("Sum is = "+sum);
    }
}
