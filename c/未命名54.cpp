#include<stdio.h>
#include<math.h>
int main()
{
	double pi=0,c=1.0,n=1;;
	int sign=1;
while (fabs(c)>=1e-6)
{
	c=sign*(1/n);
	pi=pi+c;
	n=n+2;
	sign=-sign;
}
pi=4*pi;
printf("%10.8f\n",pi);
return 0;
}
