package OpinionPoll;

public class Person {

    private String name;
    private int age;
    //конструктор
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    //гетъри
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
     return name + " - " + age;

    }
}
