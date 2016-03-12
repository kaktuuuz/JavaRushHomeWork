package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Toshiba on 6/28/2015.
 * 5. Создай класс Computer.
 6. В класс Computer добавь приватное поле типа Keyboard.
 7. В класс Computer добавь приватное поле типа Mouse.
 8. В класс Computer добавь приватное поле типа Monitor.
 9. Создай конструктор в классе Computer используя комбинацию клавиш Alt+Insert внутри класса (команда Constructor).
 10 Внутри конструктора инициализируйте все три поля (переменных) класса
 11. Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert и выбери команду Getter).
 12. Все созданные классы и интерфейс должны быть в отдельных файлах.

 */
public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer()
    {
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
        this.monitor = new Monitor();
    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor)
    {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard)
    {
        this.keyboard = keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public void setMouse(Mouse mouse)
    {
        this.mouse = mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    public void setMonitor(Monitor monitor)
    {
        this.monitor = monitor;
    }
}
