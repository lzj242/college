#include<stdio.h>
int main()
{
    float a,b;
	scanf("%f,%f",&a,&b);
	if(a>b)
	printf("%f,%f",b,a);
	else
	printf("%f,%f",a,b);  //两数不能都为负 
	return 0;
} 
