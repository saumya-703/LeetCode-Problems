//package Goofy Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class subarray {
    public static Character find_Onrepeating(String s){
        char ch[]=s.toCharArray();
        HashMap<Character, Integer> hmap= new HashMap<>();
        for(char c:ch){
            hmap.put(c,hmap.getOrDefault(c, 0)+1);
        }
        
        /*for(Map.Entry<Character, Integer> e: hmap.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }*/
        for(char c: ch){
            if(hmap.get(c)==1){
                return c;
            }
        }
    return null;
    }

    public static void Hahsmmap(String [] str){
        HashMap<String, Integer> hmap= new HashMap<>();
        for(String s: str){
            char [] ch= s.toCharArray();
            Arrays.sort(ch);
            hmap.put(s,hmap.getOrDefault(hmap, 0)+1);
        }
        for(Map.Entry<String,Integer> e: hmap.entrySet()){
            System.out.println(e.getKey()+" - "+e.getValue());
        }
    }
    public static List<String> group_anagrams(String str[]){
        List<String> list= new ArrayList<>();
        String scheck1=str[0];
        char[] ch1= scheck1.toCharArray();
        Arrays.sort(ch1);
        for(int i=0;i<str.length;i++){
            String scheck2= str[i];
            char[] ch2= scheck2.toCharArray();
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)==true){
                list.add(scheck2);
                str[i]=null;
            }
        }
        return list;
    }
    public static void main(String[] args) {
       //int [] arr= {2,3,5};
       //int k=5;
       //System.out.println(maxsubarray(arr, k));
       //String s= "hello";
       //System.out.println(find_Onrepeating(s));
       String str[]={"eat","tea","tan","ate","nat","bat"};
       //Hahsmmap(str);
       System.out.println(group_anagrams(str));
    }
}
