package aurelliofishandy.jwork_android;

public class Job {

    private int id,fee;
    private String name;
    private Recruiter recruiter;
    private String category;

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
     * @return int
     */
    public int getId()
    {
        return this.id;
    }

    
    /** 
     * @return String
     */
    public String getName(){
        return this.name;
    }

    
    /** 
     * @return Recruiter
     */
    public Recruiter getRecruiter(){
        return this.recruiter;
    }

    
    /** 
     * @return int
     */
    public int getFee(){
        return this.fee;
    }

    
    /** 
     * @return String
     */
    public String getCategory(){
        return this.category;
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
     * @param recruiter
     */
    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }

    
    /** 
     * @param fee
     */
    public void setFee(int fee){
        this.fee = fee;
    }

    
    /** 
     * @param category
     */
    public void setCategory(String category){
        this.category = category;
    }
}
