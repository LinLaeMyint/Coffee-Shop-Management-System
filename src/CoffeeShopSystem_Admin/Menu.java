
package CoffeeShopSystem_Admin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Menu {
    public void writeFile(ArrayList<String> data) {
        try {
            FileWriter fw = new FileWriter("menudata.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            for(String s: data) {
                pw.write(s + "\n");
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public ArrayList<String> readFile() {
        ArrayList<String> data=new ArrayList<String>();
       try {
           FileReader fr = new FileReader("menudata.txt");
           BufferedReader br = new BufferedReader(fr);
           String s = br.readLine();
           while(s != null) {
               data.add(s);
               s = br.readLine();
           }
           br.close();
           fr.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return data;
   }
	public static void main(String[] args) {
        Menu n = new Menu();
       ArrayList<String> al=new ArrayList<String>();
       n.writeFile(al);
       al = n.readFile();
        for(String s: al) {
            System.out.println(s);
        }
    }
}
