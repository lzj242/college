#include <stdio.h>
#include <string.h>
int main()
{
    int resolve(char *s);
    char s[15];
    gets(s);
    printf("%d", resolve(s));
}
int resolve(char *s)
{
    int sum = 0;
    int count = strlen(s);
    for (int i = 0; i < count; i++)
    {
        /* code */
        if (s[i] == 'I')
        {
            if (s[i + 1] != 'V' && s[i + 1] != 'X')
            {
                sum++;
            }
            else
            {
                sum--;
            }
        }
        else if (s[i] == 'V')
        {
            /* code */
            sum += 5;
        }
        else if (s[i] == 'X')
        {
            /* code */
            if (s[i + 1] != 'L' && s[i + 1] != 'C')
            {
                sum += 10;
            }
            else
            {
                sum -= 10;
            }
        }
        else if (s[i] == 'L')
        {
            /* code */
            sum += 50;
        }
        else if (s[i] == 'C')
        {
            /* code */
            if (s[i + 1] != 'D' && s[i + 1] != 'M')
            {
                sum += 100;
            }
            else
            {
                sum -= 100;
            }
        }
        else if (s[i] == 'D')
        {
            /* code */
            sum += 500;
        }
        else if (s[i] == 'M')
        {
            /* code */
            sum += 1000;
        }
    }
    return sum;
    // I=1 ', ' V =5', ' X=10 ', ' L=50', ' C =100', ' D=500 ', M=1000
}