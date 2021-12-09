package encryptingAndDecrypting;

public class RSAMain {

    public static void main(String[] args) {

        RSA rsa = new RSA();
        try{

            String encryptedMessage = rsa.encrypt("Hello work");
            System.out.println("Encrypt \n"+encryptedMessage);
            String decryptedMessage = rsa.decrypt(encryptedMessage);
            System.out.println("Decrypt \n"+decryptedMessage);
        }catch (Exception Ignored){

        }
    }
}
