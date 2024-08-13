public class FactRecuesion {
    public static int Factorial(int n){
       if(n==0){
        return 1;
       }
        int fnm=Factorial(n-1);
        int fn=n*fnm;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.err.println(Factorial(n));
    }
    
}
