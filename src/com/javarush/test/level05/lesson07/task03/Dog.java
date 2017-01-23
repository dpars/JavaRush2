package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

import java.security.PublicKey;

public class Dog
{
    public String name;
    public int tall;
    public String color;

    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name,int tall)
    {
        this.name = name;
        this.tall = tall;
    }
    public void initialize(String name,int tall,String color)
    {
        this.name = name;
        this.tall = tall;
        this.color = color;
    }

}
