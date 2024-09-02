package interview_70;

public class MinimumTimeVisitingAllPoints {

    public static void main(String[] args) {

        int[][] coordinates = {{1,1}, {3,4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(coordinates));
    }

    public static int minTimeToVisitAllPoints(int[][] points){  // time = Math.max((x1-x2),(y1-y2))

        int n = points.length;
        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            int a = Math.abs(points[i][0] - points[i + 1][0]);
            int b = Math.abs(points[i][1] - points[i + 1][1]);

            ans += Math.max(a, b);
        }
        return ans;
    }
}
