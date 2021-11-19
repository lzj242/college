// 给定一个字符串 s ，请你找出其中不含有重复字符的?最长子串?的长度。
// ?
//     示例?1 :
//     输入 : s = "abcabcbb" 输出 : 3 解释 : 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 示例 2 :
//     输入 : s = "bbbbb" 输出 : 1 解释 : 因为无重复字符的最长子串是 "b"，所以其长度为 1
#include <stdio.h>
#include <string.h>
int main()
{
    int max = 1, j = 0;
    char c[50000];
    char c1[50000];
    gets(c);
    int n = strlen(c);
    if (n == 0 || c == NULL)
    {
        printf("0");
    }
    else
    {
        int t = 1, d, o, l, length = 0, f;
        char m;
        for (int i = 0; i < n; i++)
        {
            /* code */
            d = i;
            t = 1;
            o = 0;
            j = 0;
            if (max < length)
            {
                max = length;
            }
            for (;;)
            {
                f = d + 1;
                if (c[d] != c[f] && d < n - 2)
                {
                    m = c[d];
                    for (l = 0; l < t; l++)
                    {
                        /* code */
                        if (m == c1[l])
                        {
                            break;
                        }
                    }
                    if (l >= t)
                    {
                        c1[o] = m;
                        o++;
                        t++;
                        d++;
                        length = strlen(c1);
                    }
                    else if (l < t)
                    {
                        j++;
                        break;
                    }
                }
                if (j > 0)
                {
                    break;
                }
                else if (c[d] == c[f] || d == n - 2)
                {
                    break;
                }
            }
        }
        printf("%d", max);
    }
}