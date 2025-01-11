package Design_Pattern.Proxy_Pattern.Video;

import java.util.HashMap;
import java.util.Map;

public class VideoProxy implements Video {
    private RealVideo realVideo;
    private String videoUrl;
    private Map<String, RealVideo> videoCache = new HashMap<>();

    public VideoProxy(String videoUrl) {
        this.videoUrl = videoUrl;
    }


    @Override
    public void play() {
        if (videoCache.containsKey(videoUrl)) {
            // if video is cached, play it from the cache
            System.out.println("Playing cached video : " + videoUrl);
            videoCache.get(videoUrl).play();
        } else {
            // otherwise, load theo video from the real server
            load();
            realVideo.play();
            videoCache.put(videoUrl, realVideo);
        }
    }

    @Override
    public void load() {
        if (realVideo == null) {
            System.out.println("Loading video from server: " + videoUrl);
            realVideo = new RealVideo(videoUrl);
        }
    }
}
