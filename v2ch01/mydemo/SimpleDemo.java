package mydemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: LiuSheng
 * @Package: mydemo
 * @Project: v2ch01
 * @date: 2023-04-25 16:02
 **/
public class SimpleDemo {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        Double[] doublesArr = {1.1, 1.2, 1.3, 1.4, 1.5};
        long count = Stream.of(strings).filter(str -> str.length() > 1).count();
        System.out.println(count);  //输出：4

        Stream<String> lowercase = Stream.of(strings).map(s -> s.toUpperCase());
        List<String> stringList = lowercase.collect(Collectors.toList());
        System.out.println(stringList.toString());  //输出：[A, B, C, AB, AC, BC, ABC]

        Stream<Double> doubleStream = Stream.of(doublesArr).map(d->d=d*2);
        List<Double> doubleList = doubleStream.collect(Collectors.toList());
        Double[] doublesArr2 = new Double[doubleList.size()];
        doubleList.toArray(doublesArr2);
        System.out.println(Arrays.toString(doublesArr2));  //输出：[2.2, 2.4, 2.6, 2.8, 3.0]
    }
}
