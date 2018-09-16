/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author kOX
 */
public class Openfile {
    private OFILE[] file = new OFILE[5];
    private int length;

    /**
     * @return the file
     */
    public OFILE[] getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(OFILE[] file) {
        this.file = file;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
}
