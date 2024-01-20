package Question2;

public class OrderOfExecution {
    private static int staticField = staticMethod1();

    private int instanceField1 = instanceMethod1();
    private int instanceField2;


    //static Methods
    public static int staticMethod1(){
        System.out.println("Initializing static method1");
        return 1;
    }
    public static void staticMethod2(){
        System.out.println("Initializing static method2");

    }
    //Instance Methods
    public int instanceMethod1() {
        System.out.println("Instance Method 1");
        return 2;
    }
    public void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    // Static initialization block
    static {
        System.out.println("Executing Initialization Block 1");
        System.out.println("StaticField = " + staticMethod1());

    }
    static {
        System.out.println("Static Initialization Block 2");

    }
    //Instance initialization block
    {
        System.out.println("Instance Initialization Block 1");
        instanceField1 = 4;
    }

    {
        System.out.println("Instance Initialization Block 2");
        instanceField2 = 5;
    }
    //Constructors
    public OrderOfExecution() {
        System.out.println("Empty Constructor - Constructor 1");
    }

    public OrderOfExecution(int instanceField1) {
        this.instanceField1 = instanceField1;
        System.out.println("Constructor 2 with parameter: " + instanceField1);
    }



}
