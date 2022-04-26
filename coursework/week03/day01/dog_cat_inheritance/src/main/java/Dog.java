public class Dog extends Animal{

    private boolean isWorkingBreed;

    public Dog (String name, int age, boolean isWorkingBreed){
        super(name, age);
        this.isWorkingBreed = isWorkingBreed;
    }

//    public String getName(){
//        return name;
//    }
//
//    public int getAge(){
//        return age;
//    }

    public String bark(){
        return "woof";
    }

    public boolean getisWorkingBreed() {
        return isWorkingBreed;
    }
}
