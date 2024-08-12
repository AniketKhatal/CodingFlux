public class printnumusingrec {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);     //recursive call to function itself
    }
    public static void main(String[] args) {
        int n=12;
        printDec(n);  //call and passing value to the function
    }
}
