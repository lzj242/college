#include<stdio.h>
int main()
{
	char ch;
	double c,d;
	void action1(double,double),action2(double,double),action3(double,double),action4(double,double);
	printf("��������ĸch������˫������a,b,�м��ÿո����\nʹ��Ӣ������\n");
	printf("�������Ӧ����\n");
    scanf("%c%lf%lf",&ch,&c,&d);
	switch(ch)
	{
		
		case'+':action1(c,d);break;
		
		case'-':action2(c,d);break;
	
		case'*':action3(c,d);break;
	
		case'/':action4(c,d);break;
		default:printf("����");
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

