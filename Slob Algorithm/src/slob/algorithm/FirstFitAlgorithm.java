
package slob.algorithm;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class FirstFitAlgorithm {
    public static void FirstFit(int[] block, ArrayList<Long> MemBSize, ArrayList<SingleProcessNode> ProcessSize) {
        int blockNo = 0;
        for (int i = 0; i < ProcessSize.size(); i++) { // The basic algorithm to implement first first algo starts here
            Long size = ProcessSize.get(i).getSize();
            for (int j = 0; j < MemBSize.size(); j++) {
                if (MemBSize.get(j) >= size) {
                    Long newBlock = MemBSize.get(j) - size;
                    MemBSize.add(j, newBlock);              // Allocating memory to the process
                    MemBSize.remove(j + 1);
                    ProcessSize.get(i).setFragmentation(newBlock);      // Fragmentation update
                    block[blockNo] = j + 1;
                    blockNo++;
                    break; // Loop ends here
                }
            }
        }
    }
}
