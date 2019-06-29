public class Dog {
    String name;
    int age;
    void Eat()
    {
        System.out.println("the dog is eating");
    }
    public static void main(String[] args){
        Dog dog1=new Dog();
        dog1.name="dev";
        dog1.age=20;
        dog1.Eat();

        Dog dog2=new Dog();
        dog2.name="veeru";
        dog2.age=13;
        dog2.Eat();

        Dog dog3=new Dog();
        dog3.name="sri";
        dog3.age=24;
        dog3.Eat();
    }
}



