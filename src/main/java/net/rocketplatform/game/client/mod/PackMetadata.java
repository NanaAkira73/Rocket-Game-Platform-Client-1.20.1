package net.rocketplatform.game.client.mod;

public class PackMetadata {
    public static class Version {
        public int id;
        public String name;
        public Version(int id, String name) { this.id = id; this.name = name; }
        public int getId() { return id; }
        public String getName() { return name; }
    }

    public int id;
    public String name;
    public Version version;

    public PackMetadata(int id, String name, Version version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public Version getVersion() { return version; }
}