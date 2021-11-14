#include<stdio.h>
int main()
{
	char a;
	scanf ("%c",&a);
	a=(a>64&&a<91)?(a+32):a;
	printf("%c",a);
	return 0;

	
	
}
