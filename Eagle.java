package fr.WCS.pooQuest;

public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    @Override
	public void takeOff() {
    	if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println("I'm out of here !");
        }
    }
    
    @Override
	public int ascend(int meters){
    	if (this.flying) {
            this.altitude += meters; 
            System.out.println("I'm at " + getAltitude() +  " meters in the sky");
        }
        return this.altitude;
    }
    
    @Override
	public int descend(int meters){
    	if (this.flying) {
            this.altitude -= meters; 
            System.out.println("I'm at " + getAltitude() +  " meters in the sky");
        }
        return this.altitude;
    }
    
    @Override
	public void land(){
    	if (this.flying && this.altitude == 0) {
            this.flying = false;
            System.out.println("I'm landing boyyyssss !");
        }else {
        	System.out.println("I'm too high to land, wait a second !");
        }
    }
    
    @Override
	public void glide() {
    	System.out.println("They see me gliding");
	}
}
