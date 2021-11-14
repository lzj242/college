#include<stdio.h>
int main()
{
	char ch;
	
	scanf("%C",&ch); 
	switch(ch)
	{
		case'A': printf("90~100");break;
		case'B': printf("80~89");break;
		case'C': printf("70~79");break;
		case'D': printf("60~69");break;
		case'E':printf("<60");break;
		default: printf("´íÎó");
	}
	return 0;
}
