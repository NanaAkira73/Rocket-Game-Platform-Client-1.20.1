package net.rocketplatform.game.client.mod.keypair;

import com.google.gson.*;
import net.rocketplatform.game.client.mod.RocketClientMod;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class KeypairManager {
    private final Path keysDir;
    private ProfileKeyPair currentKeyPair;

    public KeypairManager() {
        keysDir = Paths.get("config", "rgp_client", "keys");
        try {
            Files.createDirectories(keysDir);
        } catch (Exception ignored) {}
    }

    public ProfileKeyPair getOrCreateKeyPair() {
        if (currentKeyPair != null) return currentKeyPair;

        Path keyFile = keysDir.resolve("profile_key.json");
        if (Files.exists(keyFile)) {
            try {
                JsonObject obj = JsonParser.parseReader(new FileReader(keyFile.toFile())).getAsJsonObject();
                currentKeyPair = new Gson().fromJson(obj, ProfileKeyPair.class);
                return currentKeyPair;
            } catch (Exception e) {
                RocketClientMod.LOGGER.warn("Failed to load key pair", e);
            }
        }

        // Generate new key pair
        java.security.KeyPair kp = CryptUtil.generateKeyPair();
        currentKeyPair = new ProfileKeyPair();
        currentKeyPair.publicKey = CryptUtil.encodePublicKey(kp.getPublic());
        currentKeyPair.privateKey = CryptUtil.encodePrivateKey(kp.getPrivate());
        currentKeyPair.keyId = UUID.randomUUID().toString();
        currentKeyPair.createdAt = System.currentTimeMillis();

        try (Writer writer = new FileWriter(keyFile.toFile())) {
            new Gson().toJson(currentKeyPair, writer);
        } catch (Exception e) {
            RocketClientMod.LOGGER.warn("Failed to save key pair", e);
        }

        return currentKeyPair;
    }
}