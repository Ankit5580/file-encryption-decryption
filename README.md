# File-encryption-decryption

This Java program allows you to encrypt and decrypt a given file using a simple XOR-based encryption technique with a provided key.

Prerequisites
Ensure you have Java installed on your machine.



 How to Run-


Clone the Repository:

-> git clone https://github.com/Ankit5580/encrypt-decrypt.git
cd encrypt-decrypt



-> Compile the Program:
javac EncryptDecrypt.java


-> Run the Program:
java EncryptDecrypt



Program Flow-
-> The program will prompt you to choose an option:

1. Encrypt
2. Decrypt


-> Enter the input file path (the file you want to encrypt or decrypt).

-> Enter the output file path (the file where the result will be saved).

-> Enter the encryption/decryption key (an integer value).

Example
Encryption
Sample plaintext




-> Choose any one option: 
1. Encrypt
2. Decrypt

1

-> Enter the input file path: 
/path/to/inputfile.txt

-> Enter the output file path: 
/path/to/outputfile.txt

-> Enter the encryption key: 
12345


File encrypted successfully!

-> Decryption
Sample plaintext


-> Choose any one option: 
1. Encrypt
2. Decrypt
2


-> Enter the input file path: 
/path/to/inputfile.txt

-> Enter the output file path: 
/path/to/outputfile.txt

->Enter the encryption key: 
12345

-> File decrypted successfully!



Code Explanation -

Main Method
-> The main method handles user input and directs the flow based on the chosen option (encrypt or decrypt).

Encryption and Decryption Methods

-> encryptFile(String inputFilePath, String outputFilePath, int key): Reads the input file line by line, encrypts each line using the provided key, and writes the encrypted line to the output file.

-> decryptFile(String inputFilePath, String outputFilePath, int key): Reads the encrypted file line by line, decrypts each line using the provided key, and writes the decrypted line to the output file.


Utility Methods

-> encryptString(String text, int key): Encrypts a string using XOR operation with the provided key.

-> decryptString(String encryptedText, int key): Decrypts a string using XOR operation with the provided key (same as encryption for XOR).


Notes-

-> Ensure the key used for encryption and decryption is the same.
-> This is a simple XOR-based encryption and is not suitable for securing sensitive data in production environments.


                                    !! THANKYOU FOR VISTING !!
