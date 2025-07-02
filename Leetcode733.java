class Leetcode733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int oc=image[sr][sc];
            if(oc!=color)
            color(sr,sc,color,image,oc);
            return image;
    }
    public static void color(int sr,int sc,int color,int image[][],int oc)
    {
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||image[sr][sc]!=oc)return;
        if(image[sr][sc]==oc)
        {
            image[sr][sc]=color;
        }
                        color(sr-1,sc,color,image,oc);

                  color(sr+1,sc,color,image,oc);
                 color(sr,sc-1,color,image,oc);
                         color(sr,sc+1,color,image,oc);

    }
}