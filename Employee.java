public class Employee {

    private String id ;
    private String name ;
    private int salary;

    public Employee(){

    }

    public Employee(String id , String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getAnualSalary(){
        salary*= 12 ;
        return salary;
    }

    public int raisedSalary(){
        int increment =0;
        increment +=(salary* 10 )/100;  // increase by 10 %
        return salary = salary + increment;
    }
    @Override
    public String toString() {
        return "Employee " +
                "Id ='" + id + '\'' +
                ", name ='" + name + '\'' +
                ", salary = " + salary ;
    }
}
