package com.alisha.commands;

import com.alisha.utilities.CollectionManager;
import com.alisha.utilities.OutputManager;
import com.alisha.utilities.RouteMaker;
import com.alisha.utilities.UserInputManager;
import com.alisha.data.Route;

public class UpdateCommand extends Command {
    private final OutputManager outputManager;
    private final UserInputManager userInputManager;
    private final CollectionManager collectionManager;

    public UpdateCommand(CollectionManager collectionManager, UserInputManager userInputManager, OutputManager outputManager) {
        super("update");
        this.userInputManager = userInputManager;
        this.collectionManager = collectionManager;
        this.outputManager = outputManager;
    }

    @Override
    public CommandResult execute(String arg) {
        int intArg;
        try {
            intArg = Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            return new CommandResult(false, "Your argument was incorrect. The command was not executed");
        }

        if (collectionManager.removeById(intArg)) {
            Route route = new RouteMaker(userInputManager, outputManager, collectionManager).makeRoute();
            route.setId(intArg);
            collectionManager.getMainData().add(route);
            return new CommandResult(false, "The element was updated successfully");
        } else {
            return new CommandResult(false, "Written id was not found. The command was not executed");
        }
    }

}
