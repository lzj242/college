#include<stdio.h>
int main()
{
	char ch;
	double c,d;
	void action1(double,double),action2(double,double),action3(double,double),action4(double,double);
	printf("请输入字母ch和两个双精度数a,b,中间用空格隔开\n");
	printf("a/A是加法，b/B是乘法，c/C是减法，d/D是除法\n");
	scanf("%c%lf%lf",&ch,&c,&d);
	switch(ch)
	{
		case'A':
		case'a':action1(c,d);break;
		case'B':
		case'b':action2(c,d);break;
		case'C':
		case'c':action3(c,d);break;
		case'D':
		case'd':action4(c,d);break;
		default:printf("错误");
	}
	 return 0;
}
void action1(double c,double d)
{
	printf("c+d=%lf\n",c+d);     
}
void action2(double c,double d)
{
	printf("c*d=%lf\n",c*d);
}
void action3(double c,double d)
{
	printf("x-y=%lf\n",c-d);
}
void action4(double c,double d)
{
	printf("c/d=%lf\n",c/d);
}

