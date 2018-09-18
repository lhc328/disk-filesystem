/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskfilesystem;

import domain.Content;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kOX
 */
public class OSControl {
    
    public static int allocate(){
        int i;
        try {
            Scanner input = new Scanner(DiskFileSystem.file);
            DiskFileSystem.buffer1 = input.nextLine().toCharArray();
            for(i = 3; i < 64; i++){
                if(DiskFileSystem.buffer1[i] == 0){
                    input.close();
                    return i;
                }
            }
            DiskFileSystem.buffer1 = input.nextLine().toCharArray();
            for(i = 0; i < 64; i++){
                if(DiskFileSystem.buffer1[i] == 0){
                    input.close();
                    return i+64;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file cannot be opened!");
        }
        System.out.println("That is no free space");
        return(128);
    }
    
    public static boolean createfile(String name, int attribute){
        if(attribute % 2 == 1){
            System.out.println("The readonly file cannot be created.");
            return false;
        }
        if(DiskFileSystem.openfile.getLength() == 5){
            System.out.println("The count of opened file has been full that you cannot created file");
            return false;
        }
        Content content = searchfile(name);
        
        try {
            Scanner input = new Scanner(DiskFileSystem.file);
            for(int i = 0;i < 2;i++){
                DiskFileSystem.buffer1 = input.nextLine().toCharArray();
            }
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OSControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static Content searchfile(String name){
        Content content = new Content();
        
        
        
        return content;
    }
    
    public static String readfile(String name){
        String data = null;
        Content content = searchfile(name);
        
        return data;
    }
    
    public static boolean writefile(String name){
        Content content = searchfile(name);
        
        return false;
    }
    
    public static boolean openfile(String name){
        Content content = searchfile(name);
        
        return false;
    }
    
    public static boolean closefile(String name){
        
        
        return false;
    }
    
    public static boolean deletefile(String name){
        return false;
    }
    
    public static void deletenum(char num){
        
    }
    
    public static char addnum(char num){
        char newnum = 129;
        return newnum;
    }
}
