class pattern7
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
		
	    for(int j='A';j<=i;j++)
	      {
	        System.out.print(j+" ");
		  }
	    System.out.println();
	  
	}
  }
}

    