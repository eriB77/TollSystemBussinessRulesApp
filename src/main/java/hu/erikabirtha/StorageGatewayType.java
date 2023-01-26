package hu.erikabirtha;

public interface StorageGatewayType {
    //adja vissza a vignetták listáját load, save vignetta sting regnumber
    //delete
    //save vagy uj vagy felülír
    void saveVignetteToStorage();
    VignetteEntity loadVignetteFromStorage(String registerNumber);


}
