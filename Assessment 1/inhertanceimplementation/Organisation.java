package inhertanceimplementation;
interface HR{
    void hiring();  //only declaration required
}

interface Designer{
    void designs();
}

//multiple inheritance: achieved in java through interfaces
class Org implements HR, Designer{

    public void hiring(){
        System.out.println("responsible for hiring & firing");
    }

    public void designs(){
        System.out.println("responsible for overall platform UI/UX");
    }
}

public class Organisation{
    public static void main(String[] args){
        Org o = new Org();
        o.hiring();
        o.designs();
    }
}