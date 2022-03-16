class assign09
{
  public static void main(String args[])
  {
	  char i,j;
    for( i='A';i<='E';i++)
	{
	  for(int k=4;k>=i;k--)
	  { 
        System.out.print(" ");
	  }	
		
	    for( j='A';j<=i;j++)
	      {
	        System.out.print(j+" ");
		  }
	    System.out.println();
	  
	}
  }
}


//A
//A B
//A B C
//A B C D
//A B C D E
