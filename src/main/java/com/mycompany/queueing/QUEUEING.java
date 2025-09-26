/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queueing;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;


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
public static ArrayList<String> conAmountFE = new ArrayList<>();
public static int servedCountC = 0; 

// ---------------- HOLD QUEUES ----------------
public static Queue<Integer> holdA = new LinkedList<>();
public static Queue<Integer> holdB = new LinkedList<>();
public static Queue<Integer> holdC = new LinkedList<>();

  


    public static void printReceiptA() {
    Integer servedNum = queueA.peek(); 
    if (servedNum != null) {
        int index = servedNum - 1;

        if (index >= 0 && index < nameBP.size()) {
            String servedName   = nameBP.get(index);
            String servedPayTo  = payToBP.get(index);
            String servedAmount = amountBP.get(index);

            String receipt = "<html><pre>"
                    + String.format("%-20s %s<br>", "Queue Number:", "A" + servedNum)
                    + String.format("%-20s %s<br>", "Customer Name:", servedName)
                    + String.format("%-20s %s<br>", "Pay To:", servedPayTo)
                    + String.format("%-20s %s<br>", "Amount:", servedAmount)
                   
                    + "</pre></html>";

            TICKET.resibo.setText(receipt);  
        }
    } else {
        TICKET.resibo.setText("<html><pre>No customer is being served.</pre></html>");
    }
}
    
    public static void printReceiptB() {
    Integer servedNum = queueB.peek(); 
    if (servedNum != null) {
        int index = servedNum - 1;

        if (index >= 0 && index < nameA.size()) {
            String servedName   = nameA.get(index);
            String servedNumber  = numberA.get(index);
            String servedAddress = addressA.get(index);
            String servedBday  = bdayA.get(index);
            String servedOccupation = occupationA.get(index);
            String servedEmail = emailA.get(index);

            String receipt = "<html><pre>"
                    + String.format("%-20s %s<br>", "Queue Number:", "A" + servedNum)
                    + String.format("%-20s %s<br>", "Customer Name:", servedName)
                    + String.format("%-20s %s<br>", "Contact Number:", servedNumber)
                    + String.format("%-20s %s<br>", "Address:", servedAddress)
                    + String.format("%-20s %s<br>", "Birthday:", servedBday)
                    + String.format("%-20s %s<br>", "Occupation:", servedOccupation)
                    + String.format("%-20s %s<br>", "Email:", servedEmail)
                    + "</pre></html>";

            TICKET.resibo.setText(receipt);  
        }
    } else {
        TICKET.resibo.setText("<html><pre>No customer is being served.</pre></html>");
    }
}
    
    public static void printReceiptC() {
    Integer servedNum = queueC.peek(); 
    if (servedNum != null) {
        int index = servedNum - 1;

        if (index >= 0 && index < nameFE.size()) {
            String servedName   = nameFE.get(index);
            String servedAmount  = amountFE.get(index);
            String servedChange = changeFE.get(index);
            String servedConvert  = convertFE.get(index);
            String conAmount= conAmountFE.get(index);

            String receipt = "<html><pre>"
                    + String.format("%-20s %s<br>", "Queue Number:", "A" + servedNum)
                    + String.format("%-20s %s<br>", "Customer Name:", servedName)
                    + String.format("%-20s %s<br>", "Currency:", servedChange)
                    + String.format("%-20s %s<br>", "Amount:", servedAmount)
                    + String.format("%-20s %s<br>", "Convert to:", servedConvert)
                    + String.format("%-20s %s<br>", "Converted amount:", "PHP "+ conAmount)
                    + "</pre></html>";

            TICKET.resibo.setText(receipt);  
        }
    } else {
        TICKET.resibo.setText("<html><pre>No customer is being served.</pre></html>");
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
                DASHBOARD.amount.setText(null);
                TV.serveA.setText("");
            }
        }
        public static void holdA() {




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

                String servedName       = QUEUEING.nameA.get(index);
                String servedNumber     = QUEUEING.numberA.get(index);
                String servedAddress    = QUEUEING.addressA.get(index);
                String servedBirthday   = QUEUEING.bdayA.get(index); 
                String servedOccupation = QUEUEING.occupationA.get(index);
                String servedEmail      = QUEUEING.emailA.get(index);

                DASHBOARD.serveB.setText("B" + servedNum);
                DASHBOARD.name1.setText(servedName);
                DASHBOARD.number.setText(servedNumber);
                DASHBOARD.address1.setText(servedAddress);

                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    Date date = sdf.parse(servedBirthday);
                    DASHBOARD.bday.setDate(date); 
                } catch (Exception e) {
                    e.printStackTrace();
                    DASHBOARD.bday.setDate(null); 
                }

                DASHBOARD.occupation.setText(servedOccupation);
                DASHBOARD.email.setText(servedEmail);

                TV.serveB.setText("B" + servedNum);
                DASHBOARD.inQueueB.setText(String.valueOf(queueB.size() - 1));
            } else {
                DASHBOARD.serveB.setText("");
                DASHBOARD.name1.setText("");
                DASHBOARD.number.setText("");
                DASHBOARD.address1.setText("");
                DASHBOARD.bday.setDate(null); 
                DASHBOARD.occupation.setText("");
                DASHBOARD.email.setText("");

                TV.serveB.setText("");
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
                      String servedConAmount = QUEUEING.conAmountFE.get(index);

                    DASHBOARD.serveC.setText("C" + servedNum);
                    DASHBOARD.name2.setText(servedName);
                    DASHBOARD.change.setSelectedItem(servedChange);
                    DASHBOARD.convert.setSelectedItem(servedConvert);
                    DASHBOARD.amount3.setText(servedAmount);
                    DASHBOARD.conAmount.setText(servedConAmount);



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
        
        // ======== HOLD / PULL METHODS ========
        
            public static void holdCurrentA() {
                Integer servedNum = queueA.poll();
                if (servedNum != null) {
                    holdA.offer(servedNum);
                    showCurrentA();
                    updateHoldListA();
                }
            }
            public static void holdCurrentB() {
                Integer servedNum = queueB.poll();
                if (servedNum != null) {
                    holdB.offer(servedNum);
                    showCurrentB();
                    updateHoldListB();
                }
            }
            public static void holdCurrentC() {
                Integer servedNum = queueC.poll();
                if (servedNum != null) {
                    holdC.offer(servedNum);
                    showCurrentC();
                    updateHoldListC();
                }
            }
            public static void recallHeldA() {
                 Integer heldNum = holdA.poll();
                if (heldNum != null) {
                    queueA.offer(heldNum);
                    showCurrentA();
                    updateHoldListA();
                }
            }
            public static void recallHeldB() {
                Integer heldNum = holdB.poll();
                if (heldNum != null) {
                    queueB.offer(heldNum);
                    showCurrentB();
                    updateHoldListB();
                }
            }
            public static void recallHeldC() {
                Integer heldNum = holdC.poll();
                if (heldNum != null) {
                    queueC.offer(heldNum);
                    showCurrentC();
                    updateHoldListC();
                }
            }
            public static void updateHoldListA() {
                if (holdA.isEmpty()) {
                    DASHBOARD.holdListA.setText("No customers on hold");
                } else {
                    StringBuilder list = new StringBuilder("\n");
                    for (Integer num : holdA) {
                        list.append("A").append(num).append("\n");
                    }
                    DASHBOARD.holdListA.setText(list.toString());
                    TV.TVHoldA.setText(list.toString());
                }
            }
            public static void updateHoldListB() {
                if (holdB.isEmpty()) {
                    DASHBOARD.holdListB.setText("No customers on hold");
                } else {
                    StringBuilder list = new StringBuilder("\n");
                    for (Integer num : holdB) {
                        list.append("B").append(num).append("\n");
                    }
                    DASHBOARD.holdListB.setText(list.toString());
                    TV.TVHoldB.setText(list.toString());
                }
            }
            public static void updateHoldListC() {
                if (holdC.isEmpty()) {
                    DASHBOARD.holdListC.setText("No customers on hold");
                } else {
                    StringBuilder list = new StringBuilder("\n");
                    for (Integer num : holdC) {
                        list.append("C").append(num).append("\n");
                    }
                    DASHBOARD.holdListC.setText(list.toString());
                    TV.TVHoldC.setText(list.toString());
                }
            }


        public static void updateConversion() {
            String am = DASHBOARD.amount3.getText().trim();
            String chang = (String) DASHBOARD.change.getSelectedItem();

            if (am.isEmpty() || chang == null || chang.isEmpty()) {
                DASHBOARD.conAmount.setText(""); 
                return;
            }

            try {
                double amount = Double.parseDouble(am);
                double convertedAmount = 0.0;

                switch (chang.toUpperCase()) {
                    case "USD":
                        convertedAmount = amount * 56.5; // USD → PHP
                        break;
                    case "EUR":
                        convertedAmount = amount * 60.2; // EUR → PHP
                        break;
                    case "JPY":
                        convertedAmount = amount * 0.38; // JPY → PHP
                        break;
                    default:
                        convertedAmount = amount;
                }
                DASHBOARD.conAmount.setText(String.format("%.2f PHP", convertedAmount));

            } catch (NumberFormatException e) {
                DASHBOARD.conAmount.setText(""); // clear if invalid number
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
