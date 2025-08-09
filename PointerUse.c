#include<stdio.h>
void main()
{
     int *ptr,a=0;
     a=10;
     ptr=&a;
     *ptr=a+1;//a=11 and *ptr=11;
     printf("%d\n%d",*ptr,a);
    printf("\nHello....");

}
