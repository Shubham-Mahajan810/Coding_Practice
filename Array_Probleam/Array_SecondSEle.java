import java.util.Arrays;


public class Array_SecondSEle {

    public static void  fetchSecondSmallest(int[]arry){
        int secondSmallestElement = Arrays.stream(arry).sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Array length must be at least 2"));
        System.out.println(secondSmallestElement);
    }

    public static void main(String[] args) {
        int numbers[]={5,2,8,3,1};
        fetchSecondSmallest(numbers);
    }
}




