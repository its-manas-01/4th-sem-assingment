#include <stdio.h>
#include <conio.h>
#include <graphics.h>
#include <stdlib.h>


void drawLineBresenham(int x1, int y1, int x2, int y2)
{
    int dx = abs(x2 - x1);
    int dy = abs(y2 - y1);
    int p=2*dy-dx;
    int x = x1, y = y1;

    int i=0;
    for (i = 0; i <= dx; i++)
    {
        if(p<0)
        {
            putpixel(x, y, RED);
            p = p + 2*dy;
            x++;
        }
        else
        {
            putpixel(x, y, RED);
            p=p+2*dy-2*dx;
            x=x+1;
            y=y+1;
        }
    }
    
    
}


int main() {
	int x1,y1,x2,y2;
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "c:\\turboc3\\bgi");

    printf("Enter the first point:-");
    scanf("%d%d",&x1,&y1);
    printf("Enter the last point:-");
    scanf("%d%d",&x2,&y2);

    drawLineBresenham(x1, y1, x2, y2);

    getch();
    return 0;
}