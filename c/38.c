/* 有一字符串，包含n个字符。写一函数，将此字符串中从第m个字符开始的全部字符复制成为另一个字符串。*/
#include <stdio.h>
int main()
{
    int n;
    int m;
    scanf("%d", &n);
    getchar();
    char c[n];
    gets(c);
    scanf("%d", &m);
    getchar();
    int t;
    int i;
    for (i = m - 1; i < n; i++)
    {
        /* code */
        printf("%c",c[i]);
    }
}
