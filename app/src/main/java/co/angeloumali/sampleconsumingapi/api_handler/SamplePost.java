package co.angeloumali.sampleconsumingapi.api_handler;

import android.util.Log;

import com.google.gson.JsonObject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.support.constraint.Constraints.TAG;


public class SamplePost {
    private static Retrofit retrofit;

    public static void sendPost(String base) {
        retrofit = new Retrofit.Builder()
                .baseUrl(APIInterface.LOCAL_API_CONN)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APIInterface apiInterface = retrofit.create(APIInterface.class);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("base", base);

        apiInterface.submitBase(jsonObject).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    Log.i(TAG, "onResponse: " + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");
            }
        });
    }

}
