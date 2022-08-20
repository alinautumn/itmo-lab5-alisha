package com.alisha.commands;

import com.alisha.utilities.CollectionManager;

public class AverageOfDistanceCommand extends Command {
    private final CollectionManager collectionManager;

    public AverageOfDistanceCommand(CollectionManager collectionManager) {
        super("average_of_distance");
        this.collectionManager = collectionManager;
    }

    @Override
    public CommandResult execute(String arg) {
        if (collectionManager.getMainData().isEmpty()) {
            return new CommandResult(false, "The method wasn't executed due to empty collection");
        }
        return new CommandResult(false, String.valueOf(collectionManager.getAverage()));
    }
}
