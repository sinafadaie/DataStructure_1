package section_4.exercise_4;

public class Main {
    public static void main(String[] args){
        BalancedExpressions balancedExpressions = new BalancedExpressions();

        String expression = "{[(1+2)-[(1-2)]]}";
        boolean balanced = balancedExpressions.balanced(expression);
        System.out.println(balanced);

        expression = "{[(1+2)-[(1-2)]]}[";                        //expression is on the stack memory
        balanced = balancedExpressions.balanced(expression);      //he just store address of heap obj
        System.out.println(balanced);                             //now he store new address, because new String obj has created!

        expression = ")";                                         //need exception!
        balanced = balancedExpressions.balanced(expression);
        System.out.println(balanced);
    }
}
