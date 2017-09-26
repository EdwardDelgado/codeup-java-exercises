public class Person {
    private String name;

    public Person(String name){
        this.name =name;
    }

    // returns the person's name
    public String getName(){
        return name;
    }
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Howdy " + this.name);
    }

    public static void main(String[] args) {
//        Person person = new Person("Gunnar");

//        person.setName("Graham");

//        person.sayHello();

//        System.out.println(person.getName());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");

//        System.out.println(person1.getName().equals(person2.getName())); //True

//        System.out.println(person1 == person2); //False

        Person person1 = new Person("John");
        Person person2 = person1;

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        person2.setName("Jane");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
