#include <stdio.h>
#include <string.h>
int main()
{
    char str1[99];
    char str2[99]={'0'};
    gets(str1);
    int t=0;
    int n;
    n = strlen(str1);
    for (int i = 0; i < n; i++)
    {
        /* code */
        if (str1[i] == 'a' || str1[i] == 'A' || str1[i] == 'e' || str1[i] == 'E' || str1[i] == 'I' || str1[i] == 'O' || str1[i] == 'U' || str1[i] == 'i' || str1[i] == 'o' || str1[i] == 'u')
        {
            str2[t]=str1[i];
            t++;
        }
    }
    puts(str2);
    return 0;
}
