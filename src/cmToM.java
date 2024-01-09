public class cmToM {
    float cm;
    int m;

    void convert(int m) {
        this.m = m * 100;
    }
    void convertToCm() {
        System.out.println(m + "cm");
    }
}
