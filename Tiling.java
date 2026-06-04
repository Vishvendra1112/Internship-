public class Tiling{
    public static int tiling(int n){
        if(n<4){
            return 1;
        }
        return tiling(n -1)+ tiling(n-4);
    }
    public static void main(String[] args) {
        System.out.println(tiling(8));
    }


}