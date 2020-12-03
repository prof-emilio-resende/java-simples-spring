package br.edu.impacta.services;

import br.edu.impacta.models.Student;
import br.edu.impacta.repositories.StudentRepository;

import java.util.List;

public class StudentService {
    public List<Student> findAll() {
        var repo = new StudentRepository();
        return repo.findAll();
    }
}
