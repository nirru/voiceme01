package in.voiceme.app.voiceme.infrastructure;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.HashMap;

/**
 * Created by Harish on 7/25/2016.
 */
public abstract class ServiceResponse {
    private static final String TAG = "ServiceResponse";

    private String operationError;
    private HashMap<String, String> propertyErrors;
    private boolean isCritical;

    public ServiceResponse (){
        propertyErrors = new HashMap<>();
    }

    public ServiceResponse(String operationError){
        this.operationError = operationError;
    }

    public ServiceResponse(String operationError, boolean isCritical){
        this.operationError = operationError;
        this.isCritical = isCritical;
    }


    /* Getters and Setters for Operation Error  */
    public String getOperationError(){
        return operationError;
    }

    public void setOperationError(String operationError) {
        this.operationError = operationError;
    }

    public boolean isCritical() {
        return isCritical;
    }

    public void setIsCritical(boolean isCritical) {
        this.isCritical = isCritical;
    }

    /* Getters and Setters for Property Error*/

    public void setPropertyError(String property, String error) {
        propertyErrors.put(property, error);
    }

    public String getPropertyError(String property) {
        return propertyErrors.get(property);
    }

    /* Convenience method */
    public boolean didSucceed() {
        return (operationError == null || operationError.isEmpty()) && (propertyErrors.size() == 0);
    }

    public void showErrorToast(Context context) {
        if (context == null || operationError == null || operationError.isEmpty())
            return;

        try {
            Toast.makeText(context, operationError, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Log.e(TAG, "Can't create error toast", e);
        }
    }

}
