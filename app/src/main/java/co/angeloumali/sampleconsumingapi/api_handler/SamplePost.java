package co.angeloumali.sampleconsumingapi.api_handler;

import android.util.Log;

import co.angeloumali.sampleconsumingapi.model.Base;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static android.support.constraint.Constraints.TAG;


public class SamplePost {
    private static Retrofit retrofit;

    public static void sendPost(String base) {
        retrofit = new Retrofit.Builder()
                .baseUrl(APIInterface.LOCAL_API_CONN)
                .build();
        APIInterface apiInterface = retrofit.create(APIInterface.class);
        apiInterface.submitBase(base).enqueue(new Callback<Base>() {
            @Override
            public void onResponse(Call<Base> call, Response<Base> response) {
                if (response.isSuccessful()) {
                    Log.i(TAG, "onResponse: " + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<Base> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");
            }
        });
    }

}
