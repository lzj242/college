#include<stdio.h>
#include<math.h> 
int main()
{
	float p,r;
	int n;
	r=0.07;
	scanf("%d",&n);
	p=pow((1+r),n);
	printf("%f",p);
	return 0;	
} 
