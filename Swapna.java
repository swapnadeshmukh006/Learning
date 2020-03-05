package com.family.beforemarriage;

import com.family.aftermarriage.Husband;
import com.family.aftermarriage.Son;

public class Swapna
{
private String firstName ;
private String lastName ;
private Mother mother ;
private Father father ;
private Husband husband ;
private Son son ;

public Swapna(String firstName , String lastName ,Mother mother,Father father ,Husband husband, Son son)
{
  this.firstName = firstName ;
  this.lastName = lastName ;
  this.mother = mother ;
  this.father = father;
  this.husband = husband;
  this.son = son ;
}

public String getFirstName()
{
  return this.firstName ;
}
public String getLastName()
{
  return this.lastName ;
}
public Mother getMother()
{
  return this.mother ;
}
public Father getFather()
{
  return this.father ;
}
public Husband getHusband()
{
  return this.husband ;
}
public Son getSon()
{
  return this.son ;
}
}
