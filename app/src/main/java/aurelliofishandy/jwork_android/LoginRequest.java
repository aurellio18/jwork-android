package aurelliofishandy.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    //Variabel dan URL yang digunakan
    private static final String URL = "http://10.0.2.2:8080/jobseeker/login";
    private Map<String, String> params;

    /**
     * Menaruh email dan password yang sudah dimiliki agar dapat masuk kedalam main activity
     * @param email
     * @param password
     * @param listener
     */
    public LoginRequest (String email, String password, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
    }

    
    /** 
     * Mendapatkan parameter
     * @return Map<String, String>
     * @throws AuthFailureError
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}