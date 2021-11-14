/*
24.求分数序列前20项之和

题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。

程序分析：请抓住分子与分母的变化规律。
*/
#include<stdio.h>
int main()
{
	float a[20],sum=0;
	for(int i=1;i<=20;i++)
	{
		if(i==1||i==2)
		{
		a[i]=((2*i)-1)/i;
		sum=sum+a[i];
	}
	else
	a[i]=(2*(i-1)-1)+(2*(i-2)-1)/((i-1)+(i-2));
	sum=sum+a[i];
}
printf("%f",sum);
return 0;
}
