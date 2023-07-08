//package passwordEncrytperAndDecrypter;
//
//public class EncrypterAndDecrypter {
//    // Method to encrypt a password
//    public static String encryptPassword(String password) {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        return passwordEncoder.encode(password);
//    }it
//
//    // Method to check if a password matches the encrypted password
//    public static boolean checkPassword(String password, String encryptedPassword) {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        return passwordEncoder.matches(password, encryptedPassword);
//    }
//
//    public static void main(String[] args) {
//        String password = "myPassword123";
//
//        // Encrypt the password
//        String encryptedPassword = encryptPassword(password);
//        System.out.println("Encrypted password: " + encryptedPassword);
//
//        // Check if a password matches the encrypted password
//        boolean isMatch = checkPassword("myPassword123", encryptedPassword);
//        System.out.println("Password match: " + isMatch);
//    }
//}
