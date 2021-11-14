#include<stdio.h>
#include<math.h>
int main()
{
	double a,b,c,z,s,C;
	printf("请输入三角形三条边边长,中间用逗号隔开\n") ;
	scanf("%lf,%lf,%lf",&a,&b,&c);
	z=(a+b+c)/2;
	s=sqrt(z*(z-a)*(z-b)*(z-c));
	C=a+b+c; 
	printf("面积=%lf\n周长=%lf",s,C);     //double用lf 
	return 0;
}
