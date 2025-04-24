import java.util.Arrays;
import java.util.HashSet;

public class Code_2799{
    //Finding Distinct element 
    public static int[] distinct(int [] arr){
        HashSet<Integer> ht= new HashSet<>();
        for(int i: arr){
            ht.add(i);
        }
        int narr[] = ht.stream().mapToInt(Integer::intValue).toArray();
        return narr;
    }
    public static void main(String[] args) {
        int [] arr= {1,3,2,1,2,3,4};
        System.out.println(Arrays.toString(distinct(arr)));
    }
}