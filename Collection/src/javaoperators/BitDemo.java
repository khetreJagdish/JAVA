package javaoperators;
class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        System.out.println("bitmask : " + bitmask);
        int val = 0x2222;
        System.out.println("Value : " + val);
        // prints "2"
        System.out.println(val & bitmask);
    }
}