#include<stdio.h>
#include<math.h>
int main()
{
    double a,b,c,x1,x2;
	scanf("%lf,%lf,%lf",&a,&b,&c);
	x1=(-b+sqrt(b*b-4.0*a*c))/(2.0*a);
	x2=(-b-sqrt(b*b-4.0*a*c))/(2.0*a);
	printf("x1=%7.3lf\n,x2=%7.3lf",x1,x2);
	return 0;
}
