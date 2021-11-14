#include<stdio.h>
int main()
{
	float p0=1000,r1=0.0036,r2=0.0225,r3=0.0198,p1,p2,p3;
	p1=p0*(r1+1);
	p2=p0*(r2+1);
	p3=p0*(r3/2+1)*(r3/2+1);
    printf("p1=%f\np2=%f\np3=%f\n",p1,p2,p3);
    return 0;
}

