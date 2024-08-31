#include <stdio.h>
#include <conio.h>
#include <graphics.h>
#include <stdlib.h>
#include <math.h>


#define ROUND(a) (int)(a+0.5)


void BounderyFill4(int x,iny y,int fill,int boundery)
{
    int current;
    current= getpixel(x,y);
    if(current!=boundery && current!=fill)
    {
        setcolor(fill);
        setpixel(x,y);
        BounderyFill4(x+1,y,fill,boundery);
        BounderyFill4(x-1,y,fill,boundery);
        BounderyFill4(x,y+1,fill,boundery);
        BounderyFill4(x,y-1,fill,boundery);
    }
}


void drawLineDDA(int x1, int y1, int x2, int y2) {
    int dx = x2 - x1;
    int dy = y2 - y1;
    int steps = abs(dx) > abs(dy) ? abs(dx) : abs(dy);
    int i=0;

    float xIncrement = (float)dx / steps;
    float yIncrement = (float)dy / steps;

    float x = x1, y = y1;

    for (i = 0; i <= steps; i++) {
	putpixel(ROUND(x), ROUND(y), WHITE);
	x+= xIncrement;
	y+= yIncrement;
    }
}

int main() {
	int x1,y1,x2,y2;
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "c:\\turboc3\\bgi");

    // printf("Enter the first point:-");
    // scanf("%d%d",&x1,&y1);
    // printf("Enter the last point:-");
    // scanf("%d%d",&x2,&y2);

    drawLineDDA(10,20,50,20);
    drawLineDDA(50,20,50,50);
    drawLineDDA(50,50,10,50);
    drawLineDDA(10,50,10,20);

    getch();
    return 0;
}