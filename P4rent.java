public class P4rent {
    String parentName;
    P4rent() {}
    
    P4rent(String parentName){
        this.parentName = parentName;
        System.out.println("Konstruktor Parent");
    }
}

class Baby extends P4rent{
    String babyName;
    
    Baby(String babyName){
        super();
        this.babyName = babyName;
        System.out.println("Konstruktor Baby");
        System.out.println(babyName);
    }
    public void Cry(){
        System.out.println("Owek owek");
    }
    // Test Baby
    public static void main(String[] args) {
        Baby x = new Baby("Khalid");
        x.Cry();
    }
}
