import java.util.*;
public class SticksGame{
    static class S{int x1,y1,x2,y2;S(int a,int b,int c,int d){x1=a;y1=b;x2=c;y2=d;}}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); List<S> L=new ArrayList<>();
        for(int i=0;i<n;i++) L.add(new S(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));

        int minX=50,maxX=0,minY=50,maxY=0;
        for(S s:L){
            minX=Math.min(minX,Math.min(s.x1,s.x2));
            maxX=Math.max(maxX,Math.max(s.x1,s.x2));
            minY=Math.min(minY,Math.min(s.y1,s.y2));
            maxY=Math.max(maxY,Math.max(s.y1,s.y2));
        }

        int vert=0,horiz=0;
        for(S s:L){
            if(s.x1==s.x2&&(s.y1!=s.y2)&&s.x1>=minX&&s.x1<=maxX) vert++;
            if(s.y1==s.y2&&(s.x1!=s.x2)&&s.y1>=minY&&s.y1<=maxY) horiz++;
        }

        if(vert>=2 && horiz>=2){
            System.out.println("Yes");
            double rectPeri=2.0*((maxX-minX)+(maxY-minY));
            double left=0;
            for(S s:L){
                double len=Math.hypot(s.x2-s.x1,s.y2-s.y1);
                boolean used=(s.x1==s.x2&&(s.x1>=minX&&s.x1<=maxX))||(s.y1==s.y2&&(s.y1>=minY&&s.y1<=maxY));
                if(!used) left+=len;
            }
            System.out.println(left>=rectPeri?"Yes":"No");
            System.out.printf("%.2f\n",(double)((maxX-minX)*(maxY-minY)));
        }else System.out.println("No");

        sc.close();
    }
}
