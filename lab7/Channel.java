import java.util.ArrayList;
import java.util.List;

public class Channel{

    private String name;
    private List<String> types = new ArrayList<>();
    private Agency agency = new Agency();
    
    public Channel(String name){
        super();
        this.name = name;
        
    }

    public void update(String newsType, String content, String topic){
        for(String type: types){
            if (newsType.equals(type)){
                System.out.println(newsType + " news received for channel " + this.name );
                System.out.println("Topic: " + topic);
                System.out.println("Content: " + content);
                System.out.println("");
            }
        }
      
    }

    public void registeredAgency(Agency agency){
        this.agency = agency;
    }

    public void addTypes(String type){
        types.add(type);
    }

    public void removeTypes(String type){
        types.remove(type);
    }
}