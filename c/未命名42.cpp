#include<stdio.h>
int main()
{
	char grade;
	scanf("%c",&grade);
	printf("ÄãµÄ·ÖÊı¶Î:");
	switch(grade)
	{
	case 'A':printf("85~100");break;
	case 'B':printf("70~84");break;
	case 'C':printf("60~69");break;
	case 'D':printf("<60");break;
	default:printf("´íÎó");	
	}
	return 0;
} 
