#include<stdio.h>
#include<string.h>
int main()
{
	char str1[40],str2[40],str3[40],max[40];
	gets(str1);
	gets(str2);
	gets(str3);
	if(strcmp(str1,str2)>0)
	strcpy(max,str1);
	else
	strcpy(max,str2);
	if(strcmp(str3,max)>0)
	strcpy(max,str3);
	else
	printf("the largest string is%s",max);
	return 0;
}
