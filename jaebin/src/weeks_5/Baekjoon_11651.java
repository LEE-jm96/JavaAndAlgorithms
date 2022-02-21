package weeks_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

//백준 알고리즘 11651번 : 좌표 정렬하기 2 , 정렬
public class Baekjoon_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Point pt = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            points.add(pt);
        }
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.y > o2.y) {
                    return 1;
                } else if (o1.y < o2.y) {
                    return -1;
                } else {
                    if (o1.x >= o2.x) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        });
        for (Point item : points) {
            System.out.print(item.x + " " + item.y + "\n");
        }
    }
}
