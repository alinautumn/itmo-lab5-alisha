package com.alisha.commands;

import com.alisha.utilities.CollectionManager;

public class ClearCommand extends Command {
    private final CollectionManager collectionManager;

    public ClearCommand(CollectionManager collectionManager) {
        super("clear");
        this.collectionManager = collectionManager;
    }

    @Override
    public CommandResult execute(String arg) {
        collectionManager.getMainData().clear();
        return new CommandResult(false, "The collection was cleared successfully");
    }

}
