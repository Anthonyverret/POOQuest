public class Wilder {


    private String firstname;
    private boolean aware = false;

    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

    //méthode
    public String whoAmI(String firstname, boolean aware) {
        if(aware==true){
            return "Je m'appelle " + firstname + " et je suis aware";
        }else{
            return "Je m'appelle " + firstname + " et je ne suis pas aware";
        }
        
    }

    public static void main(String[] args) {

        
    }

    //getters
    public String getFirstname() {
        return this.firstname;
    }
    
    public boolean getAware() {
        return this.aware;
    }

    //setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setAware(boolean aware) {
        this.aware = aware;
    }
}