#include<stdio.h>
int main() 
{
	int m,n,min,y;
	scanf("%d,%d",&m,&n);
	min=(m>n)?n:m;
	for(y=min;y>=1;y--)
	{
	if(m%y==0&&n%y==0)
	{
	printf("���Լ��=%d\n",y);
	printf("��С������=%d",m*n/y);
	break;
}
	else
	continue;
}                                          
return 0;
}
 
