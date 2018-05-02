/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slob.algorithm;

/**
 *
 * @author somanbaqai
 */
public class SingleProcessNode implements Comparable {

    private Long Size;
    private int ArrivalTime;
    private Long fragmentation;

    public SingleProcessNode() {
    }

    public SingleProcessNode(Long Size, int ArrivalTime) {
        this.Size = Size;
        this.ArrivalTime = ArrivalTime;
        fragmentation = 0l;
    }

    public Long getSize() {
        return Size;
    }

    public void setSize(Long Size) {
        this.Size = Size;
    }

    public int getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(int ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    public Long getFragmentation() {
        return fragmentation;
    }

    public void setFragmentation(Long fragmentation) {
        this.fragmentation = fragmentation;
    }

    @Override
    public int compareTo(Object o) {
        SingleProcessNode node = (SingleProcessNode) o;
        int compareArrivalTime = node.getArrivalTime();
        return this.ArrivalTime - compareArrivalTime;
    }

}
