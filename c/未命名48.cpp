#include<stdio.h>
int main()
{
	char graden;
	scanf("%c",&graden);
	switch(graden)
	{
	case 'A':printf("90~100");break;
	case 'B':printf("80~89");break;
	case 'C':printf("70~89");	break;
	case 'D':printf("60~69");break;
	case 'E':printf("<60");break;
	default:printf("´íÎó");
	}
	return 0;
}
