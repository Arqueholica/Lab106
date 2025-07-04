import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//      System.out.println("Soy la prueba típica");
//
//        Employee newEmployee  = new Employee("Paco", "paco@mail.com", 27, 50000.6);
//        System.out.println(newEmployee);
//
//        Intern newIntern = new Intern("Manolo", "manolo@mail.com", 45, 30000);
//        System.out.println(newIntern);
//
//        Intern newIntern2 = new Intern("Mari", "mari@mail.com", 30, 300);
//        System.out.println(newIntern2);

//         /*
//      QUÉ HACER ⬇️
//        Asumo que aquí tengo que hacer scanner y preguntar cada cosa ¿?
//        Tengo que crear un ArrayList para meter a esta gente y que me lo imprima en un texto
//        loop que recorra el Array y me imprima las cosas en el texto
//        1- ArrayList vacío para recibir los datos
//        2- Scanner con las preguntas (tope de 10) tendré que guardarlas en las variables existentes ¿?
//        3- Crear el archivo
//        4- Loopear datos al archivo
//        5- Descubrir que no me quedan neuronas
//        s*/

//1 - ARRAYLIST

        List<String> employees = new ArrayList<>();
        List<String> interns = new ArrayList<>();


//2- SCANNER
        Scanner scanner = new Scanner(System.in);

//        EMPLEADOS
        do{
            System.out.println("Nombre del empleado: ");
            String name = scanner.nextLine();

            System.out.println("Email de empresa: ");
            String email = scanner.nextLine();

            System.out.println("Edad del empleado: ");
            int age = scanner.nextInt();

            System.out.println("Salario del empleado: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            Employee newEmployee  = new Employee(name, email, age, salary);

            employees.add(String.valueOf(newEmployee));


        }while(employees.size() < 10 );

//      INTERNOS

        do {

            System.out.println("Nombre del interno: ");
            String name = scanner.nextLine();


            System.out.println("Email de empresa: ");
            String email = scanner.nextLine();


            System.out.println("Edad del interno: ");
            int age = scanner.nextInt();


            System.out.println("Salario del interno: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();


            Intern newIntern = new Intern(name, email, age, salary);

            interns.add(String.valueOf(newIntern));


        }while(interns.size() < 3 );


scanner.close();



// CREAR ARCHIVO (y meter datos)

        String filepath = "src/employees.txt";
        FileWriter write = new FileWriter(filepath,true);
        write.write("EMPLEADOS" + "\n");

        for( int i = 0; i < employees.size(); i++){
            write.write(employees.get(i));
        }

        write.close();


        String filepath2 = "src/interns.txt";
        FileWriter write2 = new FileWriter(filepath2,true);
        write2.write("INTERNOS" + "\n" );

        for( int i = 0; i < interns.size(); i++){
            write2.write(interns.get(i));
        }

          write2.close();


    }
}