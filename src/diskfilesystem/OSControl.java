/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskfilesystem;

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
        String[] namearray = name.split("/");
        String[] pathname = null;
        for (int i=0; i < namearray.length - 1; i++){
            pathname[i] = namearray[i]; 
        }
        String filename = namearray[namearray.length - 1];
    }
}
