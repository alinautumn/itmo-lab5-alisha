package com.alisha.commands;

/**
 * абстрактный класс для всех команд
 */
public abstract class Command {
    /**
     * строка, которая используется для выполнения команды в консоли.
     */
    private final String name;

    protected Command(String name) {
        this.name = name;
    }

    /**
     * каждый класс Command представляет команду и имеет метод execute() для ее выполнения.
     *
     * @param arg аргумент команды
     * @return возвращает результат команды
     */
    public abstract CommandResult execute(String arg);

    public String getName() {
        return name;
    }
}
