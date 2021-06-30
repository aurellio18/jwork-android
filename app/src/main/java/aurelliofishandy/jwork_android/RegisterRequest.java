package aurelliofishandy.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    //Variabel dan URL yang digunakan
    private static final  String URL = "http://10.0.2.2:8080/jobseeker/register";
    private Map<String, String> params;

    /**
     * Merespon request dari register activity untuk mengakses register jobseeker
     * @param listener
     */
    public RegisterRequest(String name, String email, String password,
                           Response.Listener<String> listener, Response.ErrorListener errorListener){
        super (Method.POST, URL, listener, errorListener);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email", email);
        params.put("password", password);
    }

    
    /** 
     * error handling
     * @return Map<String, String>
     * @throws AuthFailureError
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError{
        return params;
    }
}
