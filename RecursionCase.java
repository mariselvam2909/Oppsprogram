package OOPS.Recursion;

public class RecursionCase {
    public static void main(String[] args) {
        Num(10);

    }
    public static void Num(int n){
        //BaseCase
        if(n==1){
            System.out.println(1);
        }
        //RecurseCase
        else{
            System.out.println(n);
            Num(n-1);

        }
    }
}
