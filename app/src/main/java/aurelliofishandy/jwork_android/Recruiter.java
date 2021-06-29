package aurelliofishandy.jwork_android;

public class Recruiter {

    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    public Recruiter(int id, String name, String email, String phoneNumber,
                     Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    
    /** 
     * @return int
     */
    public int getId(){
        return this.id;
    }

    
    /** 
     * @return String
     */
    public String getName(){
        return this.name;
    }

    
    /** 
     * @return String
     */
    public String getEmail(){
        return this.email;
    }

    
    /** 
     * @return String
     */
    public String getphoneNumber(){
        return this.phoneNumber;
    }

    
    /** 
     * @return Location
     */
    public Location getLocation(){
        return this.location;
    }

    
    /** 
     * @param id
     */
    public void setId(int id){
        this.id = id;

    }

    
    /** 
     * @param name
     */
    public void setName(String name){
        this.name = name;

    }

    
    /** 
     * @param email
     */
    public void setEmail(String email){
        this.email = email;

    }

    
    /** 
     * @param phoneNumber
     */
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    
    /** 
     * @param location
     */
    public void setLocation(Location location){
        this.location = location;
    }

}
