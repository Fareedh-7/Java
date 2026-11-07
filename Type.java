public class Type {
    // Type casting , conversion and promotion
    public static void main(String[] args){
        // ! Type Conversion
        int a = 20;
        long b = a;

        System.out.println(b);

        byte c = 30;
        short d = c;
        System.out.println(d);

        // ! Type Casting
        int e = 250;
        byte f = (byte) e;
        System.out.println(f);

        // ! Type Promotion

        byte num1 = 30;
        byte num2 = 50;

        int result = num1 + num2;
        System.out.println(result);

        byte number = 30;
        float price = 34.5f;

        float result1 = number + price;
        System.out.println(result1);
    }
}