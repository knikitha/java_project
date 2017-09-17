import java.util.Scanner;
class fcfs
{
public static void main(String[] args)
   {
       int i,n,wt=0,tat,twt=0,ttat=0,j;
       int[] bt=new int[10];
       float awt,atat;
      Scanner s=new Scanner(System.in);
     System.out.println("Enter number of processors:");
      n=s.nextInt();
        for(i=0;i<n;i++)
            {
                  System.out.println("Enter the Burst Time of the process "+(i+1));
                  bt[i]=s.nextInt();
            }
System.out.println("\t"+"PID"+"\t\t"+"BT"+"\t\t"+"WT"+"\t\t"+"TAT");
          
       for(i=0;i<n;i++)
     {
            tat=bt[i]+wt;
            ttat+=tat;       
           System.out.println("\t"+(i+1)+"\t\t"+bt[i]+"\t\t"+wt+"\t\t"+tat);
             twt+=wt;
            wt+=bt[i];   
           }
            awt=(float)twt/n;
            atat=(float)ttat/n;
 System.out.println("Total Waiting Time "+twt);
System.out.println("Turnaround  Time "+ttat);
         System.out.println("Average Waiting Time "+awt);
     System.out.println("Average Turnaround  Time "+atat);
    }
}
