public class PrintOrdusingRec {
    public static void PrintOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PrintOrder(n-1);     //recursive call to function itself
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        int n=12;
        PrintOrder(n);  //call and passing value to the function
    }
}
