#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

int main()
{
    char fname[30];
    int fd = 0;

    printf("enter the file name that you want to create\n");
    scanf("%s",&fname);   //fname is array name writing '&' is optional.

    fd = creat(fname,0777);
    if(fd == -1)
    {
        printf("Unable to creat file\n");
    }
    else
    {
        printf("file is sucessfully created with fd:%d\n",fd);
    }
return 0;
}