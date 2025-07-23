public class Laptop {

    int ram;
    int rom;
    String model;
    String processor;

    public Laptop(){
        System.out.println("df");
    }

    public void model(String model){
        this.model = model;
        System.out.println("The model is: " +model);
    }

    public void ram(int ram){
        this.ram = ram;
        System.out.println("The ram is: " +ram);
    }

    public void rom(int rom){
        this.rom = rom;
        System.out.println("The processor is: " +rom);
    }

    public void processor(String processor){
        this.processor = processor;
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        Laptop dell = new Laptop();

        dell.model("XP");
        dell.rom(16);
        dell.ram(8);
        
    }
}
