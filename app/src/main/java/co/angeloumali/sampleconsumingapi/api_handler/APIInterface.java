package co.angeloumali.sampleconsumingapi.api_handler;

import java.util.List;

import co.angeloumali.sampleconsumingapi.model.Base;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {
    String LOCAL_API_CONN = "http://192.168.1.16:8100/";

    @GET("industry")
    Call<List<Base>> getBase();

    @POST("post_test")
    @FormUrlEncoded
    Call<Base> submitBase(@Field("base") String base);
}
