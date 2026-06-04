// fibonacci series using iterative approach
/*public class fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int a =0;
        int b= 1;
        for(int i=1;i<=n;i++){
            System.out.println(a+"");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}*/
public class fibonacci{
    public static int fibonacci(int n ) {
        if(n==0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
