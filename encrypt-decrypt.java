/* program to encrypt and decrypt a given file with a key */
import java.io.*;
public class task3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        

        try {
            System.out.println(" Choose any one option : ");
            System.out.println(" 1. Encrypt");
            System.out.println("2. Decrypt");
            int option = Integer.parseInt(reader.readLine());


            System.out.println("Enter th einput file path : ");
            String inputFilePAth = reader.readLine();  //import the path of a file to be encrypted


            System.out.println("Enter the output file path");
            String outputFilepPath = reader.readLine(); //Note : create a output file and import its path


            System.out.println("Enter the encrption key: ");
            int encryptionKey = Integer.parseInt(reader.readLine());




            if(option == 1){
                encryptFile(inputFilePAth, outputFilepPath, encryptionKey);
                System.out.println("File encrypted succesfully!");
            }
            else if(option == 2){
                decryptFile(inputFilePAth, outputFilepPath, encryptionKey);
                System.out.println("File decrypted succesfully!");
            }

            else{
                System.out.println("Invalid Option!");

            }
        }

            catch(IOException e){
                System.out.println("An Error Occurred : " + e.getMessage());

            }

        }



        private static void encryptFile(String inputFilePAth, String outputFilepPath, int key) throws IOException{
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePAth));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilepPath))) {
                String line;
                while((line = reader.readLine()) != null){
                    String encryptedLine = encryptString(line, key);
                    writer.write(encryptedLine);
                    writer.newLine();

                }
            }
        
    }


    private static void decryptFile(String inputFilePath, String outputFilePath, int key) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String decryptedLine = decryptString(line, key);
                writer.write(decryptedLine);
                writer.newLine();
            }
        }
    }


    private static String encryptString(String text, int key) {
        StringBuilder encrypted = new StringBuilder();
        for( int i = 0; i <text.length(); i++){
            char c = text.charAt(i);
            encrypted.append((char) (c^key));

        }

        return encrypted.toString();


    }


    private static String decryptString(String encryptedText, int key){
        return encryptString(encryptedText, key);

    }

}

    