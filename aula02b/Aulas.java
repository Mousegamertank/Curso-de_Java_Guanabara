package aula02b;

public class Aulas {
    float duration;
    String name;
    String teacher;
    int howManyStudents;
    String subject;

    public Aulas() {

    }
    public Aulas (float duration, String name, String teacher, int howManyStudents, String subject){
        this.duration = duration;
        this.name = name;
        this.teacher = teacher;
        this.howManyStudents = howManyStudents;
        this.subject = subject;
    }

    public void show(){
        System.out.println("Name: " + this.name + "Duration: " + this.duration + "Teacher: " + this.teacher + "Students: " + this.howManyStudents
        + "Subject: " + this.subject);
    }
}
