#include<stdio.h>
struct Date
{
    /* data */
    int year;
    int month;
    int day;
}date;
int main()
{
    scanf("%d %d %d",&date.year,&date.month,&date.day);
    int sum=0;
    if(date.year%400==0){
        switch (date.month)
        {
        case 1:
            sum=0;
            break;
        case 2:
            sum = 31;
            break;
        case 3:
            sum = 60;
            break;
        case 4:
            sum=91;
            break;
        case 5:
            sum=121;
            break;
        case 6:
            sum=152;
            break;
        case 7:
            sum=182;
            break;
        case 8:
            sum=213;
            break;
        case 9:
            sum=244;
            break;
        case 10:
            sum=274;
            break;
        case 11:
            sum=304;
            break;
        case 12:
            sum=335;
            break;
        default:
            break;
        }
    }
    else
    {
        switch (date.month)
        {
        case 1:
            sum = 0;
            break;
        case 2:
            sum = 31;
            break;
        case 3:
            sum = 59;
            break;
        case 4:
            sum = 90;
            break;
        case 5:
            sum = 120;
            break;
        case 6:
            sum = 151;
            break;
        case 7:
            sum = 181;
            break;
        case 8:
            sum = 212;
            break;
        case 9:
            sum = 243;
            break;
        case 10:
            sum = 273;
            break;
        case 11:
            sum = 304;
            break;
        case 12:
            sum = 334;
            break;
        default:
            break;
        }
    }
    sum=sum+date.day;
    printf("%d",sum);
}
