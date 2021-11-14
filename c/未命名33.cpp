#include<stdio.h>
#include<math.h>
int main()
{
	double a,b,c,t,x1,x2;
	scanf("%lf,%lf,%lf",&a,&b,&c);
	t=sqrt(b*b-(4*a*c));
	if(b*b-4*a*c<0)
	printf("нч╫А╧Ш");
	else
	{
		x1=(-b+t)/(2.0*a);
		x2=(-b-t)/(2.0*a);
		printf("%7.2lf,%7.2lf",x1,x2);
    }
	return 0;
}

