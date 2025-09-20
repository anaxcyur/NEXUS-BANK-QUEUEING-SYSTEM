/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queueing;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import static com.mycompany.queueing.DASHBOARD.noOfServedA;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.*;

/**
 *
 * @author lucky
 */

public class QUEUEING {
public static String username = "BankQueue";
public static String password = "12345";

// for Bills Payment:
public static Queue <Integer> queueA = new LinkedList<Integer>();
public static int counterA = 1;
public static ArrayList<String> nameBP = new ArrayList<>();
public static ArrayList<String> payToBP = new ArrayList<>();
public static ArrayList<String> amountBP = new ArrayList<>();
public static int servedCountA = 0; 

// for Application:
public static Queue <Integer> queueB = new LinkedList<Integer>();
public static int counterB = 1;
public static ArrayList<String> nameA = new ArrayList<>();
public static ArrayList<String> numberA = new ArrayList<>();
public static ArrayList<String> addressA = new ArrayList<>();
public static ArrayList<String> bdayA = new ArrayList<>();
public static ArrayList<String> occupationA = new ArrayList<>();
public static ArrayList<String> emailA = new ArrayList<>();
public static int servedCountB = 0; 

// for Foreign Exchange:
public static Queue <Integer> queueC = new LinkedList<Integer>();
public static int counterC = 1;
public static ArrayList<String> nameFE = new ArrayList<>();
public static ArrayList<String> changeFE = new ArrayList<>();
public static ArrayList<String> convertFE = new ArrayList<>();
public static ArrayList<String> amountFE = new ArrayList<>();
public static int servedCountC = 0; 



    public static void printReceiptA() {
    Integer servedNum = queueA.peek(); 
    if (servedNum != null) {
        int index = servedNum - 1;

        if (index >= 0 && index < nameBP.size()) {
            String servedName   = nameBP.get(index);
            String servedPayTo  = payToBP.get(index);
            String servedAmount = amountBP.get(index);

            // Print receipt to console
            System.out.println("================================");
            System.out.println("         PAYMENT RECEIPT        ");
            System.out.println("================================");
            System.out.println("Queue Number : A" + servedNum);
            System.out.println("Customer Name: " + servedName);
            System.out.println("Pay To       : " + servedPayTo);
            System.out.println("Amount       : " + servedAmount);
            System.out.println("================================");
            System.out.println("   Thank you for your payment!  ");
            System.out.println("================================");
        }
    } else {
        System.out.println("No customer is being served.");
    }
}

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
                    TV.waitingA.setText(null);
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
                    DASHBOARD.pay.setSelectedItem(servedPayTo);
                    DASHBOARD.amount.setText(servedAmount);

                    TV.serveA.setText("A" + servedNum);
                    DASHBOARD.inQueueA.setText(String.valueOf(queueA.size()-1));
                }

            }else{
                DASHBOARD.serveA.setText("");
                DASHBOARD.name.setText("");
                DASHBOARD.pay.setSelectedItem(null);
                DASHBOARD.amount.setText("");
                TV.serveA.setText("");
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
                DASHBOARD.inQueueB.setText(String.valueOf(queueB.size()-1));
            }else {
                DASHBOARD.serveB.setText("");
                DASHBOARD.name1.setText("");
                DASHBOARD.number.setText("");
                DASHBOARD.address1.setText("");
                DASHBOARD.bday.setText("");
                DASHBOARD.occupation.setText("");
                DASHBOARD.email.setText("");

                TV.serveB.setText("");
        }}
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
                    DASHBOARD.change.setSelectedItem(servedChange);
                    DASHBOARD.convert.setSelectedItem(servedConvert);
                    DASHBOARD.amount3.setText(servedAmount);



                TV.serveC.setText("C" + servedNum);
                DASHBOARD.inQueueC.setText(String.valueOf(queueC.size()-1));
            }else {
        
                DASHBOARD.serveC.setText("");
                DASHBOARD.name2.setText("");
                DASHBOARD.change.setSelectedItem(null);
                DASHBOARD.convert.setSelectedItem(null);
                DASHBOARD.amount3.setText("");

                TV.serveC.setText("");
    }
        }
//DING SOUND
   public static void playClickSound() {
            try {
        InputStream audioSrc = QUEUEING.class.getResourceAsStream("/wav/ding.wav");
        if (audioSrc == null) {
            System.out.println("Sound file not found!");
            return;
        }

        Clip clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(audioSrc));
        clip.start();

    } catch (Exception e) {
        e.printStackTrace();
    }
        }

      
      
      
      
      
      
    public static void main(String[] args) {
           new START_UP().setVisible(true);
    }

    static void add(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
