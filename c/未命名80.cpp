#include<stdio.h>
int main()
{
	int a[100],i,n;
	for(n=2;n<100;n++)
	for(i=2;i<n;i++)
{
		a[i]=n;
        if(a[i]%i==0)
	break;
	   else
	   printf("%d\t",n); 
	}
	return 0;
}
