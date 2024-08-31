#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <graphics.h>


void CircleMidpoint(int xcenter, int ycenter,int radius)
{
    int x=0;
    int y=radius;
    int p=1-radius;
    void CirclePlotpoints(int ,int ,int ,int );

    CirclePlotpoints(xcenter, ycenter, x, y);

    while (x<y)
    {
	x++;
	if (p<0)
	{
	    p+=2*x+1;
	}
	else
	{
	    y--;
	    p+=2*(x-y)+1;
	}
	CirclePlotpoints(xcenter, ycenter,x,y);
    }

}


void CirclePlotpoints(int xcenter, int ycenter, int x, int y)
{
    putpixel(xcenter+x, ycenter+y,RED);
    putpixel(xcenter-x, ycenter+y,RED );
    putpixel(xcenter+x, ycenter-y,RED);
    putpixel(xcenter-x, ycenter-y,RED);
    putpixel(xcenter+y, ycenter+x,RED);
    putpixel(xcenter-y, ycenter+x,RED);
    putpixel(xcenter+y, ycenter-x,RED);
    putpixel(xcenter-y, ycenter-x,RED);
}


int main()
{
    int gd = DETECT, gm;
    int xcenter = 320, ycenter = 240, radius = 200;
    initgraph(&gd, &gm, "c:\\turboc3\\bgi");

    CircleMidpoint(xcenter, ycenter, radius);
    
    getch();
    closegraph();
    return 0;
}