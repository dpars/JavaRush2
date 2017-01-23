package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        int fiteage = age > anotherCat.age ? 1 : 0;
        int fiteweight = age > anotherCat.weight ? 1 : 0;
        int fitestrength= age > anotherCat.strength ? 1 : 0;
        int score = fiteage + fiteweight + fitestrength;
        return score > 2 ? true : false;

    }
}
