package October.ex_11102024;

public class Lab011_Task2_OperatorsExample {
    public static void main(String[] args) {

        // 1. Arithmetic Operators - Used to perform basic mathematical operations.
        //1. Addition; 2. Subtraction; 3. Multiplication; 4. Division; 5. Modulus
        int a = 21;
        int b = 7;
        // Addition
        int sum = (a+b);
        System.out.println("Results for Arithmetic Operators Samples:");
        System.out.println("Addition of a and b is: " + sum);
        // Subtraction
        int diff = (a-b);
        System.out.println("Subtraction of a and b is: " + diff);
        // Multiplication
        int product = (a*b);
        System.out.println("Multiplication of a and b is: " + product);
        // Division
        int division = (a/b);
        System.out.println("Division of a and b is: " + division);
        // Modulus
        int modulus = (a%b);
        System.out.println("Modulus of a and b is: " + modulus);
        System.out.println();


        //2. Relational Operators - Used to compare two values or variables.Always return true or false
        /* Equal to: ==
    Not equal to: !=
    Greater than: >
    Less than: <
    Greater than or equal to: >=
    Less than or equal to: <= */

        int c = 60;
        int d = 61;
        System.out.println("Results for Relational Operators Samples:");
        System.out.println(c==d);
        System.out.println(c!=d);
        System.out.println(c>d);
        System.out.println(c<d);
        System.out.println(c>=d);
        System.out.println(c<=d);
        System.out.println();

        //3. Logical Operators - Used to combine multiple boolean expressions.
        //  1. AND: &&  2.  OR: ||   3.  NOT: !
        boolean e = true;
        boolean f = false;
        boolean andResult = e && f;
        System.out.println("Results for Logical Operators Samples:");
        System.out.println(andResult);
        boolean orResult = e || f;
        System.out.println(orResult);
        boolean notResult1 = !e;
        boolean notResult2 = !f;
        System.out.println(notResult1);
        System.out.println(notResult2);
        System.out.println();

       // 4. Bitwise Operators - Operate on bits and perform bit-level operations.
        /* AND: &    OR: |  XOR: ^  Complement: ~   Left shift: <<  Right shift: >>
        Unsigned right shift: >>> */

        int g = 5;  // binary: 0101
        int h = 3;  // binary: 0011
        System.out.println("Results for Bitwise Operators Samples:");
        int bitwiseAnd = g & h;  // 0001 (1 in decimal)
        System.out.println(bitwiseAnd);
        int bitwiseOr = g | h;   // 0111 (7 in decimal)
        System.out.println(bitwiseOr);
        int bitwiseXor = g ^ h;  // 0110 (6 in decimal)
        System.out.println(bitwiseXor);
        int bitwiseComplement = ~g;  // 1111...1010 (-6 in decimal, assuming 32-bit integer)
        System.out.println(bitwiseComplement);
        int leftShift = g << 1;  // 1010 (10 in decimal)
        System.out.println(leftShift);

        int rightShift = g >> 1; // 0010 (2 in decimal)
        System.out.println(rightShift);
        int unsignedRightShift = -8 >>> 1; // 2147483644 (31 1's followed by 2 0's in binary)
        System.out.println(unsignedRightShift);
        System.out.println();

        //5. Assignment Operators - Used to assign values to variables.
        /* Simple assignment: = ;  Add and assign: += ; Subtract and assign: -=
        Multiply and assign: *= ;  Divide and assign: /= ; Modulus and assign: %= */
        System.out.println("Results for Assignment Operators Samples:");
        int i = 10; // Simple assignment
        System.out.println(i);
        i += 5;  // Add and assign - i = i + 5; i is now 15
        System.out.println(i);
        i -= 3;  // Subtract and assign - i = i - 3; i is now 12
        System.out.println(i);
        i *= 2;  // Multipy and assign - i = i * 2; i is now 24
        System.out.println(i);
        i /= 4;  // Divide and assign -  i = i / 4; i is now 6
        System.out.println(i);
        i %= 4;  // Modulus and assign i = i % 4; i is now 2
        System.out.println(i);
        System.out.println();

    //6.Unary Operators - Operate on a single operand.
    /*  Unary plus: + (indicates a positive value)
        Unary minus: - (negates the value)
        Increment: ++ (increases value by 1)
        Decrement: -- (decreases value by 1) */
        System.out.println("Results for Unary Operators Samples:");
        int j= 5;
        int k =-2;
        int l = k + 3;
        String first_name ="balaji";
        String last_name = "chandran";
        int m = 50;
        int n = 51;
        System.out.println(first_name + last_name + m + n);
        // first operator performed as concatination  // result = balajichandran5050
        System.out.println( k + n + first_name + last_name);// first maths operation then concatination
        System.out.println(l);
        System.out.println();

        //7.Ternary Operator - A shorthand for an if-else statement, also known as the conditional operator.
     /*    Syntax: condition ? expression1 : expression2
        Example: int result = (a > b) ? a : b; */
        System.out.println("Results for Ternary Operators Samples:");
        int max = (m > n) ? m : n;
        System.out.println(max);
        System.out.println();
    // 8. Instanceof Operator - Used to test whether an object is an
        // instance of a specific class or interface. Example: if (obj instanceof MyClass)
        System.out.println("Results for Instanceof Operators Samples:");
        String str = "Hello";
        boolean isString = str instanceof String;  // true
        System.out.println(isString);




    }
}
