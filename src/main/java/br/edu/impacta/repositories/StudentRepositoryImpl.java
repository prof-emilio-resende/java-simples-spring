package br.edu.impacta.repositories;

import br.edu.impacta.models.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {
    public StudentRepositoryImpl() {
        System.out.println("Criando instancia de repositorio");
    }

    @Override
    public List<Student> findAll() {
        return List.of(new Student("Emilio", 123));
    }
}
