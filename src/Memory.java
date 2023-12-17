public class Memory {
    private char[] data;

    void load(long position, char[] data) {
        System.out.println("Memory: Loading data to address " + position);
        this.data = data;
        // Implement the Load method
    }

    void printMemoryContents() {
        System.out.println("Memory Contents:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Address " + i + ": " + data[i]);
        }
    }
}
