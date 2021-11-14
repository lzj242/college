#include<stdio.h>
int main()
{
	int a[40]={1,1},i;
	for(i=2;i<40;i++)
	a[i]=a[i-1]+a[i-2];
	for(i=0;i<40;i++)
	{
	printf("%-9d",a[i]);
	if(i%3==0)
	printf("\n");
}
	return 0;
} 
