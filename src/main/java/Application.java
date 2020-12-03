import br.edu.impacta.AppConfig;
import br.edu.impacta.services.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicação java...");
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Obtendo servico de busca de estudantes");
        var svc = context.getBean("studentService", StudentService.class);

        System.out.println("Obtendo lista de estudantes...");
        var students = svc.findAll();
        students.forEach(System.out::println);

        System.out.println("Fim...");
    }
}
