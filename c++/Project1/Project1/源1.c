#include<stdio.h>
int main()
{
	char c3[100];
	gets(c3);
	int t = 0;
	for (int i = 0; i < sizeof(c3); i++)
	{
		if (c3[i] > 'A' && c3[i] < 'Z')
		{
			t++;
		}
	}
	printf("%d", t);
	return 0;
}