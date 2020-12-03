package br.edu.impacta.repositories;

import br.edu.impacta.models.Student;

import java.util.List;

public class StudentRepository {
    public List<Student> findAll() {
        return List.of(new Student("Emilio", 123));
    }
}
