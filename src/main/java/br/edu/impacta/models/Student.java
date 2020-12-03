package br.edu.impacta.models;

public class Student {
    private String name;
    private int ra;

    public Student() {
    }

    public Student(String name, int ra) {
        this.name = name;
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
