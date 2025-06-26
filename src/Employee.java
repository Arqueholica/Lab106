public class Employee {

    //VARIABLES en privado name, email, age, salary

    private String name;
    private String email;
    private int age;
    private double salary;
    //CONSTRUCTOR modificador + nombre de la clase + lo que queremos que se haga

    public Employee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }


    //MÉTODOS
    // getters&setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString --> VISUALIZACIÓN


    @Override
    public String toString() {
        return "Employee data " + '\'' +
                "name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                ", age: " + age +
                ", salary: " + salary;
    }
}
