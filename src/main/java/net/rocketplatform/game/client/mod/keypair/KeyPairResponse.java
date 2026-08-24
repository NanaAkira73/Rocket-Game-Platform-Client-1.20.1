package net.rocketplatform.game.client.mod.keypair;

public class KeyPairResponse {
    public static class KeyPair {
        public String publicKey;
        public String privateKey;
        public String keyId;
    }
    public KeyPair keyPair;
    public String token;
}