#include<stdio.h>
int main()
{
	int n,i,m=0;
	for(n=1;n<=100;n++)
	{
	for(i=0;i<n;i++)
	
		if(n%i==0)
		continue;
		if(i<n)
		continue;
		else
		printf("%d",n);
		m++;
		if(m%10==0)
		printf("\n"); 
	}
	return 0;
}
