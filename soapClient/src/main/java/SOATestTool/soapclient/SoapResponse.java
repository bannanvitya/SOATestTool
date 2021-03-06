package SOATestTool.soapclient;

import SOATestTool.api.Response;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by VKHozhaynov on 03.02.2015.
 */
public class SoapResponse implements Response, Serializable {
    private String message;

    public SoapResponse(String mess){
        message = mess;
    }

    @Override
    public byte[] raw() {
        return null;
    }

    @Override
    public Object responseImpl() {
        return null;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getStatus() {
        return "not supported";
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Map<String, String> asDict() {
        return null;
    }
}
