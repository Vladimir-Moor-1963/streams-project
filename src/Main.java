import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(0, 100));


        }
        System.out.println(list);
        List<Integer> newList = list.stream()
                .map((x) -> x + 4)
                .sorted(Comparator.reverseOrder())
                .filter(x -> x % 5 == 0)
                .limit(5)
                .toList();
        long count = list.stream()
                .filter((x) -> x > 500)
                .count();
        boolean all = list.stream().allMatch(x -> x > 900);
        boolean any = list.stream().anyMatch(x -> x > 900);

        System.out.println(all);
        System.out.println(any);

        System.out.println(count);

        System.out.println(newList);

        Optional<Integer> anyOptional = list.stream().findAny();
        Optional<Integer> firstOptional = list.stream().findFirst();
        System.out.println(anyOptional.get());
        System.out.println(firstOptional.get());

        list.stream().forEach(x -> {

        });
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        System.out.println(max.get());
        System.out.println(min.get());

        Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
        System.out.println(sum.get());

        long distincDountt = list.stream().distinct().count();
        System.out.println(distincDountt);

        long skipCount = list.stream().skip(30).count();
        System.out.println(skipCount);

        List<Integer> moreNonzero = list.stream()
                .filter(x ->  moreNonzero(x))
                .toList();
       List<Integer> randomLst =  random.ints(100)
                .boxed()
                .toList();
        System.out.println(randomLst);


    }
    public static boolean moreNonzero(int x){
        return x > 0;
    }



}

