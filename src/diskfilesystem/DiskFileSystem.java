/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskfilesystem;

import domain.Content;
import domain.Openfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kOX
 */
public class DiskFileSystem {

    /**
     * @param args the command line arguments
     */
    final static String Path = "./home";
    static File file = new File("c.txt");
    static char[] buffer1 = new char[64];
    static Content[] buffer2 = new Content[8];
    static Openfile openfile = new Openfile();
    
    //初始化
    public static boolean init(){
        buffer1[0] = 255;   //fat0被占用
        buffer1[1] = 255;   //fat1被占用
        buffer1[2] = 255;   //根目录被占用
        for (int i = 3; i < 64; i++) {  
            buffer1[i] = 0;                         
        }
        try {
            PrintWriter output = new PrintWriter(file);
            output.println(buffer1);
            for(int i = 0; i < 64; i++){
                buffer1[i] = 0;
            }
            output.println(buffer1);
            char name[] = {'$'};
            for(int i = 0; i < 8; i++){
                buffer2[i].setName(name);
            }
            output.println(buffer2);
            output.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Sorry, the file is not found!");
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        if(!init()){
            
            return;
        }
        else{
            
        }
    }

}
