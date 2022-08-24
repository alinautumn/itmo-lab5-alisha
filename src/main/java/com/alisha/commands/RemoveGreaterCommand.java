package com.alisha.commands;

import com.alisha.data.Route;
import com.alisha.utilities.CollectionManager;
import com.alisha.utilities.OutputManager;
import com.alisha.utilities.RouteMaker;
import com.alisha.utilities.UserInputManager;

public class RemoveGreaterCommand extends Command {
    private final OutputManager outputManager;
    private final CollectionManager collectionManager;
    private final UserInputManager userInputManager;

    public RemoveGreaterCommand(CollectionManager collectionManager, UserInputManager userInputManager, OutputManager outputManager) {
        super("remove_greater");
        this.outputManager = outputManager;
        this.collectionManager = collectionManager;
        this.userInputManager = userInputManager;
    }

    @Override
    public CommandResult execute(String arg) {
        Route route = new RouteMaker(userInputManager, outputManager, collectionManager).makeRoute();
        collectionManager.getMainData().removeIf(x -> x.compareTo(route) > 0);
        return new CommandResult(false, "Greater elements were removed successfully");
    }
}
