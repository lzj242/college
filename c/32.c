#include <stdio.h>
#include <string.h>
int main()
{
    void chance(int t, char c[]);
    char s[99];
    gets(s);
    int n;
    n = strlen(s);
    chance(n, s);
    return 0;
}
void chance(int t, char c[])
{
    char d;
    for (int i = 0; i < t; i++)
    {
        /* code */
        if (c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z')
        {
            if (c[i] !='z'&&c[i]!='Z')
            {
                c[i]= c[i] + 1;
            }
            else
            {
                c[i]= c[i]-25;
            }
        }
    }
    puts(c);
}