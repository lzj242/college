// 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
#include <stdio.h>
#include <string.h>
int main()
{
    char a[99];
    gets(a);
    int num = 0, ch = 0, other = 0, space = 0;
    for (int i = 0; i < strlen(a); i++)
    {
        /* code */
        if (a[i] == ' ')
        {
            space++;
        }
        else if (a[i] >= '0' && a[i] <= '9')
        {
            /* code */
            num++;
        }
        else if (a[i] >= 'a' && a[i] <= 'z' || a[i] >= 'A' && a[i] <= 'Z')
        {
            ch++;
        }
        else
        {
            /* code */
            other++;
        }
    }
    printf("%d %d %d %d",ch,space,num,other);
}