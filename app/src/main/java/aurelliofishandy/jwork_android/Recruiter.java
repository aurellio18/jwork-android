package aurelliofishandy.jwork_android;

public class Recruiter {
    //Variabel yang digunakan pada class
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Konstruktur untuk class Recruiter
     * @param id
     * @param name
     * @param email
     * @param phoneNumber
     * @param location
     */
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
     * Mendapatkan Id Recruiter
     * @return int
     */
    public int getId(){
        return this.id;
    }

    
    /** 
     * Mendapatkan name Recruiter
     * @return String
     */
    public String getName(){
        return this.name;
    }

    
    /** 
     * Mendapatkan email Recruiter
     * @return String
     */
    public String getEmail(){
        return this.email;
    }

    
    /** 
     * Mendapatkan nomor telepon Recruiter
     * @return String
     */
    public String getphoneNumber(){
        return this.phoneNumber;
    }

    
    /**
     * Mendapatkan Lokasi Recruiter 
     * @return Location
     */
    public Location getLocation(){
        return this.location;
    }

    
    /** 
     * Menentukan Id Recruiter
     * @param id
     */
    public void setId(int id){
        this.id = id;

    }

    
    /** 
     * Menentukan nama Recruiter
     * @param name
     */
    public void setName(String name){
        this.name = name;

    }

    
    /**
     * Menentukan email Recruiter 
     * @param email
     */
    public void setEmail(String email){
        this.email = email;

    }

    
    /** 
     * Menentukan nomor telepon Recruiter
     * @param phoneNumber
     */
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    
    /** 
     * Menentukan lokasi Recruiter
     * @param location
     */
    public void setLocation(Location location){
        this.location = location;
    }

}
