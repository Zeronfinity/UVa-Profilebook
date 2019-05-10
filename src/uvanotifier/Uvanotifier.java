/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvanotifier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zeron
 */
public class Uvanotifier {

    /**
     * @param args the command line arguments
     */
    public static homepage start = new homepage();
    public static add_friend addwin = new add_friend();
    public static update upwin = new update();

    /*    public static LinkedList<String> rname = new LinkedList<String>();
    public static LinkedList<String> uid = new LinkedList<String>();
        public static LinkedList<String> uname = new LinkedList<String>();
    public static int friend_no = 0; */
    public static void main(String[] args) {

        start.setVisible(true);
        //     rname.add("test");
        //   rname.add("gaba");
        //     System.out.println(rname);
    }

}
