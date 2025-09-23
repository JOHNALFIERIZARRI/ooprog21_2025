public class DebugBox {
    private int width;
    private int length;
    private int height;

        public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

       public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

        public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

       public double getVolume() {
        double vol = length * width * height;
        return vol;
    }

        public double getRadius() {
        double diameter = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
        return diameter / 2;
    }

    public static void main(String[] args) {
        DebugBox box = new DebugBox(5, 10, 2);

        box.showData();
        System.out.println("Volume: " + box.getVolume());
        System.out.println("Radius of inscribed circle: " + box.getRadius());
    }
}
