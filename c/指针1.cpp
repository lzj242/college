#include<stdio.h>
int main()
{
	int a[10],*p;
	for(p=a;p<(a+10);p++)
	scanf("%d",p);
	for(p=a;p<(a+10);p++)
	printf("%d\t",*p);
	return 0;
} 
