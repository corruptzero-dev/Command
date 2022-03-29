package ru.corruptzero;

import ru.corruptzero.command.DeleteCommand;
import ru.corruptzero.command.InsertCommand;
import ru.corruptzero.command.SelectCommand;
import ru.corruptzero.command.UpdateCommand;
import ru.corruptzero.entity.Database;
import ru.corruptzero.entity.Developer;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new SelectCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database)
        );
        developer.insertRecord();
    }
}
