package _10_11_2022.game;

public class Test {
    public static void main(String[] args) {
        School s1 = new School("Alexandr", 30);
        School s2 = new School("Alexey Lavrov", 38);

        Student st1 = new Student("Alexey Kh", 35);
        Student st2 = new Student("Alexey Ba", 36);

        Employee em1 = new Employee("Irina", 18);
        Employee em2 = new Employee("Mikhail", 38);

        Team<School> schoolTeam = new Team<>("AlexAndAl");
        Team<Student> studTeam = new Team<>("A2");
        Team<Employee> empTeam = new Team<>("MikAndIr");

        schoolTeam.addNewParticipant(s1);
        schoolTeam.addNewParticipant(s2);

        studTeam.addNewParticipant(st1);
        studTeam.addNewParticipant(st2);

        empTeam.addNewParticipant(em1);
        empTeam.addNewParticipant(em2);

        schoolTeam.playWith(schoolTeam);
        empTeam.playWith(empTeam);
        studTeam.playWith(studTeam);
    }
}