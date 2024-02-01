package JAD_3;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//This is for Practicing about streams
public class Main {


    public static void main(String[] args) throws IOException,ArithmeticException {
        Integer[] arr=new Integer[]{10,12,29,16,29,50};
        List<Integer> ls=Arrays.asList(arr);

        ArrayList<Integer> lss=new ArrayList<Integer>(Arrays.asList(new Integer[]{10,12,29,16,29,50}));
        System.out.println(lss);


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        List<Integer> sts=numbers.stream().filter((ele)->ele%2==0).map((ele)-> {
//            System.out.println(ele);
            return ele;
        }).sorted((s1,s2)->s2-s1).collect(Collectors.toList());


        Optional<Integer> ste=numbers.stream().filter((ele)->ele%2==0).map((ele)-> {
            return ele;
        }).sorted((s1,s2)->s2-s1).findFirst();
        if(ste.isPresent()){
            System.out.println(ste.get());
        }

        List<Integer> als=numbers.stream().map(ele->ele).toList();
        numbers.stream().forEach(System.out::println);

        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        names.stream().filter((ele)->(ele.startsWith("T")||ele.startsWith("R"))).forEach(System.out::println);

        Integer val=numbers.stream().reduce(0,(s1,s2)->s1+s2);
        System.out.println(val);


        List<String> name = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
// Enter your code here
        int[] average = name.stream()
                .mapToInt(String::length).toArray();
        System.out.println(Arrays.toString(average));
        try{
            int k=1/0;
        }catch (ArithmeticException e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
