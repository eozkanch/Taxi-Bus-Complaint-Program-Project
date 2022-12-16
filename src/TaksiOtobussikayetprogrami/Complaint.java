package TaksiOtobussikayetprogrami;

// Kullanıcıdan alınan verilerle taksi ve otobüs şoförlerini
// şikayet edebileceğimiz bir mobil uygulama
public class Complaint
{
    // Şoförün adı
    private String driverName;
    // Araç türü (taksi veya otobüs)
    private String vehicleType;
    // Şikayet türü (rütbe, yüksek fiyat, kötü davranış vb.)
    private String complaintType;
    // Şikayet açıklaması
    private String description;

    public Complaint(String driverName, String vehicleType, String complaintType, String description)
    {
        this.driverName = driverName;
        this.vehicleType = vehicleType;
        this.complaintType = complaintType;
        this.description = description;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public String getVehicle()
    {
        return vehicleType;
    }

    public String getVehicleType()
{
    return vehicleType;
}

    public String getComplaintType()
    {
        return complaintType;
    }

    public String getDescription()
    {
        return description;
    }
}

