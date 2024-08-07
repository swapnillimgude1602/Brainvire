package Java8.LambdaExpression;

@FunctionalInterface
interface addition {
    public void add(int a, int b);
}

class AdditionUsingLambda {
    public static void main(String[] args) {

        //Lambda INterface
        addition ad = (x, y) -> System.out.println("addition is: " + (x + y));
        ad.add(12, 12);     //Calling the function

        //Anonymous Inner class
        addition add = new addition() {

            @Override
            public void add(int a, int b) {
                // TODO Auto-generated method stub

                int result = a + b;
                System.out.println(result);
            }

        };

        add.add(10, 10);    //Calling the function

    }
}