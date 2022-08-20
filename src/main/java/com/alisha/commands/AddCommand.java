package com.alisha.commands;

import com.alisha.utilities.CollectionManager;
import com.alisha.utilities.OutputManager;
import com.alisha.utilities.RouteMaker;
import com.alisha.utilities.UserInputManager;
import com.alisha.data.Route;

public class AddCommand extends Command {
    private final UserInputManager userInputManager;
    private final OutputManager outputManager;
    private final CollectionManager collectionManager;

    public AddCommand(CollectionManager collectionManager, UserInputManager userInputManager, OutputManager outputManager) {
        super("add");
        this.collectionManager = collectionManager;
        this.userInputManager = userInputManager;
        this.outputManager = outputManager;
    }

    @Override
    public CommandResult execute(String arg) {
        Route route = new RouteMaker(userInputManager, outputManager, collectionManager).makeRoute();
        collectionManager.getMainData().add(route);
        return new CommandResult(false, "The element was added successfully");
    }
}
