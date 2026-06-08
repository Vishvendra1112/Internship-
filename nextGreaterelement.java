import java.util.*;
public class nextGreaterelement {    
     public static void nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack until we find a greater element
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        System.out.println("This is the next greater element for each element in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
     }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        nextGreaterElement(arr);
    }
}
