public class MoodyObject {
    protected String getMood(){
        return "moody";
    }
    public void speak(){
        System.out.println("I am : "+getMood());
    }
}

class SadObject {
    protected String getSad(){
        return "sad";
    }
    public void cry(){
        System.out.println("Hoo hoo : "+ getSad());
    }
}

class HappyObject {
     protected String getHappy(){
        return"happy";
    }
    public void laugh(){
        System.out.println("Hahaha : " + getHappy());
    }       
}

class MoodyTest {
    public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        SadObject Sad = new SadObject();
        HappyObject Happy = new HappyObject();
        
        m.speak();
        Sad.cry();
        Happy.laugh();
    }
}