#include<stdio.h>
int main()
{
	int a[100];
	int i,n;
	for(n=0;n<100;n++)
	a[n]=n+1;
	for(n=0;n<101;n++)
	for(i=2;i<n;i++)
	{
		if(a[n]%i==0)
	break;
	else
	printf("%d\t",a[i]);}
	return 0;
}
