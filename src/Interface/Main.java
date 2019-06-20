package Interface;
import Employee.*;

import Tools.Login;
import Tools.Tool;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Menus menu = new Menus();
        Tools.Tool tool = new Tool();
        Tools.Login login = new Login();
        menu.menu();
        login.run();














    }
}
