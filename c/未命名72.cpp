#include<stdio.h>
#include<string.h>
int main()
{
	char str1,str2,str3,max;
	gets(str1);
	gets(str2);
	gets(str3);
	if(strcmp(str1,str2)>0)
	max=str1;
	else
	max=str2;
	if(strcmp(str3,max)>0)
	max=str3;
	else
	printf("×î´ó=%c",max);
	return 0;
}
