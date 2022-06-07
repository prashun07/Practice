import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//check certain key k presents in the array of size n
public class Array01 {
    public static void main(String args[])
    {
        int n;
        int key;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int arr []=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(scanner.next());
        }
        key=scanner.nextInt();
        boolean checkKey=CheckKey(arr,n,key);
        System.out.println("Array :"+Arrays.toString(arr));
        System.out.println(key+" is present in the array:"+checkKey);
    }

    private static boolean CheckKey(int[] arr, int n, int key) {
//        for(var i:arr)
//        {
//            if(i==key)
//            {
//                return true;
//            }
//        }
//        Arrays.sort(arr);
//        int result=Arrays.binarySearch(arr,key);//Binary search not applied for negative numbers or unsorted
//        boolean answer=result>0?true:false;
        boolean answer= Arrays.asList(arr).contains(key);
//boolean answer= IntStream.of(arr).anyMatch(x->x== key
//);
        return answer;
    }
}
