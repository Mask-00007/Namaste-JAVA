package rectangle_area_223;

public class rectangleArea {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2,
            int bx1, int by1, int bx2, int by2) {

        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

        int overlapArea = overlapWidth * overlapHeight;

        return area1 + area2 - overlapArea;
    }

    public static void main(String[] args) {
        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4;
        int bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;

        int result = computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);

        System.out.println("Total Area = " + result);
    }
}
