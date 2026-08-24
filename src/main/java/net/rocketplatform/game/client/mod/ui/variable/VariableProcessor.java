package net.rocketplatform.game.client.mod.ui.variable;

public class VariableProcessor {
    public static String process(String template) {
        String result = template;
        for (var entry : GlobalVariables.getAll().entrySet()) {
            result = result.replace("{{" + entry.getKey() + "}}", entry.getValue());
        }
        return result;
    }
}