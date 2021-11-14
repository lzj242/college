#include<stdio.h>
int main()
{
    char str1[7];
    char str2[7]={'0'};
    gets(str1);
    for (int i = 0; i < 4 ;i++)
    {

        str2[2 * i] = str1[i];
        str2[(2*i)+1]=' ';
    }
    for (int  i = 0; i < 7; i++)
    {
        /* code */
        printf("%c",str2[i]);
    }
    return 0;
}