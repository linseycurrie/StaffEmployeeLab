package Staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        if (name != null){
            this.name = name;
        }
    }

    public String getnINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase){
        if( increase > 0 ){
            this.salary += increase;
        }

    }

    public double payBonus(){
        return (this.salary * 0.01 );
    }
}
