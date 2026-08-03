package Task;
class media{
	void play() {
		System.out.println("Class method");
	}
}
class MP4_video extends media{
	void play() {
		System.out.println("MP4 Video Playing");
	}
}
class MP3_audio extends media{
	void play() {
		System.out.println("MP3 audio Playing");
	}
}
class Live_streams extends media{
	void play() {
		System.out.println("Live Streaming");
	}
}
public class OVR_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       media obj1 = new MP4_video();    
       obj1.play();
       
       media obj2 = new MP3_audio();    
       obj2.play();
       
       media obj3 = new Live_streams();    
       obj3.play();
	}

}
