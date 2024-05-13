package oops;

public class Interfacetvremote {

	
	interface TvRemote extends SmartTvRemote{
	    void changeChannel();
	    }
	interface SmartTvRemote{
	    void speakToType();
	}
	class TV implements TvRemote{

	    @Override
	    public void changeChannel() {
	        System.out.println("channel switched");
	    }

	    @Override
	    public void speakToType(){
	        System.out.println("voice typing on");
	    }
	}
	
	
	public static void main(String[] args) {
	
		
		TvRemote samsung = new TV();
        samsung.changeChannel();

	}

}
