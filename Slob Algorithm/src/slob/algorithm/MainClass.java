/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slob.algorithm;

import static slob.algorithm.FirstFitAlgorithm.FirstFit;
import static slob.algorithm.BestFitAlgorithm.BestFit;
import static slob.algorithm.WorstFitAlgorithm.WorstFit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @authors - Soman Baqai - Taseen Syed - Muhammad Saad
 * @ Discription - This is the memory allocation model (Partition allocation
 * method). - Driver class.
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // arraylist of memory block and process size
        ArrayList<Long> MemoryBlockSize = new ArrayList<>();
        ArrayList<SingleProcessNode> ProcessSize = new ArrayList<>();

        // printing menu about input type
        System.out.println("Write Type Of Input:");
        System.out.println("1. Default");
        System.out.println("2. Your Own");
        System.out.println("3. Exit");
        System.out.print("Enter your Choise Here: ");
        int inputType = input.nextInt();
        switch (inputType) {
            case 2:
                // taking memory block size as input
                while (true) {
                    System.out.print("Enter Memory Block size: ");
                    MemoryBlockSize.add(input.nextLong());

                    System.out.print("Want to Add another Block(Y/N)? ");
                    String check = input.next();
                    if (check.charAt(0) == 'N' || check.charAt(0) == 'n') {
                        break;
                    }
                }// wnd of while
                while (true) {
                    SingleProcessNode node = new SingleProcessNode();

                    System.out.print("Enter Process size: ");
                    node.setSize(input.nextLong());
                    System.out.print("Enter Arrival Time(in Seconds): ");
                    node.setArrivalTime(input.nextInt());

                    ProcessSize.add(node);

                    System.out.print("Want to Add another Proess(Y/N)? ");
                    String check = input.next();
                    if (check.charAt(0) == 'N' || check.charAt(0) == 'n') {
                        break;
                    }
                }// end of while
                break;
            case 1:
                long a = 100,
                 b = 500,
                 c = 200,
                 d = 300,
                 e = 600;
                MemoryBlockSize.add(a);
                MemoryBlockSize.add(b);
                MemoryBlockSize.add(c);
                MemoryBlockSize.add(d);
                MemoryBlockSize.add(e);
                SingleProcessNode node = new SingleProcessNode();
                a = 212;
                b = 417;
                c = 112;
                d = 426;
                node.setSize(a);
                node.setArrivalTime(1);
                ProcessSize.add(node);
                SingleProcessNode node1 = new SingleProcessNode();
                node1.setSize(b);
                node1.setArrivalTime(1);
                ProcessSize.add(node1);
                SingleProcessNode node2 = new SingleProcessNode();
                node2.setSize(c);
                node2.setArrivalTime(1);
                ProcessSize.add(node2);
                SingleProcessNode node3 = new SingleProcessNode();
                node3.setSize(d);
                node3.setArrivalTime(1);
                ProcessSize.add(node3);
                break;
            default:
                return;
            // allocting memory (implementating algorithm)
        }

        int[] block = new int[MemoryBlockSize.size() + ProcessSize.size()];

        System.out.println("Enter Number of ALgo You want to perform on given input process:");
        System.out.println("1. First Fit");
        System.out.println("2. Best Fit");
        System.out.println("3. Worst Fit");
        System.out.println("4. Quit");
        System.out.print("Enter Your Choise Here: ");
        int algoNum = input.nextInt();

        switch (algoNum) {
            case 1:
                FirstFit(block, MemoryBlockSize, ProcessSize);
                Display.DisplayOutput(block, MemoryBlockSize, ProcessSize);
                break;
            case 2:
                BestFit(block, MemoryBlockSize, ProcessSize);
                Display.DisplayOutput(block, MemoryBlockSize, ProcessSize);
                break;
            case 3:
                WorstFit(block, MemoryBlockSize, ProcessSize);
                Display.DisplayOutput(block, MemoryBlockSize, ProcessSize);
                break;
            default:
                break;

        }
        
        
       
    }
}
