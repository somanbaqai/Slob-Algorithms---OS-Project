#Slob Algorithm

## Prerequisites

- OOP concepts
- Java
- Java SDK
- Basic understanding of Processes' Memory Management

## Project Description

The SLOB (Simple List Of Blocks) allocator is one of three available memory allocators in the Linux kernel. It uses First Fit, Best Fit or Worst Fit algorithm to allocate the incoming processes according to their sizes. 

## Problem Statement

SLOB allocator addresses the basic problem in the Memory Management aspect of the Operating System. Incoming processes are of varying sizes that have to be allocated memory blocks which suit their size the best. This improves the efficiency of memory usage in the system otherwise a lot of memory leakage will result which is usually termed as fragmentation. SLOB Allocator basically minimizes the external fragmentation using First Fit, Best Fit or Worst fit algorithm.

## Procedure and Method/Implementation

The project enclosed is a practical algorithm implementation of SLOB Allocator in  Java using the basic OOP. A user is allowed to enter the processes’ size along with the memory blocks’ size which is utilized by the algorithm in determining the best choice for the incoming processes according to the chosen algorithm (First, Best, Worst) Fit.
Processes Blocks and Memory Blocks are the two used arrays; Processes blocks consists of incoming blocks while memory blocks consists of the available free space in the address space that can be allocated to a process. Holes created during every insertion of a process are quitely maintained and utilized just like the original memory blocks which is a key factor in any SLOB Allocation algorithm.

## Project Result

The Java Application shows the clear representation of SLOB Allocation’s all three algorithms and their characteristics are made clear. The SLOB allocator is designed to require little memory for the implementation and housekeeping, for use in small systems such as embedded systems. SLOB pages segregate blocks based on a wider range of allocation sizes. SLOB has several advantages over SLUB in terms of an attacker's ability to control the allocation and freeing of adjacent heap structures. Unfortunately, a major limitation of the SLOB allocator is that it suffers greatly from internal fragmentation. 

## Authors 

- Muhammad Saad
- Soman Baqai
- Taseen Syed

## References

Jesse Russell, Ronald Cohn, (2012) ‘Slob’, Book on Demand.
Robert Love, (2003) ‘Kernel Korner – Allocating Memory in the Kernel’.
Christoph Lameter, (2014) ‘LinuxCon – Slab Allocators in the Linux Kernel’.

