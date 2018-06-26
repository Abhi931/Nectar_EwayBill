
package ewaybill.nectar.com.ewaybill.jsonModelResponses.userregistration;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserClientRegistrationResponse implements Parcelable
{


    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("client_GSTIN")
    @Expose
    private String gstin;
    @SerializedName("client_name")
    @Expose
    private String name;
    @SerializedName("client_contactno")
    @Expose
    private String mobileno;
    @SerializedName("client_emailid")
    @Expose
    private String email;
    @SerializedName("client_user_type")
    @Expose
    private String usertype;
    @SerializedName("client_address")
    @Expose
    private String place;
    @SerializedName("client_pincode")
    @Expose
    private String pincode;
    @SerializedName("client_state")
    @Expose
    private String state;


    public final static Creator<UserClientRegistrationResponse> CREATOR = new Creator<UserClientRegistrationResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public UserClientRegistrationResponse createFromParcel(Parcel in) {
            return new UserClientRegistrationResponse(in);
        }

        public UserClientRegistrationResponse[] newArray(int size) {
            return (new UserClientRegistrationResponse[size]);
        }

    }
    ;

    protected UserClientRegistrationResponse(Parcel in) {
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.msg = ((String) in.readValue((String.class.getClassLoader())));
        this.userId = ((String) in.readValue((String.class.getClassLoader())));
        this.gstin = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.mobileno = ((String) in.readValue((String.class.getClassLoader())));
        this.email = ((String) in.readValue((String.class.getClassLoader())));
        this.usertype = ((String) in.readValue((String.class.getClassLoader())));
        this.place = ((String) in.readValue((String.class.getClassLoader())));
        this.pincode = ((String) in.readValue((String.class.getClassLoader())));
        this.state = ((String) in.readValue((String.class.getClassLoader())));
    }

    public UserClientRegistrationResponse() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(msg);
        dest.writeValue(userId);
        dest.writeValue(gstin);
        dest.writeValue(name);
        dest.writeValue(mobileno);
        dest.writeValue(email);
        dest.writeValue(usertype);
        dest.writeValue(place);
        dest.writeValue(pincode);
        dest.writeValue(state);
    }

    public int describeContents() {
        return  0;
    }

}
