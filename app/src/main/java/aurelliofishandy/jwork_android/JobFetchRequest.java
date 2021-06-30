package aurelliofishandy.jwork_android;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
/**
 * @author (Aurellio Fishandy)
 * @version (Modul 2 - 29-Jun-2021)
 */
public class JobFetchRequest extends StringRequest {
    //Variabel dan URL yang digunakan
    private static final String URLJobseeker = "http://10.0.2.2:8080/invoice/jobseeker/";
    private Map<String, String> params;

    /**
     * Konstruktur kelas dengan parameter id jobseeker
     * @param jobseekerId
     * @param listener
     */
    public JobFetchRequest(String jobseekerId, Response.Listener<String> listener) {
        super(Method.GET, URLJobseeker+jobseekerId, listener, null);
        params = new HashMap<>();
    }

}