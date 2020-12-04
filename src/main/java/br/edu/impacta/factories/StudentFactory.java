package br.edu.impacta.factories;

import br.edu.impacta.models.Student;
import org.springframework.beans.factory.FactoryBean;

public class StudentFactory implements FactoryBean<Student> {
    private final Student instance = new Student();

    @Override
    public Student getObject() {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    public void config(String name, int ra) {
        this.instance.setName(name);
        this.instance.setRa(ra);
    }
}
