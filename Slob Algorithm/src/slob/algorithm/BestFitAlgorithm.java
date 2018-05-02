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

        Collections.sort(MemoryBlockSize);
        int blockCount = 0;
        for (int i = 0; i < ProcessSize.size(); i++) {
            Long size = ProcessSize.get(i).getSize();

            for (int j = 0; j < MemoryBlockSize.size(); j++) {

                if (MemoryBlockSize.get(j) >= size) {
                    Long newBlock = MemoryBlockSize.get(j) - size;
                    MemoryBlockSize.add(j, newBlock);
                    MemoryBlockSize.remove(j + 1);

                    ProcessSize.get(i).setFragmentation(newBlock);
                    block[blockCount] = j + 1;
                    blockCount++;

                    break;

                }

            }

        }
    }

}
