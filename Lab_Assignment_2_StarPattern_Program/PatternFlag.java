public class PatternFlag
{
	public static void main(String[] args)
	{
		for( int k = 1 ; k <= 9 ; k++ )				//loop for * * ===
		{
            		if( k%2 == 0 )					//for even lines
            		{
                		for( int j = 1 ; j <= 5 ; j++ )		
                		{
                    			System.out.print(" *");			//print *
                		}
					System.out.print("  ");
                		for( int j = 1; j <= 34 ; j++ )
                		{
                    			System.out.print("=");			//print =
                		}
            		}
            		else						//for odd lines
            		{
                		for( int i = 1; i <= 6 ; i++ )
                		{
                    			System.out.print("* ");			//print *
				}	
                		for( int j = 1; j <= 34 ; j++ )
                		{
                    			System.out.print("=");			//print =
				}

            		}
            			System.out.println();

        	}

        		for(int i = 1 ; i <= 6 ; i++ )			//loop for ====
			{
            			for (int j = 1 ; j <= 46 ; j++ )
				{
                			System.out.print("=");			//print =
            			}
            				System.out.println();
        		}
    	}
}