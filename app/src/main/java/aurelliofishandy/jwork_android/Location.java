package aurelliofishandy.jwork_android;

public class Location {
    private String province;
    private String description;
    private String city;

    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;

    }
    
    /** 
     * @return String
     */
    public String getProvince(){
        return this.province;
    }

    
    /** 
     * @return String
     */
    public String getCity(){
        return this.city;
    }

    
    /** 
     * @return String
     */
    public String getDescription(){
        return this.description;
    }

    
    /** 
     * @param province
     */
    public void setProvince(String province){
        this.province = province;
    }

    
    /** 
     * @param city
     */
    public void setCity(String city){
        this.city = city;
    }

    
    /** 
     * @param description
     */
    public void setDescription(String description){
        this.description = description;

    }


}
