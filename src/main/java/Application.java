import br.edu.impacta.services.StudentService;

public class Application {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicação java...");

        System.out.println("Obtendo lista de estudantes...");
        var svc = new StudentService();
        var students = svc.findAll();
        students.forEach(System.out::println);

        System.out.println("Fim...");
    }
}
