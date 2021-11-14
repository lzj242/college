#include <stdio.h>
#include <string.h>
int main()
{
    char a[99];
    char b[99];
    char c[99];
    char d[100];
    gets(a);
    gets(b);
    gets(c);
        if (strcmp(a, b) > 0)
        {
            strcpy(d, a);
            strcpy(a, b);
            strcpy(b, d);
        }
        if (strcmp(a, c)>0)
        {
            strcpy(d,a);
            strcpy(a,c);
            strcpy(c,d);
        }
        if (strcmp(b,c)>0)
        {
            strcpy(d,b);
            strcpy(b,c);
            strcpy(c,d);
            /* code */
        }
    puts(a);
    puts(b);
    puts(c);
    return 0;
}
