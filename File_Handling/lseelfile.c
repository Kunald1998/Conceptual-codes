#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h> 

int main()
{
    char Fname[30]; 

    char Data[11] = "Marvellous";

    int fd = 0,ret = 0;

    printf("enter the file name that you want to write\n");
    scanf("%s",&Fname);

    fd = open(Fname,O_RDWR); 
    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }
    else
    {
        printf("file is sucessfully opened with fd:%d\n",fd);
        //prinf("Hello") // internaly is consider as write(1,"Hello",5)
    }
    lseek(fd,4,0);
     // fd = file discripter//handle
     // 4=kiti ne halchal karayachi.
     //0 = kuthun start karayacha//from where to start. 1 = current position, 2 = end of file. 
      
    read(fd,Data,6);

    write(1,Data,6);
    close(fd);

return 0;
}