package xyz.curuhome.chap115;

public class MagicSquare {
    public static void main(String[] args) {
        int width = 3;
        int [][] magic = new int[width][width];
        int y = width/2;
        int x = 0;
        for(int i=0;i<width;i++){
            for(int j=0;j<width;j++){
                if(magic[x][y]==0){
                    magic[x][y]=i*width+j+1;
                }else {
                    int tempX=x; int tempY=y;
                    if( x-1<0 ){ x=width-1; } else { x=x-1; }
                    if( y-1<0 ){ y=width-1; } else { y=y-1; }
                    if(magic[x][y]==0){
                        magic[x][y]=i*width+j+1;
                    }else{
                        x = tempX+1;
                        y = tempY;
                        if(magic[x][y]==0){
                            magic[x][y]=i*width+j+1;
                        }
                    }
                }
            }
        }
        int total1=0; int total2=0; int total3=0;
        for(int i=0;i<width;i++){
            for(int j=0;j<width;j++){
                if(i==j){total1+=magic[i][j];}
                if(i==0){total2+=magic[i][j];}
                if(i+j+1==width){total3+=magic[i][j];}
                System.out.print("("+i+","+j+")="+magic[i][j]+" ");
            }
            System.out.println();
            /*
                (0,0)=6 (0,1)=1 (0,2)=8
                (1,0)=7 (1,1)=5 (1,2)=3
                (2,0)=2 (2,1)=9 (2,2)=4
             */
        }
        System.out.println("total1="+total1);
        /* total1=15 */
        System.out.println("total2="+total2);
        /* total2=15 */
        System.out.println("total3="+total3);
        /* total3=15 */
    }
}
