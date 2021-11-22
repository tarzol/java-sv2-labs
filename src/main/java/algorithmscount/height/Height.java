package algorithmscount.height;

public class Height {
    public int countChildrenWithHeightGreaterThan(int[] heights, int maxheight) {
        int count = 0;
        for (int height : heights) {
            if (height < maxheight) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Height height = new Height();
        int[] heights = { 142, 157, 149, 120, 150};
        int maxHeight = 150;
        System.out.println("A játszótéren tartózkodó gyerekek száma: "+height.countChildrenWithHeightGreaterThan(heights, maxHeight));
    }
}
