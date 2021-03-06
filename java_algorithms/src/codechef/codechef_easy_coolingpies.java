/*
 * The chef has just finished baking several pies, and it's time to place them on cooling racks.
The chef has exactly as many cooling racks as pies. Each cooling rack can only hold one pie, and each pie may only be held by one cooling rack,
but the chef isn't confident that the cooling racks can support the weight of the pies.
The chef knows the weight of each pie,
and has assigned each cooling rack a maximum weight limit.
What is the maximum number of pies the chef can cool on the racks?
Input:
Input begins with an integer T≤30, the number of test cases.
Each test case consists of 3 lines.
The first line of each test case contains a positive integer N≤30,
the number of pies (and also the number of racks).
The second and third lines each contain exactly positive N integers not exceeding 100.
The integers on the second line are the weights of the pies, and the integers on the third line
are the weight limits of the cooling racks.
Output:
For each test case, output on a line the maximum number of pies the chef can place on the racks.
Sample input:
2
3
10 30 20
30 10 20
5
9 7 16 4 8
8 3 14 10 10
 
Sample output:
3
4
 
 */

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class codechef_easy_coolingpies {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine());
		while(testcases-->0){
			int n=Integer.parseInt(br.readLine());
			String pie=br.readLine();
			String pies[]=pie.split(" ");
			int piewt[]=new int[n];
			for(int i=0;i<n;i++) piewt[i]=Integer.parseInt(pies[i]);
			Arrays.sort(piewt);
						
			String rack=br.readLine();
			String racks[]=rack.split(" ");
			int rackwt[]=new int[n];
			for(int i=0;i<n;i++) rackwt[i]=Integer.parseInt(racks[i]);
			Arrays.sort(rackwt);
					
			int i=0,j=0,count=0;
			
			for(j=0;j<n;j++){
				if( piewt[i] <= rackwt[j] )
					{ count++; i++; }
				}
			 System.out.println(count);
			}// end of while		
	}
}