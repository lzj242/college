#include<stdio.h>
#include<string.h>
int main()
{
    char c[99];
    gets(c);
    int n;
    n=strlen(c);
    for (int  i = n-1; i >-1; i--)
    {
        /* code */
        printf("%c",c[i]);
    }
    return 0;
}