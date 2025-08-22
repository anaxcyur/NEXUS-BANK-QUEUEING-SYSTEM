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
public static Queue <Integer> queueA = new LinkedList<Integer>();
public static int counterA = 1;
public static ArrayList<String> nameBP = new ArrayList<>();
public static ArrayList<String> payToBP = new ArrayList<>();
public static ArrayList<String> amountBP = new ArrayList<>();

// for Application:
public static Queue <Integer> queueB = new LinkedList<Integer>();
public static int counterB = 1;
public static ArrayList<String> nameA = new ArrayList<>();
public static ArrayList<String> numberA = new ArrayList<>();
public static ArrayList<String> addressA = new ArrayList<>();
public static ArrayList<String> bdayA = new ArrayList<>();
public static ArrayList<String> occupationA = new ArrayList<>();
public static ArrayList<String> emailA = new ArrayList<>();

// for Foreign Exchange:
public static Queue <Integer> queueC = new LinkedList<Integer>();
public static int counterC = 1;
public static ArrayList<String> nameFE = new ArrayList<>();
public static ArrayList<String> changeFE = new ArrayList<>();
public static ArrayList<String> convertFE = new ArrayList<>();
public static ArrayList<String> amountFE = new ArrayList<>();


//FOR COUNTER A SYNC :)))
       public static void showCurrentA() {
           if (queueA.size() > 1) {
                    StringBuilder waitingList = new StringBuilder();
                    int count = 0;
                    for (Integer num : queueA) {
                        if (count > 0) { 
                            waitingList.append("A").append(num).append("\n");
                        }
                        count++;
                    }
                    TV.waitingA.setText(waitingList.toString());
                } else {
                    TV.waitingA.setText("");
                }
           
            Integer servedNum = queueA.peek(); 
            if (servedNum != null) {
                int index = servedNum - 1;

                if (index >= 0 && index < nameBP.size()) {
                    String servedName = nameBP.get(index);
                    String servedPayTo = payToBP.get(index);
                    String servedAmount = amountBP.get(index);

                    DASHBOARD.serveA.setText("A" + servedNum);
                    DASHBOARD.name.setText(servedName);
                    DASHBOARD.pay.setText(servedPayTo);
                    DASHBOARD.amount.setText(servedAmount);

                    TV.serveA.setText("A" + servedNum);
                }


            }
        }

        //FOR COUNTER B SYNC :)))
        public static void showCurrentB() {
            if (queueB.size() > 1) {
                    StringBuilder waitingList = new StringBuilder();
                    int count = 0;
                    for (Integer num : queueB) {
                        if (count > 0) { 
                            waitingList.append("B").append(num).append("\n");
                        }
                        count++;
                    }
                    TV.waitingB.setText(waitingList.toString());
                } else {
                    TV.waitingB.setText("");
                }
           
            Integer servedNum = queueB.peek(); 
            if (servedNum != null) {
                int index = servedNum - 1;

                      String servedName = QUEUEING.nameA.get(index);
                      String servedNumber = QUEUEING.numberA.get(index);
                      String servedAddress = QUEUEING.addressA.get(index);
                      String servedBirthday = QUEUEING.bdayA.get(index);
                      String servedOccupation = QUEUEING.occupationA.get(index);
                      String servedEmail = QUEUEING.emailA.get(index);

                    DASHBOARD.serveB.setText("B" + servedNum);
                    DASHBOARD.name1.setText(servedName);
                    DASHBOARD.number.setText(servedNumber);
                      DASHBOARD.address1.setText(servedAddress);
                      DASHBOARD.bday.setText(servedBirthday);
                      DASHBOARD.occupation.setText(servedOccupation);
                      DASHBOARD.email.setText(servedEmail);



                TV.serveB.setText("B" + servedNum);
            }
        }
        //FOR COUNTER C SYNC :)))
        public static void showCurrentC() {
            if (queueC.size() > 1) {
                    StringBuilder waitingList = new StringBuilder();
                    int count = 0;
                    for (Integer num : queueC) {
                        if (count > 0) { 
                            waitingList.append("C").append(num).append("\n");
                        }
                        count++;
                    }
                    TV.waitingC.setText(waitingList.toString());
                } else {
                    TV.waitingC.setText("");
                }
            Integer servedNum = queueC.peek(); 
            if (servedNum != null) {
                int index = servedNum - 1;

                      String servedName = QUEUEING.nameFE.get(index);
                      String servedChange = QUEUEING.changeFE.get(index);
                      String servedConvert = QUEUEING.convertFE.get(index);
                      String servedAmount = QUEUEING.amountFE.get(index);

                    DASHBOARD.serveC.setText("C" + servedNum);
                    DASHBOARD.name2.setText(servedName);
                    DASHBOARD.change.setText(servedChange);
                    DASHBOARD.convert.setSelectedItem(servedConvert);
                    DASHBOARD.amount3.setText(servedAmount);



                TV.serveC.setText("C" + servedNum);
            }
        }


    public static void main(String[] args) {
        new START_UP().setVisible(true);
        
        
    }

    static void add(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
