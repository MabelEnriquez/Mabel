package Tools;
import org.apache.commons.codec.binary.Base64;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Tool {

    public Tool() {
    }

    public void printToConsole(String path) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }

    public String getEncstr(String password) {
        String strip = password;
        byte[] encryptArray = Base64.encodeBase64(strip.getBytes());
        String encstr = null;
        try {
            encstr = new String(encryptArray, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encstr;
    }

    public String getDecstr(String encstr) {
        String strDec = encstr;
        byte[] dectryptArray = strDec.getBytes();
        byte[] decarray = Base64.decodeBase64(dectryptArray);
        String decstr = null;
        try {
            decstr = new String(decarray,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return decstr;
    }

    public boolean isInt(String input){
        try{
            int x = Integer.parseInt(input);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean verificarCedula(String cedula) {
        int total = 0;
        int tamano = 10;
        int[] coef = {2,1,2,1,2,1,2,1,2};
        int provincias = 24;
        int tercerDigito = 6;
        if (cedula.matches("[0-9]*") && cedula.length() == tamano){
            int provincia = Integer.parseInt(cedula.charAt(0)+""+cedula.charAt(1));
            int digitoTres = Integer.parseInt( cedula.charAt(2)+"");
            if ((provincia > 0 && provincia <= provincias && digitoTres< tercerDigito)){
                int verificadorRe = Integer.parseInt(cedula.charAt(9)+"");
                for (int i=0; i<coef.length; i++){
                    int valor = Integer.parseInt(coef[i]+"")*Integer.parseInt(cedula.charAt(i)+"");
                    total = valor >= 10? total + (valor-9): total+valor;
                }
                int verificadorOb = total >=10 ? (total % 10) != 0 ? 10- (total%10): (total %10): total;
                if (verificadorOb == verificadorRe) return true;
            }
            return false;
        }
        return false;
    }

    public boolean verificarClave(String clave){
        String upperCaseChars = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        if (clave.length()>= 8 && clave.matches(upperCaseChars) && clave.matches(numbers)) return true;
        else return false;
    }

    public void checkAirline(String aerolinea) throws IOException {
        File temp = new File("files/aerolineas.txt");
        if(temp.exists()){
            BufferedReader br = new BufferedReader(new FileReader(temp));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp, true));
            boolean airlinExists = false;
            while (br.readLine() != null){
                if (br.readLine().equals(aerolinea)){
                    br.close();
                    System.out.println("Aerolinea ya existe!");
                    airlinExists = true;
                    break;
                }
            }
            if (airlinExists = false){
                bw.append(aerolinea+"\n");
                bw.close();
            }
        }
        else{
            BufferedWriter writer = new BufferedWriter(new FileWriter(temp, true));
            writer.append(aerolinea+"\n");
            writer.close();
        }
    }

    public ArrayList<String> readFile(String path)
    {
        ArrayList<String> list = new ArrayList<>();
        File f = new File(path);
        if(f.exists()){
            BufferedReader br = null;
            try {
                br =new BufferedReader(new FileReader(path));
                String line = "a";
                while (line!=null && !line.isEmpty()) {
                    line = br.readLine();
                    if (line!=null && !line.isEmpty() )
                    {
                        list.add(line);
                    }
                }

            } catch (Exception e) {
                System.out.println("Error al leer el archivo " + e.getMessage());
            } finally {
                if (null!=br)
                {
                    try
                    {
                        br.close();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error al cerrar el archivo en LeerArchivo " + e.getMessage());
                    }
                }
            }
        }
        return list;
    }
}
