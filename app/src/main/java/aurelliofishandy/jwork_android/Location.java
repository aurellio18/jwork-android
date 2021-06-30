package aurelliofishandy.jwork_android;
/**
 * @author (Aurellio Fishandy)
 * @version (Modul 2 - 29-Jun-2021)
 */
public class Location {
    //Variabel yang digunakan
    private String province;
    private String description;
    private String city;

     /**
     * Konstruktur untuk class Location
     * @param province
     * @param city
     * @param description
     */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;

    }
    
    /** 
     * Mendapatkan provinsi
     * @return String
     */
    public String getProvince(){
        return this.province;
    }

    
    /** 
     * Mendapatkan kota
     * @return String
     */
    public String getCity(){
        return this.city;
    }

    
    /** 
     * Mendapatkan deskripsi lokasi
     * @return String
     */
    public String getDescription(){
        return this.description;
    }

    
    /** 
     * menentukan provinsi
     * @param province
     */
    public void setProvince(String province){
        this.province = province;
    }

    
    /** 
     * menentukan kota
     * @param city
     */
    public void setCity(String city){
        this.city = city;
    }

    
    /** 
     * menentukan deskripsi lokasi
     * @param description
     */
    public void setDescription(String description){
        this.description = description;

    }


}
