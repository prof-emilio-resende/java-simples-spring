package br.edu.impacta.services;

import br.edu.impacta.models.Student;
import br.edu.impacta.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl() {
        System.out.println("Criando StudentService SEM parametros");
    }

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        System.out.println("Criando StudentService COM parametros");
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }
}
