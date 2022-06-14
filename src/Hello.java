import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello {
    public static void main(String[] args) {

        List<Integer> list = List.of(12,15,13,14,10);


        System.out.println("list is"+list);

       //Stream<Integer> stream = list.stream();
        List<Integer> evenList = list.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
        List<Integer> maxList = list.stream().filter(i -> i>10).collect(Collectors.toList());

        Stream<Object> emptyStream = Stream.empty();
        String name[] = {"Jemy","Riddhi","Shivu","abc"};
        Stream<String> names = Stream.of(name);
        names.forEach(e->{
            System.out.println(e);
        });

       // Arrays.stream(name).forEach(System.out::println);
        //name.stream().forEach(System.out::println);
        Arrays.stream(name).sorted().forEach(System.out::println);
        System.out.println("new added sentence");
//        System.out.println("even list"+evenList);
//        System.out.println("max list"+maxList);
    }
}
