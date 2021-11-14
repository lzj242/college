#include<stdio.h>
	int main()
	{  
	  /*********Begin*********/
      int n=1,i;
    char a[10];
   gets(a);
      for(i=0;(a[i]!='/0');i++)
	  {
      n=n*a[i];
	  } 
	  printf("%d",n);
	  /*********End**********/ 
       return 0;
	}

