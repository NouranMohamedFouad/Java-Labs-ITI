
class Task1
{ 
  static void generateRandomNumbers(int[] arr)
  {
    for(int i=0;i<1001;i++)
    {
        int random=(int) (Math.random()*1001);
        arr[i]=random;
    }
  }
  ////////////////////////////////////////////////
  static int getMax(int[] arr)
  {
    int max=0;
    for(int i=0;i<1001;i++)
    {
        if(max<arr[i])
        {
          max=arr[i];
        }
    }
    return max;
  }
  ////////////////////////////////////////////////
  static int getMin(int[] arr)
  {
    int min=1001;
    for(int i=0;i<1001;i++)
    {
        if(min>arr[i])
        {
          min=arr[i];
        }
    }
    return min;
  }
  ////////////////////////////////////////////////
  
  static int binarySearch(int target,int[] arr)
  {
    int start=0,end=arr.length-1;
    int middle=start+(end-start)/2;
    
    
    while(start<=end)
    {
      if(target<arr[middle])
      {
          end=middle-1;
          middle=start+(end-start)/2;
      }
      else if(target>arr[middle])
      {
          start=middle+1;
          middle=start+(end-start)/2;
      }
      else if(target==arr[middle])
        return arr[middle];
    }
    return -1;
  }
  ////////////////////////////////////////////////
  public static void main(String[] args)
  { 
    
    int arr[]=new int[1001];
    int arr2[]=new int[1001];

    long startTime = System.nanoTime();    
    generateRandomNumbers(arr);
    int max=getMax(arr);
    long estimatedTimeMin = System.nanoTime() - startTime;
    int min=getMin(arr);
    long estimatedTimeMax = System.nanoTime()-startTime-estimatedTimeMin;
    
    System.out.println("min of 1000 random elements="+min);
    System.out.println("max of 1000 random elements="+max); 
    System.out.println("estimated time for min="+estimatedTimeMin);
    System.out.println("estimated time for max="+estimatedTimeMax);
  
    /////////////////////////////////////////////////////////
    
    for(int i=0;i<1001;i++)
    {
        arr2[i]=i;
    }
    if(args.length==0)
    {
        System.out.println("no argument found to search for(BY Binary Search Algorithm)!");
    }
    else if(args.length>=2)
    {
        System.out.println("please only 1 argument!");
    }
    else if(args.length==1)
    {   
      try
      {
            int number=Integer.parseInt(args[0]);
            long startTimeBS = System.nanoTime();
            int result=binarySearch(number,arr2);
            if(result==-1)
            {
                  System.out.println("Number is not found by Binary Search Algorithm"); 
            }
            else
            {
                  System.out.println("Number is found by Binary Search ,result="+result); 
            }
            long estimatedTimeBS = System.nanoTime()-startTimeBS;
            System.out.println("estimated time for searching="+estimatedTimeBS);        
      }
     catch(NumberFormatException e)
      {
            System.out.println("first argument must be a Number!");
      }
    }
  }
}
