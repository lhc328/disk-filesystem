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
public class OFILE {
    private char[] name = new char[20];
    private char attribute;
    private int startnum;
    private int length;
    private int flag;
    private Pointer read;
    private Pointer write;

    /**
     * @return the name
     */
    public char[] getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(char[] name) {
        this.name = name;
    }

    /**
     * @return the attribute
     */
    public char getAttribute() {
        return attribute;
    }

    /**
     * @param attribute the attribute to set
     */
    public void setAttribute(char attribute) {
        this.attribute = attribute;
    }

    /**
     * @return the startnum
     */
    public int getStartnum() {
        return startnum;
    }

    /**
     * @param startnum the startnum to set
     */
    public void setStartnum(int startnum) {
        this.startnum = startnum;
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

    /**
     * @return the flag
     */
    public int getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(int flag) {
        this.flag = flag;
    }

    /**
     * @return the read
     */
    public Pointer getRead() {
        return read;
    }

    /**
     * @param read the read to set
     */
    public void setRead(Pointer read) {
        this.read = read;
    }

    /**
     * @return the write
     */
    public Pointer getWrite() {
        return write;
    }

    /**
     * @param write the write to set
     */
    public void setWrite(Pointer write) {
        this.write = write;
    }
}
