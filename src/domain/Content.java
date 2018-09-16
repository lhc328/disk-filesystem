/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author kOX 文件信息 目录信息
 */
public class Content {

    private char[] name = new char[3];          //文件或目录名
    private char[] type = new char[2];          //文件类型名
    private char attribute;                     //属性
    private char startNum;                      //文件或目录的起始块号
    private char length;                        //文件长度，以盘块为单位

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
     * @return the type
     */
    public char[] getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(char[] type) {
        this.type = type;
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
     * @return the startNum
     */
    public char getStartNum() {
        return startNum;
    }

    /**
     * @param startNum the startNum to set
     */
    public void setStartNum(char startNum) {
        this.startNum = startNum;
    }

    /**
     * @return the length
     */
    public char getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(char length) {
        this.length = length;
    }
    
    
}
