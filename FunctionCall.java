package OOPS.Methods;

public class FunctionCall {
    public static void main(String[] args) {
        add();
        mul(10,15);
        int res=add1(10,50);
        res=res*10;
        System.out.println(res);
        add2();


    }

    //void function without any parameter
    public static void add() {
        int a = 10;
        int b = 15;
        int c = a + b;
        System.out.println(c);
    }

    //void function with  parameter
    public static void mul(int a,int b){
        int c=a*b;
        System.out.println(c);

    }
    //no void with parameter
    public static int add1(int a ,int b){
        int c=a+b;
        return c;

    }
    //no void without parameter
    public static int add2(){
        int a=10;
        int b=30;
        int c=a+b;
        return c;
    }
}