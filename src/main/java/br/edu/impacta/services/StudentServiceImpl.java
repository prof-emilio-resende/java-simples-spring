package br.edu.impacta.services;

import br.edu.impacta.models.Student;
import br.edu.impacta.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service("studentService")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
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

    @PostConstruct
    private void initialize() {
        System.out.println("post construct...");
    }

    @PreDestroy
    private void terminate() {
        System.out.println("bye bye");
    }
}
