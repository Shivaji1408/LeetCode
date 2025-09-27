public class Ques812 {
    public static double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        int n = points.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];
                    double area = 0.5 * Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    public static void main(String args[]){
        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestTriangleArea(points));
    }
}