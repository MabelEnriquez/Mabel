package Tools;

import Employee.Admin;
import Employee.Employee;

import java.io.*;
import java.util.Scanner;

public class Login {

    public void check() throws IOException {
        File temp = new File("user.txt");
        if(temp.exists())
            System.out.println("Credentials acquired");
        else{
            System.out.println("Credentials created");
            BufferedWriter writer = new BufferedWriter(new FileWriter(temp, true));
            writer.append("0914090998,William,Ayala,wijoayal@espol.edu.ec,wijoayal,Wj789456,admin,,Admin");
            writer.close();
        }
    }

    public Employee[] run() throws IOException {
        File file = new File("user.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int lines = 0;
        while (br.readLine() != null){
            lines++;
        }
        Employee[] employees = new Employee[lines];
        br.close();
        BufferedReader br2 = new BufferedReader(new FileReader(file));
        int i = 0;
        while (br2.readLine() != null){
            String[] values =br2.readLine().split(",");
            employees[i] = new Employee(values[0],values[1],values[2],values[3],values[4],values[5], values[6], values[7],values[8]);
            i++;
        }
        br2.close();
        return employees;
    }

}
