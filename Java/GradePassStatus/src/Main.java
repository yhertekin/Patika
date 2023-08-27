import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student.addLesson(new Lesson("Math", 10));
        Student.addLesson(new Lesson("Physics", -10));
        Student.addLesson(new Lesson("Chemistry", 100));
        Student.addLesson(new Lesson("Turkish", 80));
        Student.addLesson(new Lesson("Music", 60));

        System.out.println("Average : " + Student.getAverage());
    }

    public static class Student{
        static List<Lesson> lessons = new ArrayList<Lesson>();


        public static void addLesson(Lesson lesson){
            lessons.add(lesson);
        }

        public static double getAverage(){
            double total = 0;
            int size = 0;
            for(Lesson lesson:lessons){
                if(lesson.grade >= 0 && lesson.grade <= 100){
                    total += lesson.grade;
                    size++;
                }
            }
            return total / size;
        }
    }

    public static class Lesson {
        String name;
        double grade;

        public Lesson(String name, double grade){
            this.name = name;
            this.grade = grade;
        }
    }


}