package hu.erikabirtha;

import org.json.JSONException;
import org.json.JSONObject;

public class InteractorTollSystem implements VignetteAPI {

    public DisplayTollSystem presenterApi;
    public StorageGatewayType storageGatewayType;

    public InteractorTollSystem(DisplayTollSystem presenterApi, StorageGatewayType storageGatewayType) {
        this.presenterApi = presenterApi;
        this.storageGatewayType = storageGatewayType;
    }

    @Override
    public void findVehicleByRegistrationNumber(String jsonObject) {

        System.out.println(jsonObject + " interctorTollSystem");
        storageGatewayType.loadVignetteFromStorage("AA-BB-123" );
    }

    public String parseVehicleToJsonSendStorage(VignetteEntity vignetteEntity) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("registrationNumber", registrationNumber);
            jsonObject.put("vehicleCategory", vehicleCategory);
            jsonObject.put("motorwayVignetteType", motorwayVignetteType);
            jsonObject.put("price", price);
            jsonObject.put("validFrom", validFrom);
            jsonObject.put("validTo", validTo);
            jsonObject.put("dateOfPurchase", dateOfPurchase);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return jsonObject.toString();

    }

    public void registerToStorage() {
     ParseJsonVignetteEntity parseJsonVignetteEntity = new ParseJsonVignetteEntity();
     //StorageGatewayType
    }

//Visszaparse, kiszedni a rendszám, beküldeni a storageba és adja vissza a vinettákat
    //system printli, presenter bekötése
    //save, load, függvények
}
