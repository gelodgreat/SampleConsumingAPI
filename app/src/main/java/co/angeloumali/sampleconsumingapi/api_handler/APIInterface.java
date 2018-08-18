package co.angeloumali.sampleconsumingapi.api_handler;

import com.google.gson.JsonObject;

import java.util.List;

import co.angeloumali.sampleconsumingapi.model.Base;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIInterface {
    String LOCAL_API_CONN = "http://192.168.1.16:8100/";

    @GET("industry")
    Call<List<Base>> getBase();

    @POST("post_test")
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    Call<ResponseBody> submitBase(@Body JsonObject jsonObject);
}
