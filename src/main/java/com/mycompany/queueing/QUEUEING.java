/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queueing;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author lucky
 */

public class QUEUEING {
public static String username = "LaquiAng";
public static String password = "12345";

// for Bills Payment:
public static ArrayList<String> nameBP = new ArrayList<>();
public static ArrayList<String> payToBP = new ArrayList<>();
public static ArrayList<String> amountBP = new ArrayList<>();

// for Application:
public static ArrayList<String> nameA = new ArrayList<>();
public static ArrayList<String> numberA = new ArrayList<>();
public static ArrayList<String> addressA = new ArrayList<>();
public static ArrayList<String> bdayA = new ArrayList<>();
public static ArrayList<String> occupationA = new ArrayList<>();
public static ArrayList<String> emailA = new ArrayList<>();

// for Foreign Exchange:
public static ArrayList<String> nameFE = new ArrayList<>();
public static ArrayList<String> changeFE = new ArrayList<>();
public static ArrayList<String> convertFE = new ArrayList<>();
public static ArrayList<String> amountFE = new ArrayList<>();

public static Queue <String> queueA = new LinkedList<String>();
public static int counterA = 1;

public static Queue <String> queueB = new LinkedList<String>();
public static int counterB = 1;

public static Queue <String> queueC = new LinkedList<String>();
public static int counterC = 1;



    public static void main(String[] args) {
        new START_UP().setVisible(true);
        
    }

    static void add(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
