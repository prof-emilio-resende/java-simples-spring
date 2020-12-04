package br.edu.impacta;

import br.edu.impacta.factories.StudentFactory;
import br.edu.impacta.models.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LegacyAppConfig {
    @Bean(name = "studentFactory")
    public StudentFactory studentFactory() {
        var fac = new StudentFactory();
        fac.config("Emilio Factory", 999);
        return fac;
    }

    @Bean(name = "student")
    public Student getStudent() {
        var fac = studentFactory();
        return fac.getObject();
    }
}
