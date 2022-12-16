package TaksiOtobussikayetprogrami;

import java.util.Scanner;

// Kullanıcıdan alınan verilerle taksi ve otobüs şoförlerini
// şikayet edebileceğimiz bir mobil uygulama
public class ComplaintApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComplaintManager manager = new ComplaintManager();

        // Kullanıcıdan girdi alınır ve işlenir
        while (true) {
            System.out.println("1. Şikayet Ekle");
            System.out.println("2. Şikayet Al");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            // Kullanıcı yeni bir şikayet eklemek istediğinde
            if (secim == 1) {
                System.out.print("Şoför adını girin: ");
                String driverName = scanner.nextLine();
                System.out.print("Araç türünü girin (Taksi/Otobüs): ");
                String vehicleType = scanner.nextLine();
                System.out.print("Şikayet türünü girin: ");
                String complaintType = scanner.nextLine();
                System.out.print("Açıklama girin: ");
                String description = scanner.nextLine();

                // Yeni bir şikayet nesnesi oluşturulur ve eklenir
                Complaint complaint = new Complaint(driverName, vehicleType, complaintType, description);
                manager.addComplaint(complaint);
                System.out.println("Şikayet başarıyla eklendi!");
            }
            // Kullanıcı mevcut bir şikayeti almak istediğinde
            else if (secim == 2) {
                System.out.print("Şoför adını girin: ");
                String driverName = scanner.next();

                // Şikayet alınır
                Complaint complaint = manager.getComplaint(driverName);
                if (complaint == null) {
                    System.out.println("Belirtilen şoför için şikayet bulunamadı.");
                } else {
                    System.out.println("Şoför Adı: " + complaint.getDriverName());
                    System.out.println("Araç Türü: " + complaint.getVehicleType());
                    System.out.println("Şikayet Türü: " + complaint.getComplaintType());
                    System.out.println("Açıklama: " + complaint.getDescription());
                }
            }
            // Kullanıcı çıkış yaptığında
            else if (secim == 3) {
                break;
            }
            // Geçersiz bir seçim yapıldığında
            else {
                System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }

        scanner.close();
    }
}
