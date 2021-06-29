package aurelliofishandy.jwork_android;

public class Job {

    //Variabel yang digunakan pada class
    private int id,fee;
    private String name;
    private Recruiter recruiter;
    private String category;


     /**
     * Konstruktur untuk class Job
     * @param id
     * @param name
     * @param recruiter
     * @param fee
     * @param category
     */
    public Job(int id,String name,Recruiter recruiter, int fee,
               String category)
    {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;

    }
    
    /** 
     * Mendapatkan Id Job
     * @return int
     */
    public int getId()
    {
        return this.id;
    }

    
    /** 
     * Mendapatkan Name Job
     * @return String
     */
    public String getName(){
        return this.name;
    }

    
    /** 
     * Mendapatkan Recruiter Job
     * @return Recruiter
     */
    public Recruiter getRecruiter(){
        return this.recruiter;
    }

    
    /** 
     * Mendapatkan fee Job
     * @return int
     */
    public int getFee(){
        return this.fee;
    }

    
    /** 
     * Mendapatkan Category Job
     * @return String
     */
    public String getCategory(){
        return this.category;
    }

    
    /** 
     * Menentukan Id Job
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }

    
    /** 
     * Menentukan nama Job
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    
    /** 
     * Menentukan recruiter Job
     * @param recruiter
     */
    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }

    
    /** 
     * Menentukan fee Job
     * @param fee
     */
    public void setFee(int fee){
        this.fee = fee;
    }

    
    /** 
     * Menentukan category Job
     * @param category
     */
    public void setCategory(String category){
        this.category = category;
    }
}
