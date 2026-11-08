public class Operators {
    // ! Operators
    public static void main (String[] args){
        // ! 1.Arithmetic Operation(Performs Mathematical Operations)
        // ! +,-,*,/,%

        System.out.println("Arithmetic Operators");

        int a = 200;
        int b = 100;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // ! 2.Assignment Operators(Assigning Values to a Variable)
        // ! =,+=,-=,*=,/=,%=
        
        System.out.println("Assignment Operators");

        a = 20;
        System.out.println(a);

        a += 10; // ? a = a + 10
        System.out.println(a);

        a -= 40; // ? a = a- 10
        System.out.println(a);

        a *= 2; // ? a = a * 10
        System.out.println(a);

        a /= 5; // ? a = a / 10
        System.out.println(a);

        a %= 10; // ? a = a % 10
        System.out.println(a);

        // ! 3.Relational Operators(Comparing two values or variables)
        // ! ==,!=,>,<,>=,<=

        System.out.println("Relational Operators");

        boolean isEqual = a == b;
        System.out.println(isEqual);

        boolean notEqual = a != b;
        System.out.println(notEqual);

        boolean isGreater = a > b;
        System.out.println(isGreater);

        boolean isLesser = a < b;
        System.out.println(isLesser);

        boolean isGreaterOrEqual = a >= b;
        System.out.println(isGreaterOrEqual);

        boolean isLesserOrEqual = a <= b;
        System.out.println(isLesserOrEqual);

        // ! 4.Logical Operators (Compare)
        // ! &&,||,!

        System.out.println("Logical Operators");

        int num1 = 20;
        int num2 = 30;

        int num3 = 50;
        int num4 = 30;

        boolean and = num1 > num2 && num3 < num4;
        System.out.println(and);

        boolean or = num1 < num2 || num3 < num4;
        System.out.println(or);

        boolean not = !(num1 > num2);
        System.out.println(not);

        // ! 5.Unary Operators

        // ? Increament and Decreament

        // ? Increament (Pre Increament and Post Increament)

        // ? Pre Increament 

        System.out.println("Pre Increament");

        int pre = 30;

        System.out.println(++pre);
        System.out.println(++pre);
        System.out.println(++pre);

        // ? Post Increament

        System.out.println("Post Increament");

        int post = 40;

        System.out.println(post++);
        System.out.println(post++);
        System.out.println(post++);

        // ? Pre Decreament

        System.out.println("Pre Decreament");

        int preDec = 30;

        System.out.println(--preDec);
        System.out.println(--preDec);
        System.out.println(--preDec);

        // ? Post Decreament

        System.out.println("Post Decreament");

        int postDec = 30;

        System.out.println(postDec--);
        System.out.println(postDec--);
        System.out.println(postDec--);

        // ! 6.Bitwise Operators(Performs Operations on bit values(0's and 1's))
        // ! &,|,^,~,>>,<<,>>>

        System.out.println("Bitwise Operators");

        int bit1 = 5;        
        int bit2 = 10;
        System.out.println(bit1 & bit2);

        System.out.println(bit1 | bit2);

        System.out.println(bit1 ^ bit2);

        System.out.println(~bit2); // ! -(a+1)

        System.out.println(bit1<<2); // ! (a * 2^n)

        System.out.println(bit1>>2); // ! (a / 2^n)

        // ! 7.Ternary Operators (Shorthand Property of If Else)

        int age = 18;
        String Eligible = (age > 18) ? "Yes" : "No";
        System.out.println(Eligible);
    }
}
