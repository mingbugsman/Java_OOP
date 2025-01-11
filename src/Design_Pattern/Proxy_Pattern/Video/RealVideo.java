package Design_Pattern.Proxy_Pattern.Video;

public class RealVideo implements Video {
    private String videoUrl;

    public RealVideo(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public void play() {
        System.out.println("Playing video from URL : "  + videoUrl);
    }

    @Override
    public void load() {
        System.out.println("Loading video from server :" + videoUrl);
    }
}
