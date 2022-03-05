import java.util.ArrayList;
import java.util.List;

public class Agency{
    private List<Channel> channels = new ArrayList<>();
    private String title;

    public void register(Channel channel){
        channels.add(channel);
    }

    public void unRegister(Channel channel){
        channels.remove(channel);
    }

    public void notifyChannel(){
        for (Channel channel: channels){
            channel.update();
        }
    }

    public void updateNews(String title){
        this.title = title;
        notifyChannel();
    }
        
}