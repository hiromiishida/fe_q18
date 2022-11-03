public class Main {
    public static void main(String[] args) {
        function2();
    }

    private static void function1(){
        function3();
        function4();
        System.out.println("A");
    }

    private static void function2(){
        function4();
        function1();
        System.out.println("B");
    }

    private static void function3(){
        System.out.println("C");
    }

    private static void function4(){
        function3();
        System.out.println("D");
    }
}