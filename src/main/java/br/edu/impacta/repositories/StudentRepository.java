package br.edu.impacta.repositories;

import br.edu.impacta.models.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
