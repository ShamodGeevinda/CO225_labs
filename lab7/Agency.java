import java.util.ArrayList;
import java.util.List;

public class Agency{
    
    private List<Channel> channels = new ArrayList<>();
    private String title;
    private String description;
    private String type;

    public void register(Channel channel){
        channels.add(channel);
    }

    public void unRegister(Channel channel){
        channels.remove(channel);
    }

    public void notifyChannel(String type, String description, String title){
        for (Channel channel: channels){
            channel.update(type, description, title);
        }
    }

    public void updateNews(String title, String description, String type){
        this.title = title;
        this.description = description;
        this.type = type;
        notifyChannel(type, description, title);
    }
        
}