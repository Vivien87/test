import com.dibrova.test.Mark;
import com.dibrova.test.Student;
import com.dibrova.test.Subject;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // Please, do not use internet or any other sources of information during the test
// tast shouldn’t take more than 30 minutes
// There are 3 classes: Student, Subject and Mark
// - Fill the data according to the following conditions (use lists)
// 1. It is known that there are such students in the group: Valery Popov, Semyon Korzhev, Peter Ivanov, Maria Semenova and Kolya Nesterenko
// 2. Mathematics, Physics, Astronomy, History and Ethics are learned by this group and all subjects are mandatory excluding Ethics. It is optional.
// 3. Fill the data about marks if it is known that students have mark 3 for mandatory subjects and Maria has mark 5 for History and Ethics.
// 4. Please print results in a such way:
//   Popova Valeria Mathematics-1 Physics-2 Astronomy-0 History-1 Ethics-3 (do not display the subject info if there is no data about it)
    private static List<Student> initializationStudents() {
        List<Student> students = Arrays.asList(
                new Student("Valery", "Popov"),
                new Student("Semyon", "Korzhev"),
                new Student("Peter", "Ivanov"),
                new Student("Maria", "Semenova"));

                        return students;
    }

    private static List<Subject> initializationSubject() {

        List<Subject> subjects = Arrays.asList(new Subject("Mathematics", true),
                new Subject("Physics", true),
                new Subject("Astronomy", true),
                new Subject("History", true),
                new Subject("Ethics", false));

        return subjects;
    }





    public static void main(String[] args) {

        Map<Integer, Mark> marks = new HashMap<>();

        // 1 It is known that there are such students in the group: Valery Popov, Semyon Korzhev, Peter Ivanov, Maria Semenova and Kolya Nesterenko

        List<Student> students = initializationStudents();

        // 2 Mathematics, Physics, Astronomy, History and Ethics are learned by this group and all subjects are mandatory excluding Ethics. It is optional.

        List<Subject> subjects = initializationSubject();


        // 3 Fill the data about marks if it is known that students have mark 3 for mandatory subjects and Maria has mark 5 for History and Ethics.

        int count = 0;
        for (int i = 0; i < students.size(); i++) {

            for (int j = 0; j < subjects.size(); j++) {
                int a = 0 + (int) (Math.random() * 5);
                if ((students.get(i).getFirstName().equals("Maria") && students.get(i).getLastName().equals("Semenova")) && (subjects.get(j).getName().equals("Ethics") || subjects.get(j).getName().equals("History"))) {
                    marks.put(count++, new Mark(students.get(i), subjects.get(j), 5));

                } else {
                    marks.put(count++, new Mark(students.get(i), subjects.get(j), a));
                }


            }

            }

            // 4 Please print results in a such way:
            ////   Popova Valeria Mathematics-1 Physics-2 Astronomy-0 History-1 Ethics-3 (do not display the subject info if there is no data about it)

            for (Map.Entry<Integer, Mark> mark : marks.entrySet()) {
                System.out.println(mark.getValue() + " ");
            }

        }
    }
