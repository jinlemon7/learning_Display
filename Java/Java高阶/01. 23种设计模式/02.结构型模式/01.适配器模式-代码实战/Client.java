public class Client {
    public static void main(String[] args) {
        AudioPlayer player = new DefaultAudioPlayer();
        player.play("mp3", "歌曲.mp3");
        player.play("mp4", "电影.mp4");
        player.play("vlc", "直播秀.vlc");
        player.play("avi", "老的媒体格式.avi");
    }
}