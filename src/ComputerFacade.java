public class ComputerFacade {
    private static final long kBootAddress = 0; // Replace with the correct address if necessary
    private static final long kBootSector = 0; // Replace with the correct sector if necessary
    private static final int kSectorSize = 512; // Replace with the correct sector size if necessary

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        char[] bootData = hardDrive.read(kBootSector, kSectorSize);
        memory.load(kBootAddress, bootData);
        memory.printMemoryContents();
        cpu.jump(kBootAddress);
        cpu.execute();
    }
}
