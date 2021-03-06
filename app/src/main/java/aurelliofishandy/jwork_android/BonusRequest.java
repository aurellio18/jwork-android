package aurelliofishandy.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
/**
 * @author (Aurellio Fishandy)
 * @version (Modul 2 - 29-Jun-2021)
 */

public class BonusRequest extends StringRequest {
    //Variabel dan URL yang digunakan
    private static final String URL = "http://10.0.2.2:8080/bonus/";
    private Map<String, String> params;

    /**
     * Konstruktur kelas dengan parameter referral code
     * @param referralCode
     * @param listener
     */
    public BonusRequest(String referralCode, Response.Listener<String> listener) {
        super(Method.GET, URL+referralCode, listener, null);
        params = new HashMap<>();
    }

    
    /** 
     * Mengambil parameter yang digunakan
     * @return Map<String, String>
     * @throws AuthFailureError
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }}

