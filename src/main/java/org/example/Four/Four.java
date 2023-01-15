package org.example.Four;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//4*. Дан стрим  Stream stream = Stream.of("we", "wee", "qwer", "oooo");
//        ( или любой другой…не суть )
//        Вывести на экран СТРИМОМ самую длинную строку. Если несколько одинаковых, то значит несколько.
public class Four {
    public static void main(String[] args) {
        Stream<String> stream =
                Stream.of("we", "wee", "qwer", "oooo", "djhgjdhbvjh", "ajhgjdhbvss", "dhjh", "df");
        stream
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .max(Map.Entry.<Integer, List<String>>comparingByKey())
                .ifPresent(e -> System.out.println(e.getValue()));
    }
}
