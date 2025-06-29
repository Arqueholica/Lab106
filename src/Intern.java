public class Intern extends Employee{

    //Constante para checkear salary
public static final double SALARY_MAX = 20000.0;



    //ConstrutorPropio --> basado en Employee pero que incluya el salario tope

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salaryOk(salary));

    }

// Métodos propios
//necesito ifelsear el SALARY_MAX

  private static double salaryOk(double salary){
        if(salary > SALARY_MAX) {
            System.out.println("El salario excede el máximo permitido. Se ha modificado a " + SALARY_MAX);
                return SALARY_MAX;
        }else {
            return salary;
        }
    }

    //  reescribir el salario con un set que hay que ifelsear (¿podría juntarlo con el anterior¿?) vale no, ya sale SOLO





}









