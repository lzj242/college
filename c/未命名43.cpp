#include<stdio.h>
int main()
{
	char ch;
	double c,d;
	void action1(double,double),action2(double,double),action3(double,double),action4(double,double);
	printf("��������ĸch������˫������a,b,�м��ÿո����\n");
	printf("a/A�Ǽӷ���b/B�ǳ˷���c/C�Ǽ�����d/D�ǳ���\n");
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

