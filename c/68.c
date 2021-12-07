#include <stdio.h>
#include <string.h>
int main()
{
    int n;
    int e = 0;
    scanf("%d", &n);
    getchar();
    if(n>100)
    {
        return -1;
    }
    char s[1000];
    while (1)
    {
        /* code */
        gets(s);
        if (s[0] == ' ')
        {
            return -1;
        }
        else
        {
            if (e < n)
            {
                puts(s);
            }
            else
            {
                int t;
                t = strlen(s);
                for (int i = 0; i < t; i++)
                {
                    /* code */
                    printf("%c", s[i]);
                    if (s[i] ==' ')
                    {
                        printf("\n");
                    }
                }
            }
            e++;
            memset(s,'\0',strlen(s));
        }
    }
}