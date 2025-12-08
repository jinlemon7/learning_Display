public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放VLC格式的文件: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 什么也不做
    }
}