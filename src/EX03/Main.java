package EX03;

public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng của AudioPlayer và VideoPlayer
        Playable audio=new AudioPlayer();
        Playable video=new VideoPlayer();
        // Gọi phương thức play() và kiểm tra kết quả
        audio.play();
        video.play();
    }
}
