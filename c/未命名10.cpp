#include <stdio.h>
int main()
{ int a[10] = {1,1,2,6,5,6,3,5,7,3};
 int v,i,n; scanf("%d",&v);
  for(i=n=0;i<10;i++)
   if(a[i]!=v) 
   a[n++]=a[i]; 
   for(i = 0; i<n; i++) 
   printf("%d ", a[i]);
    return 0;
	}
