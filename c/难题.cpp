#include<stdio.h>
//主函数
int main()
{
	int max(int x,int y ,int z);
	int a,b,c,e;
	scanf("%d,%d",&a,&b,&c); 
	e=max(a,b,c);
	printf("max=%d\n",e);
	return 0;
} 
//求三个整数中的较大者的max函数
int max(int x,int y,int z)
{
	int j;
	if(x>y)j=x;
	else j=y;
	if(j>z)j=j;
	else j=z;
	return(z);
} 
