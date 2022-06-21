package a1_BasicSyntax;

public class a15_Operators {

    public static void main(String[] args) {
//        percentageDivide();
//        incrementDecrement();
    }


    static void incrementDecrement() {
        int x = 10;
        int y = ++x;
        System.out.println(y);
        System.out.println(++x);
        System.out.println(x++);

        int z = 2;
        int result = z++ + z++ * ++z / z++ - ++z + 5;
        // 2 + 3 * 5 / 5 - 7 + 5
        System.out.println(result);
        System.out.println(z);

    }

    static void percentageDivide() {
        int n1 = 100;
        System.out.println("% will divide -> " + n1 % 40);

    }


    static void arithmeticOperators() {
        /*
                 + ( Addition ) Adds values on either side of the operator
                 - ( Subtraction ) Subtracts right hand operand from left hand operand
                 * ( Multiplication ) Multiplies values on either side of the operator
                 / (Division) Divides left hand operand by right hand operand
                % (Modulus) Divides left hand operand by right hand operand and returns remainder
                ++ (Increment) Increases the value of operand by 1
                -- ( Decrement ) Decreases the value of operand by 1
        */
    }

    static void relationalOperators() {
        /*
                == (equal to) Checks if the values of two operands are equal or not, if yes then condition becomes true.
                != (not equal to) Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.
                > (greater than) Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.
                < (less than) Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.
                >= (greater than or equal to) Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.
                <= (less than or equal to) Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.
       */
    }

    static void logicalOperators() {
        /*
                && (logical and) Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.
                || (logical or) Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.
                ! (logical not) Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.
       */
    }

    static void assignmentOperators() {
        /*
                = Simple assignment operator. Assigns values from right side operands to left side operand
                += Add AND assignment operator. It adds the right operand to the left operand and assign the result to the left operand.
                -= Subtract AND assignment operator. It subtracts the right operand from the left operand and assigns the result to the left operand.
                *= Multiply AND assignment operator. It multiplies the right operand with the left operand and assigns the result to the left operand.
                /= Divide AND assignment operator. It divides the left operand with the right operand and assigns the result to the left operand.
                %= Modulus AND assignment operator. It takes modulus using two operands and assigns the result to the left operand.
       */
    }

    static void ternaryOperators() {
        /*
                bool condition ? <if-true returns this part of code> : <if-false returns this part>
       */
    }
}
