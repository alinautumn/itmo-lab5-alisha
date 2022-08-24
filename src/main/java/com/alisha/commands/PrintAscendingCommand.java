package com.alisha.commands;

import com.alisha.data.Route;
import com.alisha.utilities.CollectionManager;

import java.util.StringJoiner;

public class PrintAscendingCommand extends Command {
    private final CollectionManager collectionManager;

    public PrintAscendingCommand(CollectionManager collectionManager) {
        super("print_ascending");
        this.collectionManager = collectionManager;
    }

    @Override
    public CommandResult execute(String arg) {
        StringJoiner output = new StringJoiner("\n\n");

        for (Route route : collectionManager.getMainData()) {
            output.add(route.toString());
        }

        return new CommandResult(false, output.toString());
    }
}
