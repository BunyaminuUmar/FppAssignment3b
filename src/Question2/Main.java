package Question2;

public class Main {
    public static void main(String[] args) {
        OrderOfExecution obj1 = new OrderOfExecution();
        OrderOfExecution obj2 = new OrderOfExecution(43);

        /*
        Explanation of the order of execution.
        The order of execution of this program is as follows:
        1. The Static variables are first initialized and this happens only once.
        2. The static blocks are then executed in the order in which they appear. The static blocks also execute once.
        3. Instance variables are then initialized with their default values.
        4. Instance initialization blocks are also executed in the order in which they appear in the class.
        5. Lastly the constructor methods are executed based on the order they appear. Hence, in this case the first empty constructor is executed and then the second constructor with one argument is also called.


         */

    }
}