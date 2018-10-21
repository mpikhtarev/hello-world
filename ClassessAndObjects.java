public class ClassessAndObjects {
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.name = "Роман";
        p1.age = 50;
        p1.sayHello();
        Person p2 = new Person();
        p2.name = "Вова";
        p2.age = 20;
        p2.speak();
        p2.sayHello();
    }
}

class Person
{
    String name;
    int age;

    void speak()
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }
    void sayHello()
    {
        System.out.println("Hello");
    }
}