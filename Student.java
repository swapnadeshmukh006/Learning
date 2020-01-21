public class Student
{

private String fName;
private String lName;
private int rollNo;

public void setfName(String fName)
{
  this.fName=fName;
}
public String getfName(){
  return this.fName;
}

  public void setlName(String lName){
    this.lName=lName;
  }
  public String getlName(){
    return this.lName;
  }
  public void setrollNo(int rollNo){
    this.rollNo=rollNo;
  }
  public int getrollNo()
  {
    return this.rollNo;
  }
  public static void main(String[] args)
  {
    Student s1 = new Student();
    s1.fName ="swapna" ;
    s1.lName ="deshmukh" ;
    s1.rollNo = 7;

    System.out.println("first name-" + s1.fName + " last name-" +s1.lName + "roll no -" +s1.rollNo);
  }
}
