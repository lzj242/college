#include<stdio.h>
int main()
{
	int year;
	scanf("%d",&year);
	if((year%4==0&&year%100!=0)||(year%400==0))
	printf("this is a leap year\n");
	else
	printf("this isn't a leap year\n");
	return 0;
}
