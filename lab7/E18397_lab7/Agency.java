import java.util.ArrayList;
import java.util.List;


// Agency class
public class Agency{

    private List<Channel> channels = new ArrayList<>();
    private String title;
    private String description;
    private String type;

    // register a channel
    public void register(Channel channel){
        channels.add(channel);
    }

    // unregister a channel
    public void unRegister(Channel channel){
        channels.remove(channel);
    }

    // notify channel when a news received
    public void notifyChannel(String type, String description, String title){
        for (Channel channel: channels){
            channel.update(type, description, title);
        }
    }

    // function to update news
    public void updateNews(String title, String description, String type){
        this.title = title;
        this.description = description;
        this.type = type;
        notifyChannel(type, description, title);
    }
        
}