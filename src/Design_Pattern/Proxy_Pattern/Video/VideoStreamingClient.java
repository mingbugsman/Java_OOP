package Design_Pattern.Proxy_Pattern.Video;

public class VideoStreamingClient {
    public static void main(String[] args) {
        // Client requests for video
        Video video1 = new VideoProxy("https://video-server.com/video1.mp4");
        video1.play();  // First time, video will be loaded from the server

        video1.play();  // Second time, video will be played from the cache

        // Client requests for another video
        Video video3 = new VideoProxy("https://video-server.com/video2.mp4");
        video3.play();  // Video will be loaded from the server
    }
}
