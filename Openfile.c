#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

int main()
{
    char fname[30];
    int fd = 0;

    printf("enter the file name that you want to open\n");
    scanf("%s",&fname);   //fname is array name writing '&' is optional.

    fd = open(fname,O_RDWR); //ReaD WRite.
    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("file is sucessfully opened with fd:%d\n",fd);
    }
return 0;
}