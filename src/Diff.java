public class Diff {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int diff = 0;
        if(num1 > num2)
        {
            diff = num1 - num2;
        }
        else{
            diff = num2 - num1;
        }
        System.out.println("Difference is = "+diff);
    }
}
