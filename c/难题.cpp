#include<stdio.h>
//������
int main()
{
	int max(int x,int y ,int z);
	int a,b,c,e;
	scanf("%d,%d",&a,&b,&c); 
	e=max(a,b,c);
	printf("max=%d\n",e);
	return 0;
} 
//�����������еĽϴ��ߵ�max����
int max(int x,int y,int z)
{
	int j;
	if(x>y)j=x;
	else j=y;
	if(j>z)j=j;
	else j=z;
	return(z);
} 
