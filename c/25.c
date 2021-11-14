#include<stdio.h>
#include<string.h>
int main()
{
    void judge(char c[99]);
    char str[99];
    gets(str);
    judge(str);
    return 0;
}
void judge(char c[99])
{
    int wordsnumbers=0,numbers=0,spacenumbers=0,othernumbers=0;
    int count;
    count=strlen(c);
    for (int i = 0; i < count; i++)
    {
        /* code */
        if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z')
        {
            wordsnumbers++;
        }
        else if (c[i]>='0'&&c[i]<='9')
        {
            /* code */
            numbers++;
        }
        else if (c[i]==' ')
        {
            /* code */
            spacenumbers++;
        }
        else
        {
            othernumbers++;
        }
    }
    printf("%d %d %d %d", wordsnumbers, numbers, spacenumbers, othernumbers);
}