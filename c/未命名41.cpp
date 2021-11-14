#include<stdio.h>
int main()
{
	char grade;
	scanf("%c",&grade);
	printf("ÄãµÄ·ÖÊý¶Î£º\n");
	switch(grade)
	{
		case 'A':printf("85~100\n");break;
		case 'B':printf("70~84\n");break;
		case 'C':printf("60~69\n");break;
		case 'D':printf("<60\n");break;
		default:printf("´íÎó\n");break;
	}
	return 0;	
}
