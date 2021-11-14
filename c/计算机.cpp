#include<stdio.h>
int main()
{
	char ch;
	double c,d;
	void action1(double,double),action2(double,double),action3(double,double),action4(double,double);
	printf("请输入字母ch和两个双精度数a,b,中间用空格隔开\n使用英文输入\n");
	printf("请输入对应法则\n");
    scanf("%c%lf%lf",&ch,&c,&d);
	switch(ch)
	{
		
		case'+':action1(c,d);break;
		
		case'-':action2(c,d);break;
	
		case'*':action3(c,d);break;
	
		case'/':action4(c,d);break;
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
	printf("c-d=%lf\n",c-d);
}
void action3(double c,double d)
{
	printf("x*y=%lf\n",c*d);
}
void action4(double c,double d)
{
	printf("c/d=%lf\n",c/d);
}

