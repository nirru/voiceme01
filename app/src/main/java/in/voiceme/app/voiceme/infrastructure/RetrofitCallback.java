package in.voiceme.app.voiceme.infrastructure;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Harish on 8/2/2016.
 */
public class RetrofitCallback<T extends ServiceResponse> implements Callback<T> {
    private static final String TAG = "RetrofitCallback";

    protected final Class<T> resultType;

    public RetrofitCallback(Class<T> resultType) {
        this.resultType = resultType;
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {

    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {

    }
}
