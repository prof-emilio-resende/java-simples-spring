package br.edu.impacta.repositories;

import br.edu.impacta.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentRepository")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class StudentRepositoryImpl implements StudentRepository {
    @Autowired
    private Student student;

    public StudentRepositoryImpl() {
        System.out.println("Criando instancia de repositorio");
    }

    @Override
    public List<Student> findAll() {
        System.out.println("estou indo buscar dados!!!");
        return List.of(student);
    }
}
