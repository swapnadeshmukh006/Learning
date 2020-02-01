
package com.family;

import com.family.beforemarriage.Mother;
import com.family.beforemarriage.Father;
import com.family.aftermarriage.Husband;
import com.family.aftermarriage.Son;
import com.family.beforemarriage.Swapna;

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

    System.out.println("Swapna first Name" +"- "+ swapna.getFirstName());
    System.out.println("Swapna Last Name" + "- "+ swapna.getLastName());
    System.out.println("Mother" + "-" + swapnaMother.getMotherFirstName() +" " + swapnaMother.getMotherLastName());
    System.out.println("Father" + "- " + swapnaFather.getFatherFirstName() +" " + swapnaFather.getFatherLastName());
    System.out.println("Husband" + " -" + swapnaHusband.getHusbandFirstName() +" " + swapnaHusband.getHusbandLastName());
    System.out.println("Son" + "- " + swapnaSon.getSonFirstName() + " " + swapnaSon.getSonLastName());

  }
}
