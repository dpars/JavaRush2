package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    public String name;
    public int tall;
    public String color;

    public Dog(String name)
    {
        this.name = name;
    }
    public Dog(String name,int tall)
    {
        this.name = name;
        this.tall = tall;
    }
    public Dog(String name,int tall,String color)
    {
        this.name = name;
        this.tall = tall;
        this.color = color;
    }

}
