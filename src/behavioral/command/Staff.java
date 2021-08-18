package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/18
 */
public class Staff {
    private List<Command> commands = new ArrayList<>();
    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
