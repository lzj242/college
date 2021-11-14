#include <stdio.h>
#include<string.h>
int main()
{
    //完成1:显示菜单
    // 分析
    //1.do-while，若输入4则退出
    //定义相关变量
    //完成2：登记收入
    //分析
    //使用一个字符串来记录收入情况
    //完成3：登记支出
    //分析
    //使用一个字符串来记录支出情况
    //完成4：退出
    //分析
    //使用字符来确定退出
    //完成5：完善
    //完成6
    char key = ' '; //表示用户输入了那个菜单
    int loop = 1;  //控制是否退出循环
    char details[3000] = "  -----------------当前收支明细记录-----------------\n收支\t收支金额\t账户金额\t说明\n";
    char note[20] = " ";//说明
    char temp[100];
    char judge;
    double money=0;
    double balance=1000.0;//账户余额
    int flag=0;//
    do
    {
        /* code */
        printf("\n----------家庭收支记账软件----------\n");
        printf("\n");
        printf("            1 收支明细     \n");
        printf("            2 登记收入     \n");
        printf("            3 登记支出     \n");
        printf("            4 退    出     \n");
        printf("\n");
        printf("请选择(1-4)：\n");
        scanf("%c", &key);
        getchar();
        switch (key)
        {
        case /* constant-expression */ '1':
            if(flag==0)
            {
                printf("当前没有一笔收支，来一笔吧\n");
            }
            else
            {
            puts(details);
            }
            /* code */
            break;
        case '2':
            printf("本次收入金额:");
            scanf("%lf",&money);
            getchar();
            balance+=money;//更新余额
            printf("本次收入说明:");
            gets(note);
            sprintf(temp,"\n收入\t%.2lf\t\t%.2lf\t\t%s",money,balance,note );
            strcat(details,temp);
            flag=1;
            break;
        case '3':
            printf("本次支出金额:");
            scanf("%lf", &money);
            getchar();
            //判断是否够支出
            if(balance-money<0)
            {
                printf("余额不足");
            }
            else
            {
                balance -= money; //更新余额
                printf("本次支出说明:");
                gets(note);
                sprintf(temp, "\n支出\t%.2lf\t\t%.2lf\t\t%s", money, balance, note);
                strcat(details, temp);
                flag = 1;
            }
            break;
        case '4':
            do
            {
                /* code */
            printf("你确定要退出吗？y/n\n");
            scanf("%c",&judge);
            getchar();
            if(judge=='y'||judge=='n')
            {
                break;
            }
            else
            {
                /* code */
                printf("你的输入有误，请重新输入");
            }
            } while (/* condition */1);
            if(judge=='y')
            {
            loop = 0;
            }
            break;
        default:
            printf("您的输入有误，请重新输入\n");
            break;
        }
    } while (loop);
    printf("你已经成功退出了家庭记账软件");
    getchar();
    return 0;
}