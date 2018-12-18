package NovJavaProgramming.hackersGuideToEncryption;

public class HackerApplication {
    public static void main(String[] args) {
        String message = "one two three there will be usually plus minus e";
        Encryptor encryptor = new Encryptor();
        String codedMessege = encryptor.encrypt(message);
        System.out.println(codedMessege);

    }
}
