// Online Java Compiler

// Use this editor to write, compile and run your Java code online

class Classv2 {

String name;

int age;

String phone;


// constructor

public Classv2(String name, int age, String phone){

// fields

this.name = name;

this.age = age;

this.phone = phone;

}


// methods

public String info(){

return this.name + " is " + this.age + " years old and is running " + this.phone + " as phone number";

}

public static void main(String[] args) {

Classv2 person = new Classv2("Dinesh", 25, "8855220011");
System.out.println(person.name);
System.out.println(person.age);
System.out.println(person.phone);
System.out.println(person.info());
}

}