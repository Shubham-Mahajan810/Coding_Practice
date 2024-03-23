package com.springcore.Person;

public class Persone {
   private String name;
   private int personId;
   
   public Persone(String name,int personId) {
	   this.name=name;
	   this.personId=personId;
   }

@Override
public String toString() {
	return "Persone [name=" + name + ", personId=" + personId + "]";
}
   
   
}
