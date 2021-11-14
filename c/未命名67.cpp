#include<stdio.h>
#include<string.h>
int main()
{
	char str1[10],str2[]="China";
	strncpy(str1,str2,6);
	printf("%s",str1);
	return 0;
}
 
