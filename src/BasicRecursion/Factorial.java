package BasicRecursion;

public class Factorial {
    public int fact(int x){
        if(x==1||x==0){
            return 1;
        }
        return x*fact(x-1);
    }
}
