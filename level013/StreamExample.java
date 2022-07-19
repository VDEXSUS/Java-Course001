package level013.LambdaExample;

import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("11", "22", "33", "44", "55");
        // потоковая обработка данных "Stream"
        strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);

 //       for (String string : strings) {
 //           String value = string + string;
 //           Integer intValue = Integer.valueOf(value);
 //           if (intValue % 2 == 0) {
 //               System.out.println(intValue);
 //           }
 //       }
    }
}
