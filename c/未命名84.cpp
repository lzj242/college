/*
29.�Զ���һ����������λ����,�����Ǽ�λ��,���������ӡ����λ����

��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�

���������ѧ��ֽ��ÿһλ�������½��͡�
*/
#include<stdio.h>
int main()
{
	int n,a,b,c,d,e;
	scanf("%d",&n);
	if(n>9999){ 
	printf("%d has five numbers\n",n);
	a=n/10000;
	b=(n%10000)/1000;
	c=(n%1000)/100;
	d=(n%100)/10;
	e=n%10;
	printf("%d,%d,%d,%d,%d",e,d,c,b,a);
}
	if(n>999){ 
	printf("%d has four numbers\n",n);
	a=n/1000;
	b=(n%1000)/100;
	c=(n%100)/10;
	d=(n%10);
	printf("%d,%d,%d,%d",d,c,b,a);
}
else	if(n>99){ 
	printf("% has three numbers\n",n);
	a=n/100;
	b=(n%100)/10;
	c=(n%10);
	printf("%d,%d,%d",c,b,a);
}
	else if(n>9){ 
	printf("%d has two numbers\n",n);
	a=n/10;
	b=(n%10);
	printf("%d,%d",b,a);
}
	 else if(n>0){ 
	printf("%d has one numbers\n",n);
	a=n%10;
	printf("%d",a);
}
return 0;
}
