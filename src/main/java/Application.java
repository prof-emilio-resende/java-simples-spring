import br.edu.impacta.repositories.StudentRepository;
import br.edu.impacta.repositories.StudentRepositoryImpl;
import br.edu.impacta.services.StudentService;
import br.edu.impacta.services.StudentServiceImpl;

public class Application {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicação java...");

        System.out.println("Obtendo lista de estudantes...");
        StudentRepository repo = new StudentRepositoryImpl();
        StudentService svc = new StudentServiceImpl(repo);
        var students = svc.findAll();
        students.forEach(System.out::println);

        System.out.println("Fim...");
    }
}
