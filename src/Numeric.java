public class Numeric {
    public static void main(String[] args) {
        double itemPrice = 4.20;
        int numOfItems = 6;
        double totalValue = itemPrice * numOfItems;
        System.out.println("The total value is "+ totalValue);

        int num1 = (int)6.5;
        double num2 = 6;
        System.out.println("forced integer: " + num1);

        double base = 2.0;
        double power = 3.0;
        double cubed = Math.pow(base, power);
        System.out.println("The cube is " + cubed);

        double x = 9.0;
        double sqrt = Math.sqrt(x);
        System.out.println("The square root is " + sqrt);
    }
}
