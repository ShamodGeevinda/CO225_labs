public class Channel{
    private String name;
    private Agency agency = new Agency();
    
    public Channel(String name){
        super();
        this.name = name;
    }
    public void update(){
        System.out.println("News received for channel " + this.name );
    }

    public void registeredAgency(Agency agency){
        agency = agency;
    }
}