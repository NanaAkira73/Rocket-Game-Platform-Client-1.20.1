package net.rocketplatform.game.client.mod.ui.loader;

import java.util.*;

public class ListEntryLoader {
    public static class ListEntryTemplate {
        public String name;
        public String description;
        public String icon;
    }

    public static List<ListEntryTemplate> loadTemplates() {
        return new ArrayList<>();
    }
}