package ru.corruptzero.command;

import ru.corruptzero.entity.Database;

public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
