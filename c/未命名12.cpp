#include<stdio.h>
#include<math.h>
int main()
{
	double a,b,c,z,s,C;
	printf("�����������������߱߳�,�м��ö��Ÿ���\n") ;
	scanf("%lf,%lf,%lf",&a,&b,&c);
	z=(a+b+c)/2;
	s=sqrt(z*(z-a)*(z-b)*(z-c));
	C=a+b+c; 
	printf("���=%lf\n�ܳ�=%lf",s,C);     //double��lf 
	return 0;
}
