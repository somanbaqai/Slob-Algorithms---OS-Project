/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slob.algorithm;

import java.util.ArrayList;

/**
 *
 * @author somanbaqai
 */
public class Display {

    public static void DisplayOutput(int[] block, ArrayList<Long> MemoryBlockSize, ArrayList<SingleProcessNode> ProcessSize) {

        System.out.println("\nprocess No. \t Process Size \t Block Size  \t Fregmentation \t Memory Block");
        for (int i = 0; i < ProcessSize.size(); i++) {
            SingleProcessNode node = ProcessSize.get(i);
            if (node.getFragmentation() != null) {
                System.out.print(i + 1 + " \t\t " + node.getSize() + " \t\t " + (node.getSize() + node.getFragmentation()));
            } else {
                System.out.print(i + 1 + " \t\t " + node.getSize() + " \t\t " + "null");
            }
            System.out.print(" \t\t " + node.getFragmentation());
            if (block[i] != 0) {
                System.out.println("\t\t " + block[i]);
            } else {
                System.out.println(" \t\t Unallocated Process");
            }

        }

    }

}
