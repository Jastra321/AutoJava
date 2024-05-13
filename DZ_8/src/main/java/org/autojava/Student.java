package org.autojava;

import lombok.Getter;

@Getter
public class Student implements Comparable<Student> {
    int id ;
    String fa;
    String im;
    String ot;


    public Student(int id, String fa,  String im, String ot) {
        this.id = id;
        this.fa = fa;
        this.im = im;
        this.ot = ot;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                " id=" + id +
                ", fa='" + fa + '\'' +
                ", im='" + im + '\'' +
                ", ot='" + ot + '\'' +
                '}';
    }
}