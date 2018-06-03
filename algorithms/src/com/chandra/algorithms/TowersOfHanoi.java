package com.chandra.algorithms;

/*
Recursive Algorithm :-

1. Move top n-1 disks from Source to Auxiliary tower.
2. Move the nth disk from Source to Destination tower.
3. Move the n-1 disk from Auxiliary tower to Destination tower.
4. Recursive.
*/
public class TowersOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveTowersOfHanoi(3, 'A', 'C', 'B');
	}

	public static void recursiveTowersOfHanoi(int topN, char source, char to, char aux) {
		if(topN == 1) {
			System.out.println("Disk " + topN + " from " + source + " to " + to);
		} else {
			//Move top n-1 disks from Source to Auxiliary tower.
			recursiveTowersOfHanoi(topN-1, source, aux, to);
			//Move the nth disk from Source to Destination tower.
			System.out.println("Disk " + topN + " from " + source + " to " + to);
			//Move the n-1 disk from Auxiliary tower to Destination tower.
			recursiveTowersOfHanoi(topN-1, aux, to, source);
		}
	}
}
