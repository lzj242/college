#include<stdio.h>
#include<math.h>
int main()
{
	double a,b,c,t,x1,x2;
	scanf("%lf,%lf,%lf",&a,&b,&c);
    t=sqrt(b*b-4*a*c);
	if((b*b-4*a*c)<0)
	printf("нч╫А╧Ш");
	else
	{
		
		x1=(t-b)/(2.0*a);
		x2=(-t-b)/(2.0*a);
		printf("x1=%7.2f\nx2=%7.2f\n",x1,x2);	
	}
return 0;
}
