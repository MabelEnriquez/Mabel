package Interface;
import Employee.*;

import Tools.Login;
import Tools.Tool;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Menus mn = new Menus();
        Tools.Tool t = new Tool();
        Tools.Login login = new Login();
        login.check();
        mn.menu();
//        Employee[] employees= login.run();
        mn.login();











    }
}
