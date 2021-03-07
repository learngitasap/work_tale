package work_table;

import java.util.Scanner;

public class karnataka {

	 
			public static void main(String[] args)   
			{  
			int n, temp;  
			Scanner s = new Scanner(System.in);  
			System.out.print("Enter the number of elements: ");  
			n = s.nextInt();  
			int a[] = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for (int i = 0; i < n; i++)   
			{  
			a[i] = s.nextInt();  
			}  
			for (int i = 0; i < n; i++)   
			{  
			for (int j = i + 1; j < n; j++)   
			{  
			if (a[i] < a[j])   
			{  
			temp = a[i];  
			a[i] = a[j];  
			a[j] = temp;  
			}  
			}  
			}  
			System.out.println("Array elements in descending order:");  
			System.out.println("jhgyg fhfg");System.out.println("jhgyg fhfg");System.out.println("jhgyg fhfg");
			for (int i = 0; i < n - 1; i++)   
			{  
			System.out.println(a[i]);  
			}  
			System.out.print(a[n - 1]);  
			} 
		 void main1(String args[]){    
				  int i,m=0,flag=0;      
				  int n=3;//it is the number to be checked    
				  m=n/2;      
				  if(n==0||n==1){  
				   System.out.println(n+" is not prime number");      
				  }else{  
				   for(i=2;i<=m;i++){      
				    if(n%i==0){      
				     System.out.println(n+" is not prime number");      
				     flag=1;      
				     break;      
				    }      
				   }      
				   if(flag==0)  { System.out.println(n+" is prime number"); }  
				  }//end of else  
				  System.out.println("for pratice git push to master");
				  System.out.println("again push to master");
				}    
				   
			}  
