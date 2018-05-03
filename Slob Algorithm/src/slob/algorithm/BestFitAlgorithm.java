/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slob.algorithm;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author USER
 */
public class BestFitAlgorithm {

    public static void BestFit(int[] block, ArrayList<Long> MemoryBlockSize, ArrayList<SingleProcessNode> ProcessSize) {

        //sorting in decreasing order so that small block come first
        Collections.sort(MemoryBlockSize);
        int blockCount = 0;//calculating block count
        for (int i = 0; i < ProcessSize.size(); i++) {
            Long size = ProcessSize.get(i).getSize();//geting size of processs

            for (int j = 0; j < MemoryBlockSize.size(); j++) {

                if (MemoryBlockSize.get(j) >= size) {
                    Long newBlock = MemoryBlockSize.get(j) - size;
                    MemoryBlockSize.add(j, newBlock);
                    MemoryBlockSize.remove(j + 1);

                    ProcessSize.get(i).setFragmentation(newBlock);//calculating fragmentation
                    block[blockCount] = j + 1;//
                    blockCount++;

                    break;

                }

            }

        }
    }

}
