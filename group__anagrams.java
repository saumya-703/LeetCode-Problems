import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class group__anagrams {
        public static List<List<String>> group_anagrams(String str[]){
        
        //List to all the possible groups in the list
        List<List<String>> allgroup = new ArrayList<>();

        for(int i=0;i<str.length;i++){
            if(str[i]==null){
                continue;
            }
            List<String> list= new ArrayList<>();
            String s1= str[i];
            char[] ch1= s1.toCharArray();
            Arrays.sort(ch1);
            for(int j=0;j<str.length;j++){
                if(str[j]==null){
                    continue;
                }
                String s2= str[j];
                char[] ch2= s2.toCharArray();
                Arrays.sort(ch2);
                if(Arrays.equals(ch1, ch2)==true){
                    list.add(s2);
                    str[j]= null;
                }
            }
            allgroup.add(list);
        }
        return allgroup;
    }

    public static void main(String[] args) {
        String str[]={"eat","tea","tan","ate","nat","bat"};
        System.out.println(group_anagrams(str));
    }
}
