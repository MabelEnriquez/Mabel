package Interface;
import Employee.*;

import Tools.Login;
import Tools.Tool;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

import static Interface.Menus.menu;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Menus menu = new Menus();
        Tools.Tool tool = new Tool();
        Tools.Login login = new Login();
        login.check();
        menu.menu();
        Employee[] employees= login.run();
        menu.login(employees);














    }
}
