#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{
    int resolve(char *str);
    char *substr(char *str1, int begin, int end);

    char c1[288];
    gets(c1);
    printf("%d", resolve(c1));
}
int resolve(char *str)
{
    char *substr(char *str1, int begin, int end);
    int maxlength = 1, length = 0, x = 0, y = 0, j, k;
    int n = strlen(str);
    char *p;
    if (n == 0 || str == NULL)
    {
        return 0;
    }
    else
    {
        for (j = 0; j <= n; j++)
        {
            for (k = 0; k <= n; k++)
            {
                if (k > j)
                {
                    int w=0;
                    p = substr(str, j, k);
                    for (x = 0; x < strlen(p); x++)
                    {
                        for (y = 0; y != x && y < strlen(p); y++)
                        {
                            if (p[x] == p[y])
                            {
                                w++;
                                break;
                            }
                        }
                    }
                    int q=strlen(p);
                    if (w==0)
                    {
                        length = strlen(p);
                        if (maxlength < length)
                        {
                            maxlength = length;
                        }
                    }
                }
            }
        }
        return maxlength;
    }
}
char *substr(char *str1, int StartPostion, int SubstringLength)
{
    int stringlen = 0;
    int i = 0;
    int x = 0;
    char *tmp;
    stringlen = strlen(str1);
    tmp = (char *)malloc(sizeof(char) * (SubstringLength + 1));
    if ((StartPostion < 0) || (SubstringLength <= 0) || (stringlen == 0) || (StartPostion >= stringlen))
    {

        strcpy(tmp, "\0");
        return tmp;
    }
    for (i = StartPostion; ((i < stringlen) && (x < SubstringLength)); i++)
    {
        tmp[x] = str1[i];
        x++;
    }
    tmp[x] = '\0';
    return tmp;
}