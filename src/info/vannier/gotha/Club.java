/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.vannier.gotha;

/**
 *
 * @author Luc Vannier
 */
public class Club implements java.io.Serializable{
    private String name;

    public Club(String name){
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
