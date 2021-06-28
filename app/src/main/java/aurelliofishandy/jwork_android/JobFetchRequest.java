package aurelliofishandy.jwork_android;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class JobFetchRequest extends StringRequest {
    //Variabel yang digunakan
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