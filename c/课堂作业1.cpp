#include<stdio.h>
int main()
{
	int  h,r,v,n;
	float a=3.14;
	scanf("%d %d",&h, &r);
	v=a*r*r*h;
	n=2000/v;
	printf("n=%d\n",n);
	return 0;
}
