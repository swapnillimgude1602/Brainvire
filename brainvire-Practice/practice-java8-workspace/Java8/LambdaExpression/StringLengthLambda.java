package Java8.LambdaExpression;

/**
 * StringLengthLambda
 */
public class StringLengthLambda {

    public static void main(String[] args) {

        StringLength s1 = s -> System.out.println("String Length is:" + s.length());
        s1.stringLen("Swapnil");

    }
}