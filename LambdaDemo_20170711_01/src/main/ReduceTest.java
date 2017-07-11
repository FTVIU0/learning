package main;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Nlte on 2017/07/11 20:41.
 */
public class ReduceTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("I", "AAAA", "you", "too");
//        Integer reduce = stream.reduce(0, (sum, str) -> sum + str.length(), (a, b) -> a + b);
//        System.out.println(reduce);

//        Optional<String> reduce1 = stream.reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
//        System.out.println(reduce1.get());

//        List<String> collect = stream.collect(Collectors.toList());
//        System.out.println(collect);

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            employees.add(Factory.getEmployee("Employee: " + i, "Department: "+i));
        }

        Map<Department, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(collect);

    }
}
