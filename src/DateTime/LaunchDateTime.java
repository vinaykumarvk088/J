package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


//Initially in java we had DateTime class in Utility,SQL Packages, but they are deprecated in java 8
// because of introduction of separate 'java.time' package for Date&Time Api.
// Why because initial dateTime api is notoriously hard to use in complex applications, And it's not thread safe.
//It is derived from the 'architecture of Joda-Time Api' and it's Author implemented the Built-in java.time package.


public class LaunchDateTime {
    static void main() {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.ofYearDay(2025,69));
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        LocalDate dateofBirth=LocalDate.of(2001,2,15);
        System.out.println(dateofBirth);
    }
}
