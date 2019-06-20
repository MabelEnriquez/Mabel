package Tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Login {

    public void run() {
        File file = new File("user.txt");
        try{
            Scanner scan = new Scanner(file);
            Scanner keyboard = new Scanner (System.in);
            String user = scan.nextLine();
            String pass = scan.nextLine(); // looks at selected file in scan

            String inpUser = keyboard.nextLine();
            String inpPass = keyboard.nextLine(); // gets input from user

            if (inpUser.equals(user) && inpPass.equals(pass)) {
                System.out.print("Access Granted");
            } else {
                System.out.print("Access Denied");
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void check() throws IOException {
        File temp = new File("user.txt");
        if(temp.exists())
            System.out.println("Credentials acquired");
        else{
            System.out.println("Credentials created");
            FileWriter writer = new FileWriter(temp);
            writer.write("");
        }

    }


}
