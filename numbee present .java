public class Main
{
	public static void main(String[] args) 
	{
        int[] array = {1, 4, 34, 56, 7};
        int key = 90;
        for(int i=0;i<array.length;i++)
		{
		    if(array[i]==key)
		    {
		        System.out.println(i);
		        break;
		    }
		}
        System.out.println("-1");	 
	    
	}
}
