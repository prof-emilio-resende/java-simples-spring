import br.edu.impacta.AppConfig;
import br.edu.impacta.services.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicação java...");
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        runOne(context);
        runTwo(context);

        System.out.println("Fim...");
    }

    private static void runOne(AnnotationConfigApplicationContext context) {
        System.out.println("Obtendo servico de busca de estudantes 1");
        var svc = context.getBean("studentService", StudentService.class);
        System.out.println("Obtendo lista de estudantes 1...");
        var students = svc.findAll();
        students.forEach(System.out::println);
    }

    private static void runTwo(AnnotationConfigApplicationContext context) {
        System.out.println("Obtendo servico de busca de estudantes 2");
        var svc = context.getBean("studentService", StudentService.class);
        System.out.println("Obtendo lista de estudantes 2...");
        var students = svc.findAll();
        students.forEach(System.out::println);
    }
}
