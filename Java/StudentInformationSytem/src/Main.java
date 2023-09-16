public class Main {
    public static void main(String[] args) {
        Teacher historyTeacher = new Teacher("John", "1231231234", "HST");
        Teacher englishTeacher = new Teacher("David", "9238191919", "ENG");
        Teacher physicsTeacher = new Teacher("Chris", "5100130101", "PHY");

        Course history = new Course("History", "101", "HST");
        Course physics = new Course("Physics", "303", "PHY");
        Course english = new Course("English", "102", "ENG");

        history.addTeacher(historyTeacher);
        english.addTeacher(englishTeacher);
        physics.addTeacher(physicsTeacher);

        Student s1 = new Student("Jane", "123", "4", history, english, physics);



        s1.addBulkExamNote(80, 70, 100);
        s1.c1.addHomework(100, 0.1);
        s1.c2.addHomework(70, 0.3);
        s1.c3.addHomework(50, 0.5);
        s1.printNotes();
        s1.isPassed();
    }
}