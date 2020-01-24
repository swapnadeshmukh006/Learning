public class FamilyMain

{
  public static void main(String args[])

  {

    Mother mother = new Mother("Shakuntala","Raminwar");
    Father father = new Father("Ashok","Raminwar");
    Husband husband = new Husband("Sudarshan","Deshmukh");
    Son son = new Son("Shisat","Deshmukh");
    Swapna swapna = new Swapna("Swapna" ,"Deshmukh" ,mother ,father ,husband, son);

    Mother swapnaMother = swapna.getMother();
    Father swapnaFather = swapna.getFather();
    Husband swapnaHusband = swapna.getHusband();
    Son swapnaSon = swapna.getSon();

    System.out.println(" Swapna " +" "+ swapna.getFirstName());
    System.out.println"Swapna" + swapna.getLastName() );
    System.out.println("Mother" + swapna.getFirstName() +swapna.getLastName());
    System.out.println("Father" + swapna.getFirstName() +swapna.getLastName());
    System.out.println("Husband" + swapna.getFirstName() +swapna.getLastName());
    System.out.println("Son" + swapna.getFirstName() +swapna.getLastName());

  }
}
