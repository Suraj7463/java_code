#include<stdio.h>
void main()
{
    int a=10;
    int b=20;

    int *p;
    p=&a;
    printf("value of a is %d",*p);
}