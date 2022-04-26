public abstract class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String sleep(){
        return name + " is sleeping!";
    }

    public String eat(){
        return name + " is eating!";
    }

    public String walk(){
        return name + " is walking!";
    }
}
