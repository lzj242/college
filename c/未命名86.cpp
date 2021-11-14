#include<stdio.h>
#include<string.h> 
int main()
{
char str1[10],str2[20];
gets(str1);
gets(str2); 
printf("%s",strcat(str1,str2));
return 0;
} 
