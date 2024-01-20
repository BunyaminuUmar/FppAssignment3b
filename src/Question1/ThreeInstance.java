package Question1;

public class ThreeInstance {
    private static ThreeInstance instance1 = null;
    private static ThreeInstance instance2 = null;
    private static ThreeInstance instance3 = null;

    private ThreeInstance(){

    }
    public static  ThreeInstance getInstance1(){
        if (instance1==null){
            instance1 = new ThreeInstance();
        }
        return instance1;
    }
    public static  ThreeInstance getInstance2(){
        if (instance2==null){
            instance2 = new ThreeInstance();
        }
        return instance2;
    }
    public static  ThreeInstance getInstance3(){
        if (instance3==null){
            instance3 = new ThreeInstance();
        }
        return instance3;
    }
}
