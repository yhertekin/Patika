public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else {
            System.out.println("Cannot add teacher to this course");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }

    void addHomework(int score, double effect){
        this.note = (int) (score*effect + (1-effect) * this.note);
    }
}
