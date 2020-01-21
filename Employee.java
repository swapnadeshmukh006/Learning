public class Employee{

 public Employee(){

  System.out.println("This is default constructor");
}
 Employee(String fname,String lname)
{
  System.out.println("Employee fname is-" +fname + "Employee lname is-" +lname);
}
Employee(String fname,String lname, String midname)
{
 System.out.println("Employee fName is-" +fname + "Employee lName is-" +lname + "middle name is-" +midname);
}
public static void main(String[] args){

Employee e = new Employee();
Employee e1 = new Employee("satvik", "deshmukh");
Employee e2 = new Employee("shivansh","deshmukh","sudarshan");

}
}
