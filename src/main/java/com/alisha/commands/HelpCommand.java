package com.alisha.commands;


public class HelpCommand extends Command {
    public HelpCommand() {
        super("help");
    }

    @Override
    public CommandResult execute(String arg) {
        return new CommandResult(false,
                "help : gives information about available commands\n"
                        + "info : gives information about collection\n"
                        + "show : shows every element in collection with string\n"
                        + "add {element} : adds new element to collection\n"
                        + "update id {element} : update element info by it's id\n"
                        + "remove_by_id id : delete element by it's id\n"
                        + "clear : clears collection\n"
                        + "save : saves collection to a file\n"
                        + "execute_script file_name : executes script entered in a file\n"
                        + "exit : exits the program (!!!does not save data!!!)\n"
                        + "add_if_max {element} : adds new element to the collection if it's value is greater than the value of the largest item in this collection\n"
                        + "add_if_min {element} : adds new element to the collection if it's value less than min element's value\n"
                        + "history : shows last 14 command usages\n"
                        + "remove_any_by_distance distance : removes any element from the collection, the value of the distance field of which is equivalent to the specified\n"
                        + "average_of_distance : prints the average of elements' distance\n"
                        + "print_field_ascending_distance : prints the values of the distance field of all elements in ascending order");
    }
}
