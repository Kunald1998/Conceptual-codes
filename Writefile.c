#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
//#include<unistd.h>   this is use for Macos or linux OS.

int main()
{
    char fname[30];
    int fd = 0, ret = 0;
    char Data[11] = "Marvellous";

    printf("enter the file name that you want to write\n");
    scanf("%s",&fname);

    fd = open(fname,O_RDWR); 
    if(fd == -1)
    {
        printf("Unable to write file\n");
        return-1;
    }
    else
    {
        printf("file is sucessfully write with fd:%d\n",fd);
    }
    ret = write(fd,Data,10);
    if(ret == 0)
    {
        printf("Unable to write in file");
    }
    
return 0;
}