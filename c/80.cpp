//新猴王的选择方法是：让 N 只候选猴子围成一圈（最多 100 只猴子），从某位置起顺序编号为 1 ~ N 号。从第 1 号开始报数，每轮从 1 报到 3 ，
//凡报到 3 的猴子即退出圈子，接着又从紧邻的下一只猴子开始同样的报数。如此不断循环，最后剩下的一只猴子就选为猴王。
#include <stdio.h>

// 函数king：猴子选大王
// 参数：a-猴子数组n-1个猴子分别占据下标为~n-1的位置，n-数组长度
// 返回值：新猴王的下标序号
int king(int a[], int n);
int main()
{
    int n, a[1000], i;     // 定义变量及数组，n-猴子数量，a-猴子数组
    scanf("%d",&n);     // 输入猴子数量，n>0
    // 初始化猴子数组,n 个猴子分别占据 n 个位置
    a[0] = 0; // 0号位置没有猴子
    for(i = 1;i <= n; i++)
        a[i] = i;
    // 选大王啦
    i = king(a, n);
    printf("%d号猴子是大王。\n", i);
    return 0;
}

int king(int a[], int n)
{
    // 请在此添加代码，实现函数king
    /********** Begin *********/
    int x=1,z,l,j=0,t;
  	while(x<=n)
	{
		for(t=1;t<=3;t++)
		{
		a[x]=x%t;
		}
		if(a[x]==0)
		a[x]=3;
		x++;
	}
	l=0;
while(1)
    {
    	for(x=1;x<=n;x++)
    	{
    	if(a[x]==3)
    	{
		a[x]=12;
		l++;
	}
     	if(a[x]!=12)
     	{
		for(t=1;t<=3;t++)
		{
		a[x]=x%t;
		}
		if(a[x]==0)
		a[x]=3;	
	}
}
if(l==(n-1))
break;
}
for(x=1;x<=n;x++)
{
	if(a[x]!=12)
	return x;
}

    
    
    /********** End **********/
}                                              
