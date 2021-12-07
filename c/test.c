#include <stdio.h>
int main()
{
    char s[100];
    while (1)
    {
        gets(s);
        if (s[0] == ' ')
        {
            return -1;
        }
        else
        {
            printf("111\n");
        }
    }
}