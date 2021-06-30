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
public class JobSelesaiRequest extends StringRequest {
    //Variabel dan URL yang digunakan
    private static final String URLInvoice = "http://10.0.2.2:8080/invoice/InvoiceStatus/";
    private Map<String, String> params;

    /**
     * Konstruktur kelas dengan parameter id invoice
     * @param id
     * @param listener
     */
    public JobSelesaiRequest(String id, Response.Listener<String> listener) {
        super(Method.PUT, URLInvoice, listener, null);
        params = new HashMap<>();
        params.put("id", id);
        params.put("invoiceStatus", "Finished");
    }

    
    /** 
     * Mendapatkan parameter
     * @return Map<String, String>
     * @throws AuthFailureError
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return this.params;
    }
}

