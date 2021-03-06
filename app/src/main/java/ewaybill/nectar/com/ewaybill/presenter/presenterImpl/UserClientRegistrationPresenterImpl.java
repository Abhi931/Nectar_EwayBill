package ewaybill.nectar.com.ewaybill.presenter.presenterImpl;

import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import ewaybill.nectar.com.ewaybill.interactor.ApiInteractor;
import ewaybill.nectar.com.ewaybill.interactor.Interactor;
import ewaybill.nectar.com.ewaybill.interactor.interactorImpl.UserClientRegistrationInteractorImpl;
import ewaybill.nectar.com.ewaybill.jsonModelResponses.userregistration.UserClientRegistrationResponse;
import ewaybill.nectar.com.ewaybill.presenter.Presenter;
import ewaybill.nectar.com.ewaybill.viewstate.UserClientRegistrationView;

public class UserClientRegistrationPresenterImpl implements Presenter,ApiInteractor {

    private static final String TAG = UserClientRegistrationPresenterImpl.class.getSimpleName();
    private final UserClientRegistrationView mView;
    private Interactor mUserClientRegistrationInteractor;

    public UserClientRegistrationPresenterImpl(UserClientRegistrationView view) {
        this.mView = view;
        mUserClientRegistrationInteractor = new UserClientRegistrationInteractorImpl();
    }


    @Override
    public void callApi(Object... args) {
        mUserClientRegistrationInteractor.callApi(this,args);
    }


    @Override
    public void onSuccess(JsonObject json) {

        try {
            if (!TextUtils.isEmpty(json.toString())) {

                UserClientRegistrationResponse userRegistrationResponse = new Gson().fromJson(json, UserClientRegistrationResponse.class);

                if (userRegistrationResponse != null && userRegistrationResponse.getStatus().equalsIgnoreCase("1")) {
                    mView.onUserClientRegistrationSuccess(userRegistrationResponse);
                    return;
                }else {
                    mView.onUserClientRegistrationFailure(userRegistrationResponse.getMsg());
                    return;
                }
            }
        } catch (Exception e) {
            Log.d(TAG, e.getMessage().toString());
        }
    }

    @Override
    public void onFailure(String value) {
        mView.onUserClientRegistrationFailure("");
    }
}
