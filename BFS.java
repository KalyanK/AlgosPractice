import java.*;
import java.util.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BFS implements Queue {

	 public static void main(String[] args) {
		 
		 node adjMatrix[][] = new node[10][10];
		 List<node> vertexList = new ArrayList<node>(); 
		
		 
		 vertexList.add(new BFS.node('A',false)); 
		 vertexList.add(new BFS.node('B',false));
		 
		// System.out.println("list of nodes"+q[0] + "second element"+q[1]);
		 
		 for(node temp:vertexList){
				System.out.println(temp.nodeLabel);
		 }
		 
		 //adjMatrix[1][1] = 1;
		 
		 
		
	 }
	
	public static class node{
		public char nodeLabel;
		public boolean isVisited;
		
		public node(char nodeLabel,boolean isVisited){
			this.nodeLabel = nodeLabel;
			this.isVisited = isVisited;
		}
	
	}
	
	
	
}


