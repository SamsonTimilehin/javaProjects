package encryptingAndDecrypting;

public class RSAMain {

    public static void main(String[] args) {

        RSA rsa = new RSA();
        try{

            String encryptedMessage = rsa.encrypt("Client Key and Random String");
            System.out.println("Encrypt \n"+encryptedMessage);
            String decryptedMessage = rsa.decrypt(encryptedMessage);
            System.out.println("Decrypt \n"+decryptedMessage);
        }catch (Exception Ignored){

        }
    }
}
