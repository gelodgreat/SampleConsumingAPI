package co.angeloumali.sampleconsumingapi.api_handler;

import java.util.List;

import co.angeloumali.sampleconsumingapi.model.Base;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    String LOCAL_API_CONN = "http://192.168.1.16:8100/";

    @GET("industry")
    Call<List<Base>> getBase();
}
