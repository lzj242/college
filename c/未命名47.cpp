#include <stdio.h>
int main()
{
	double x,y1,y2,y3;
	scanf("%lf",&x);
	y1=x;
	y2=2*x-1;
	y3=3*x-11;
    if(x<1)
	printf("%lf",y1);
    else if (1<=x<10)
	printf("%lf",y2);
	else 
	printf("%lf",y3);
	return 0;		
	}
