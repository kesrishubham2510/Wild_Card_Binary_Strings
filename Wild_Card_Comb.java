import java.util.Scanner;

public class Wild_Card_Comb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Binary Wild Card Pattern");
    String str=sc.nextLine();
    char[] input_Char_Arr=str.toCharArray();
  
    Wild_Card_Binary_Combination_Generator(input_Char_Arr,input_Char_Arr.length,0);
    
	}

	public static void Wild_Card_Binary_Combination_Generator(char[] pattrn,int len,int ind)
	{
	     if(ind==len)
	    	 System.out.println(pattrn);
	         
	     else
	     {
	    	 if(pattrn[ind]=='?')
	    	 {
	    		 pattrn[ind]='0';
	    		 Wild_Card_Binary_Combination_Generator(pattrn,len,ind+1);
	    		 pattrn[ind]='1';
	    		 Wild_Card_Binary_Combination_Generator(pattrn,len,ind+1);
	    		 pattrn[ind]='?';
	    	 }
	    	 
	    	 else
	    		 Wild_Card_Binary_Combination_Generator(pattrn,len,ind+1);
    			    		 
	     }
	}
}
