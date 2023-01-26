package hu.erikabirtha;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

public class ParseJsonVignetteEntity {

    public VignetteEntity parseJsonToVechiceObject(String jsonToObject) {
        VignetteEntity vignetteEntity = new VignetteEntity("","",
                "",0, new Date(), new Date(), new Date());
        try {
            JSONObject jsonObject = new JSONObject(jsonToObject);
            vignetteEntity.setRegistrationNumber(jsonObject.getString("registrationNumber"));
            vignetteEntity.setVehicleCategory(jsonObject.getString("vehicleCategory"));
            vignetteEntity.setMotorwayVignetteType(jsonObject.getString("motorwayVignetteType"));
            vignetteEntity.setPrice(Integer.valueOf(jsonObject.getString("price")));
            vignetteEntity.setValidFrom();
            vignetteEntity.setValidTo();
            vignetteEntity.setDateOfPurchase();
        } catch (JSONException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vignetteEntity;
    }
}
