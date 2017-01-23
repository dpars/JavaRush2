package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
    Man man1 = new  Man("Vova", 20, "Kharkov");
    Man man2 = new  Man("Andrey", 21, "Kiev");
    Woman woman1 = new Woman("Olga", 22, "Poltava");
    Woman woman2 = new Woman("Ira", 23, "Sumy");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

        //выведи их на экран тут
    }

   public   static class Man{
    String name;
    int age;
    String address;
    Man(String n, int a, String adr){
        this.name =n;
        this.age =a;
        this.address =adr;
    }
    Man(String n, int a){
        this.name =n;
        this.age =a;
    }
       Man(String n, String adr){
           this.name =n;
           this.address =adr;
       }

}
    public static class Woman{
    String name;
    int age;
    String address;
        Woman(String n, int a, String adr){
            this.name =n;
            this.age =a;
            this.address =adr;
        }
        Woman(String n, int a){
            this.name =n;
            this.age =a;
        }
        Woman(String n, String adr){
            this.name =n;
            this.address =adr;
        }
}
    //добавьте тут ваши классы
}
