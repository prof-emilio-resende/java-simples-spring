package br.edu.impacta.repositories;

import br.edu.impacta.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("studentRepository")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Profile("prod")
public class StudentRepositoryImpl implements StudentRepository {
    @Autowired
    private Student student;

    public StudentRepositoryImpl(@Value("#{ T(java.util.UUID).randomUUID() }") UUID uuid) {
        System.out.println(String.format("Criando instancia de repositorio %s", uuid));
    }

    @Override
    public List<Student> findAll() {
        System.out.println("estou indo buscar dados!!!");
        return List.of(student);
    }
}
