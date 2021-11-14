#include<stdio.h>
int main()
{
	float a,b,c,max;
	scanf("%f,%f,%f",&a,&b,&c);
	max=a;
	if(max<b)max=b;
	if(max<c)max=c;
	printf("max=%f",max);
	return 0;
} 
