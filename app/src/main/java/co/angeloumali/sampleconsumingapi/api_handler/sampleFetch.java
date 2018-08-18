package co.angeloumali.sampleconsumingapi.api_handler;

import android.content.Context;
import android.util.Log;

import java.util.List;

import co.angeloumali.sampleconsumingapi.model.Base;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class sampleFetch {

    private static Retrofit retrofit;

    public static void getBases() {
        retrofit = new Retrofit.Builder()
                .baseUrl(APIInterface.LOCAL_API_CONN)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APIInterface apiInterface = retrofit.create(APIInterface.class);
        Call<List<Base>> call = apiInterface.getBase();

        call.enqueue(new Callback<List<Base>>() {
            @Override
            public void onResponse(Call<List<Base>> call, Response<List<Base>> response) {
                if (response.body() != null) {

                    final List<Base> bases = response.body();
                    for (int i = 0; i < bases.size(); i++) {
                        Log.d("Bases", bases.get(i).getBase());
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Base>> call, Throwable t) {
                Log.d("ERROR", t.getMessage());
            }
        });
    }

}
