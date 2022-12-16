package TaksiOtobussikayetprogrami;

import java.util.HashMap;
import java.util.Map;

// Şikayetleri saklayan sınıf
public class ComplaintManager {
    // Şikayetleri saklayan harita (anahtar: şoför adı, değer: şikayet nesnesi)
    private Map<String, Complaint> complaints;

    public ComplaintManager() {
        complaints = new HashMap<>();
    }

    // Yeni bir şikayet ekler
    public void addComplaint(Complaint complaint) {
        complaints.put(complaint.getDriverName(), complaint);
    }

    // Belirtilen şoför adına sahip bir şikayeti döndürür
// Eğer böyle bir şikayet yok
    public Complaint getComplaint(String driverName) {
        return complaints.get(driverName);
    }
}
