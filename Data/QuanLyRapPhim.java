import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class QuanLyRapPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        QuanLyRapPhim app = new QuanLyRapPhim();
        app.run();
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
   

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            clearScreen();
            showMenu();
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.println("=== Quản lý phim ===");
                    System.out.println("1.Thêm phim mới");
                    System.out.println("2.Sửa thông tin phim");
                    System.out.println("3.Xóa phim");
                    System.out.println("4.Danh sách phim");
                    System.out.println("0.Trở về menu chính");
                    System.out.print("Chọn chức năng: ");
                    int qlp = scanner.nextInt();
                    scanner.nextLine();

                    clearScreen();

                    switch (qlp) {
                        case 1:
                            themphimmoi();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 2:
                            suaThongTinPhim();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 3:
                            xoaPhim();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 4:
                            danhSachPhim();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 0:
                            System.out.println("Trở về menu chính");
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;

                case 2:
                    clearScreen();
                    System.out.println("=== Quản lý phòng chiếu ===");
                    System.out.println("1.Thêm phòng chiếu mới");
                    System.out.println("2.Sửa thông tin phòng chiếu");
                    System.out.println("3.Xóa phòng chiếu");
                    System.out.println("4.Danh sách phòng chiếu");
                    System.out.println("5.Tạo sơ đồ cho phòng chiếu");
                    System.out.println("6.Sơ đồ phòng chiếu");
                    System.out.println("0.Trở về menu chính");
                    System.out.print("Chọn chức năng: ");
                    int qlpc = scanner.nextInt();
                    scanner.nextLine();

                    clearScreen();

                    switch (qlpc) {
                        case 1:
                            themPhongChieu();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 2:
                            suaThongTinPhongChieu();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 3:
                            xoaPhongChieu();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 4:
                            danhSachPhongChieu();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 5:
                            taoSoDoPhongChieu();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 6:
                            soDoPhongChieu();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 0:
                            System.out.println("Trở về menu chính");
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;
                case 3:
                    clearScreen();
                    System.out.println("=== Quản lý suất chiếu ===");
                    System.out.println("1. Thêm suất chiếu");
                    System.out.println("2. Sửa suất chiếu");
                    System.out.println("3. Xóa suất chiếu");
                    System.out.println("4. Danh sách suất chiếu");
                    System.out.println("0. Trở về menu chính");
                    System.out.print("Chọn chức năng: ");
                    int qlsc = scanner.nextInt();
                    scanner.nextLine();

                    clearScreen();

                    switch (qlsc) {
                        case 1:
                            themSuatChieu();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 2:
                            suaThongTinSuatChieu();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 3:
                            xoaSuatChieu();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 4:
                            danhSachSuatChieu();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 0:
                            System.out.println("Trở về menu chính");
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;
                case 4:
                    clearScreen();
                    System.out.println("=== Đặt vé ===");
                    System.out.println("1. Đặt vé");
                    System.out.println("2. Hủy vé");
                    System.out.println("0. Trở về menu chính");
                    System.out.print("Chọn chức năng: ");
                    int qldv = scanner.nextInt();
                    scanner.nextLine();
                    clearScreen();
                    switch (qldv) {
                        case 1:
                            datVe();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 2:
                            huyVe();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 0:
                            System.out.println("Trở về menu chính");
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;
                case 5:
                    clearScreen();
                    System.out.println("=== HÓA ĐƠN THANH TOÁN ===");
                    System.out.println("1. Thống kê hóa đơn dựa trên khách hàng");
                    System.out.println("2. Xem hóa đơn");
                    System.out.println("3. Cập nhập danh sách khách hàng");
                    System.out.println("4. Danh sách khách hàng");
                    System.out.println("0. Trở về menu chính");
                    System.out.print("Chọn chức năng: ");
                    int qlhd = scanner.nextInt();
                    scanner.nextLine();
                    clearScreen();
                    switch (qlhd) {
                        case 1:
                            thongKeHoaDonTheoKhachHang();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 2:
                            xemHoaDon();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 3:
                            capNhatDanhSachKhachHang();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 4:
                            hienThiDanhSachKhachHang();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 0:
                            System.out.println("Trở về menu chính");
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;

                case 6:
                    clearScreen();
                    System.out.println("=== Báo cáo thống kê ===");
                    System.out.println("1. Thống kê doanh thu theo ngày");
                    System.out.println("2. Thống kê doanh thu theo tháng");
                    System.out.println("3. Danh sách vé bán ra theo phim");
                    System.out.println("4. Top 3 phim có doanh thu cao nhất");
                    System.out.println("0. Trở về menu chính");
                    System.out.print("Chọn chức năng: ");
                    int rpt = scanner.nextInt();
                    scanner.nextLine();
                    clearScreen();
                    switch (rpt) {
                        case 1:
                            System.out.print("Nhập ngày (yyyy-MM-dd): ");
                            String ngay = scanner.nextLine();
                            doanhThuTheoNgay(ngay);
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 2:
                            System.out.print("Nhập tháng (yyyy-MM): ");
                            String month = scanner.nextLine();
                            doanhThuTheoThang(month);
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 3:
                            danhSachVeBanRaTheoPhim();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 4:
                            top3PhimBanChay();
                            System.out.print("Nhấn Enter để tiếp tục...");
                            scanner.nextLine();
                            break;
                        case 0:
                            System.out.println("Trở về menu chính");
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private void showMenu() {
        System.out.println("=== QUẢN LÝ RẠP PHIM ===");
        System.out.println("1. Quản lý phim");
        System.out.println("2. Quản lý phòng chiếu");
        System.out.println("3. Quản lý suất chiếu");
        System.out.println("4. Đặt vé");
        System.out.println("5. Hóa Đơn Thanh Toán");
        System.out.println("6. Báo cáo thống kê");
        System.out.println("0. Thoát");
    }

    public List<Ticket> readTicketsCSV() {
        List<Ticket> tickets = new ArrayList<>();
        File file = new File("tickets.csv");
        if (!file.exists()) return tickets;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine(); // bỏ header
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",");
                // giả sử cấu trúc tickets.csv: MovieID,MovieName,RoomID,RoomName,RoomType,Date,Time,Seat,Price,CustomerID,CustomerName,Phone
                if (parts.length < 12) continue;

                String customerId   = parts[9].trim();
                String customerName = parts[10].trim();
                String phone        = parts[11].trim();
                String seatCode     = parts[7].trim();
                String movieName    = parts[1].trim();

                tickets.add(new Ticket(customerId, customerName, phone, seatCode, movieName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tickets;
}

    private void ghiCSV(List<Movie> movies) {
        File file = new File(System.getProperty("user.dir") + "\\movies.csv");
        try (PrintWriter pw = new PrintWriter(file, "UTF-8")) {
            for (Movie m : movies) {
                pw.println(String.join(",", m.id, m.name, m.genre, m.duration, m.age, m.price));
            }
        } catch (Exception e) {
            System.out.println("Lỗi ghi CSV: " + e.getMessage());
        }
    }

    public void saveInvoice(Invoice invoice) {
        File file = new File("invoices.csv");
        boolean exists = file.exists();

        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file, true), true)) {
            if (!exists) {
                pw.println("InvoiceID,CustomerName,TicketCount,Total,Date,ShowMonth");
            }

            pw.printf("%s,%s,%d,%.0f,%s,%s%n",
                    invoice.invoiceId,
                    invoice.customerName,
                    invoice.ticketCount,
                    invoice.total,
                    invoice.date,
                    invoice.showMonth
            );
        } catch (Exception e) {
            System.out.println("Lỗi lưu hóa đơn: " + e.getMessage());
        }
    }



    private void themphimmoi() {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.print("Nhập Mã phim: ");
    String id = scanner.nextLine();
    System.out.print("Nhập Tên phim: ");
    String name = scanner.nextLine();
    System.out.print("Nhập Thể loại: ");
    String genre = scanner.nextLine();
    System.out.print("Nhập Thời lượng: ");
    String duration = scanner.nextLine();
    System.out.print("Nhập Độ tuổi: ");
    String age = scanner.nextLine();
    System.out.print("Nhập Giá vé: ");
    String price = scanner.nextLine();

    List<Movie> movies = docCSV();
    movies.add(new Movie(id, name, genre, duration, age, price));
    ghiCSV(movies);
    System.out.println("Đã thêm phim thành công!");
}


    private void suaThongTinPhim() {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    List<Movie> movies = docCSV();
    danhSachPhim();
    System.out.print("Nhập Mã phim muốn sửa: ");
    String id = scanner.nextLine();

    boolean found = false;
    for (Movie m : movies) {
        if (m.id.equals(id)) {
            System.out.print("Tên phim mới (" + m.name + "): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) m.name = name;

            System.out.print("Thể loại mới (" + m.genre + "): ");
            String genre = scanner.nextLine();
            if (!genre.isEmpty()) m.genre = genre;

            System.out.print("Thời lượng mới (" + m.duration + "): ");
            String duration = scanner.nextLine();
            if (!duration.isEmpty()) m.duration = duration;

            System.out.print("Độ tuổi mới (" + m.age + "): ");
            String age = scanner.nextLine();
            if (!age.isEmpty()) m.age = age;

            System.out.print("Giá vé mới (" + m.price + "): ");
            String price = scanner.nextLine();
            if (!price.isEmpty()) m.price = price;

            found = true;
            break;
        }
    }

    if (found) {
        ghiCSV(movies);
        System.out.println("Đã sửa phim thành công!");
    } else {
        System.out.println("Không tìm thấy phim với Mã phim này.");
    }
}

    private void xoaPhim() {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    List<Movie> movies = docCSV();
    danhSachPhim();
    System.out.print("Nhập Mã phim muốn xóa: ");
    String id = scanner.nextLine();

    boolean removed = movies.removeIf(m -> m.id.equals(id));
    if (removed) {
        ghiCSV(movies);
        System.out.println("Đã xóa phim thành công!");
    } else {
        System.out.println("Không tìm thấy phim với Mã phim này.");
    }
}

    private List<Movie> docCSV() {
        List<Movie> movies = new ArrayList<>();
        File file = new File(System.getProperty("user.dir") + "\\movies.csv");
        if (!file.exists()) {
            System.out.println("⚠ File CSV không tồn tại!");
            return movies;
        }

        try (Scanner sc = new Scanner(file, "UTF-8")) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    movies.add(new Movie(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim(), parts[4].trim(), parts[5].trim()));
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc CSV: " + e.getMessage());
        }

        return movies;
    }

    private void danhSachPhim() {
        List<Movie> movies = docCSV();

        System.out.println("============================================== DANH SÁCH PHIM ===============================================");
        System.out.println("| %-10s | %-30s | %-15s | %-10s | %-10s | %-15s |".formatted(
                "Mã Phim", "Tên Phim", "Thể Loại", "Thời Lượng", "Độ Tuổi", "Giá Vé"));
        if (movies.isEmpty()) {
            System.out.println("Không có phim nào trong danh sách.");
            return;
        }   
        for (Movie m : movies) {
            System.out.println("| %-10s | %-30s | %-15s | %-10s | %-10s | %-15s |".formatted(
                m.id, m.name, m.genre, m.duration, m.age, m.price));
        }
    }










    private void themPhongChieu() {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        // Đọc danh sách phòng hiện tại
        List<Room> rooms = docCSVRoom();

        // Hiển thị danh sách phòng hiện tại
        System.out.println("===== DANH SÁCH PHÒNG HIỆN TẠI =====");
        if (rooms.isEmpty()) {
            System.out.println("Chưa có phòng chiếu nào.");
        } else {
            System.out.println("| %-10s | %-20s | %-10s |".formatted("Mã phòng", "Tên phòng", "Loại"));
            for (Room r : rooms) {
                System.out.println("| %-10s | %-20s | %-10s |".formatted(r.id, r.name, r.type));
            }
        }

        // Nhập thông tin phòng mới
        System.out.println("\nNhập thông tin phòng chiếu mới:");
        System.out.print("Mã phòng: ");
        String id = scanner.nextLine().trim();

        // Kiểm tra trùng mã phòng
        boolean exists = rooms.stream().anyMatch(r -> r.id.equalsIgnoreCase(id));
        if (exists) {
            System.out.println("⚠ Mã phòng đã tồn tại! Thêm thất bại.");
            return;
        }

        System.out.print("Tên phòng: ");
        String name = scanner.nextLine().trim();

        System.out.print("Loại phòng: ");
        String type = scanner.nextLine().trim();

        // Thêm phòng vào danh sách
        rooms.add(new Room(id, name, type));

        // Ghi trở lại rooms.csv
        File roomFile = new File(System.getProperty("user.dir") + "\\rooms.csv");
        try (PrintWriter pw = new PrintWriter(roomFile, "UTF-8")) {
            for (Room r : rooms) {
                pw.println(String.join(",", r.id, r.name, r.type));
            }
            System.out.println("✔ Thêm phòng chiếu thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi ghi rooms.csv: " + e.getMessage());
        }
    }

    private void suaThongTinPhongChieu() {
         Scanner scanner = new Scanner(System.in, "UTF-8");

        // Đọc danh sách phòng hiện tại
        List<Room> rooms = docCSVRoom();

        if (rooms.isEmpty()) {
            System.out.println("Chưa có phòng chiếu nào để sửa.");
            return;
        }

        // Hiển thị danh sách phòng hiện tại
        System.out.println("===== DANH SÁCH PHÒNG CHIẾU =====");
        System.out.println("| %-10s | %-20s | %-10s |".formatted("Mã phòng", "Tên phòng", "Loại"));
        for (Room r : rooms) {
            System.out.println("| %-10s | %-20s | %-10s |".formatted(r.id, r.name, r.type));
        }

        // Nhập mã phòng muốn sửa
        System.out.print("\nNhập Mã phòng muốn sửa: ");
        String id = scanner.nextLine().trim();

        // Tìm phòng theo mã
        Room roomToEdit = null;
        for (Room r : rooms) {
            if (r.id.equalsIgnoreCase(id)) {
                roomToEdit = r;
                break;
            }
        }

        if (roomToEdit == null) {
            System.out.println("⚠ Không tìm thấy phòng chiếu với Mã phòng này.");
            return;
        }

        // Nhập thông tin mới (giữ nguyên nếu để trống)
        System.out.print("Tên phòng mới (" + roomToEdit.name + "): ");
        String newName = scanner.nextLine().trim();
        if (!newName.isEmpty()) roomToEdit.name = newName;

        System.out.print("Loại phòng mới (" + roomToEdit.type + "): ");
        String newType = scanner.nextLine().trim();
        if (!newType.isEmpty()) roomToEdit.type = newType;

        // Ghi trở lại rooms.csv
        File roomFile = new File(System.getProperty("user.dir") + "\\rooms.csv");
        try (PrintWriter pw = new PrintWriter(roomFile, "UTF-8")) {
            for (Room r : rooms) {
                pw.println(String.join(",", r.id, r.name, r.type));
            }
            System.out.println("✔ Sửa thông tin phòng chiếu thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi ghi rooms.csv: " + e.getMessage());
        }

    }

    private void xoaPhongChieu() {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        // Đọc danh sách phòng hiện tại
        List<Room> rooms = docCSVRoom();

        if (rooms.isEmpty()) {
            System.out.println("Chưa có phòng chiếu nào để xóa.");
            return;
        }

        // Hiển thị danh sách phòng
        System.out.println("===== DANH SÁCH PHÒNG CHIẾU =====");
        System.out.println("| %-10s | %-20s | %-10s |".formatted("Mã phòng", "Tên phòng", "Loại"));
        for (Room r : rooms) {
            System.out.println("| %-10s | %-20s | %-10s |".formatted(r.id, r.name, r.type));
        }

        // Nhập mã phòng muốn xóa
        System.out.print("\nNhập Mã phòng muốn xóa: ");
        String roomId = scanner.nextLine().trim();

        // Xóa phòng trong danh sách
        boolean removedRoom = rooms.removeIf(r -> r.id.equalsIgnoreCase(roomId));

        if (!removedRoom) {
            System.out.println("⚠ Không tìm thấy phòng chiếu với Mã phòng này.");
            return;
        }

        // Ghi lại rooms.csv
        File roomFile = new File(System.getProperty("user.dir") + "\\rooms.csv");
        try (PrintWriter pw = new PrintWriter(roomFile, "UTF-8")) {
            for (Room r : rooms) {
                pw.println(String.join(",", r.id, r.name, r.type));
            }
            System.out.println("✔ Đã xóa phòng chiếu thành công khỏi rooms.csv!");
        } catch (Exception e) {
            System.out.println("Lỗi ghi rooms.csv: " + e.getMessage());
            return;
        }

        // Xóa tất cả ghế liên quan trong seat.csv
        File seatFile = new File(System.getProperty("user.dir") + "\\seats.csv");
        if (!seatFile.exists()) {
            System.out.println("⚠ seats.csv không tồn tại, chỉ xóa phòng trong rooms.csv.");
            return;
        }

        List<String> seatLines = new ArrayList<>();
        try (Scanner sc = new Scanner(seatFile, "UTF-8")) {
            // Giữ header
            if (sc.hasNextLine()) {
                seatLines.add(sc.nextLine());
            }
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 1 && !parts[0].trim().equalsIgnoreCase(roomId)) {
                    seatLines.add(line); // giữ những ghế không thuộc phòng xóa
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc seats.csv: " + e.getMessage());
            return;
        }

        // Ghi lại seats.csv
        try (PrintWriter pw = new PrintWriter(seatFile, "UTF-8")) {
            for (String line : seatLines) {
                pw.println(line);
            }
            System.out.println("✔ Đã xóa tất cả ghế của phòng trong seats.csv!");
        } catch (Exception e) {
            System.out.println("Lỗi ghi seats.csv: " + e.getMessage());
        }
    }

    private List<Room> docCSVRoom() {
        List<Room> rooms = new ArrayList<>();
        File file = new File(System.getProperty("user.dir") + "\\rooms.csv");

        if (!file.exists()) {
            System.out.println("⚠ File rooms.csv không tồn tại!");
            return rooms;
        }

        try (Scanner sc = new Scanner(file, "UTF-8")) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 3) {
                    rooms.add(new Room(
                            parts[0].trim(),
                            parts[1].trim(),
                            parts[2].trim()
                    ));
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc room.csv: " + e.getMessage());
        }

    return rooms;
    }

    private void danhSachPhongChieu() {
    List<Room> rooms = docCSVRoom();

    System.out.println("==================== DANH SÁCH PHÒNG CHIẾU ====================");
    System.out.println("| %-10s | %-20s | %-10s |".formatted("Mã phòng", "Tên phòng", "Loại"));

    if (rooms.isEmpty()) {
        System.out.println("Không có phòng chiếu nào.");
        return;
    }

    for (Room r : rooms) {
        System.out.println("| %-10s | %-20s | %-10s |".formatted(
                r.id, r.name, r.type
        ));
    }
}

    private void taoSoDoPhongChieu() {
    File roomFile = new File(System.getProperty("user.dir") + "\\rooms.csv");
    File seatFile = new File(System.getProperty("user.dir") + "\\seats.csv");

    if (!roomFile.exists()) {
        System.out.println("⚠ Không tìm thấy rooms.csv !");
        return;
    }

    List<String> roomIDs = new ArrayList<>();

    // Đọc danh sách mã phòng
    try (Scanner sc = new Scanner(roomFile, "UTF-8")) {
        while (sc.hasNextLine()) {
            String[] parts = sc.nextLine().split(",");
            if (parts.length >= 1) {
                roomIDs.add(parts[0].trim());
            }
        }
    } catch (Exception e) {
        System.out.println("Lỗi đọc rooms.csv: " + e.getMessage());
        return;
    }

    // Ghi seat.csv
    try (PrintWriter pw = new PrintWriter(seatFile, "UTF-8")) {

        // Ghi header
        pw.println("roomId,seatCode,seatType,status");

        for (String roomID : roomIDs) {

            // 6 hàng a-f, 15 ghế mỗi hàng
            for (char row = 'a'; row <= 'f'; row++) {
                for (int num = 1; num <= 15; num++) {
                    String seatCode = row + String.valueOf(num);

                    // Xác định ghế VIP hoặc Thường
                    String type = "Thường";
                    if (row == 'f' && num >= 3 && num <= 13) {
                        type = "VIP";
                    }

                    // Tình trạng mặc định: Chưa đặt
                    String status = "AVAILABLE";

                    pw.println(roomID + "," + seatCode + "," + type + "," + status);
                }
            }

            // Hàng h có 10 ghế VIP hoàn toàn
            for (int num = 1; num <= 10; num++) {
                String seatCode = "h" + num;
                String type = "VIP";
                String status = "AVAILABLE"; // mặc định chưa đặt

                pw.println(roomID + "," + seatCode + "," + type + "," + status);
            }
        }

    } catch (Exception e) {
        System.out.println("Lỗi ghi seat.csv: " + e.getMessage());
        return;
    }

    System.out.println("✔ Tạo seat.csv thành công với ghế VIP và trạng thái theo yêu cầu!");
}

    private void soDoPhongChieu() {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    List<Room> rooms = docCSVRoom();  // đọc danh sách phòng
    if (rooms.isEmpty()) {
        System.out.println("Không có phòng chiếu nào.");
        return;
    }

    // Hiển thị danh sách phòng
    System.out.println("===== DANH SÁCH PHÒNG CHIẾU =====");
    for (Room r : rooms) {
        System.out.println(r.id + " - " + r.name + " (" + r.type + ")");
    }

    System.out.print("Nhập Mã phòng muốn xem sơ đồ: ");
    String roomId = scanner.nextLine().trim();

    // Đọc danh sách ghế cho phòng này
    List<Seat> seats = new ArrayList<>();
    File seatFile = new File(System.getProperty("user.dir") + "\\seats.csv");
    if (!seatFile.exists()) {
        System.out.println("⚠ seats.csv không tồn tại!");
        return;
    }

    try (Scanner sc = new Scanner(seatFile, "UTF-8")) {
        sc.nextLine(); // bỏ header
        while (sc.hasNextLine()) {
            String[] parts = sc.nextLine().split(",");
            if (parts.length >= 4 && parts[0].trim().equals(roomId)) {
                seats.add(new Seat(
                        parts[0].trim(),
                        parts[1].trim(),
                        parts[2].trim(),
                        parts[3].trim()
                ));
            }
        }
    } catch (Exception e) {
        System.out.println("Lỗi đọc seats.csv: " + e.getMessage());
        return;
    }

    if (seats.isEmpty()) {
        System.out.println("Phòng này chưa có ghế.");
        return;
    }

    // ===== MÀU ANSI =====
    final String RED = "\u001B[31m";
    final String GREEN_BG = "\u001B[42m";
    final String RESET = "\u001B[0m";

    System.out.println("\n                ==================== SƠ ĐỒ GHẾ PHÒNG " + roomId + " ====================");
    System.out.println("                                            MÀN HÌNH                      ");
    System.out.println("                 ---------------------------------------------------------- ");

    // Nhóm ghế theo hàng
    Map<Character, List<Seat>> rowMap = new TreeMap<>();
    for (Seat s : seats) {
        char row = s.code.toUpperCase().charAt(0);
        rowMap.putIfAbsent(row, new ArrayList<>());
        rowMap.get(row).add(s);
    }

    // In từng hàng
    for (char row : rowMap.keySet()) {
        List<Seat> rowSeats = rowMap.get(row);
        rowSeats.sort(Comparator.comparingInt(s -> Integer.parseInt(s.code.substring(1))));

        if (row == 'H') {
            System.out.print("H: ");
            System.out.print("              "); // 8 dấu cách trước H1 (F1, F2, và khoảng cách nhóm)
        } else {
            System.out.print(row + ": ");
        }

        for (int i = 0; i < rowSeats.size(); i++) {
            Seat s = rowSeats.get(i);
            String display;

           // GHẾ ĐÃ ĐẶT → nền xanh lá
            if (s.getStatus().equalsIgnoreCase("BOOKED")) {
                display = "[" + GREEN_BG + s.getCode().toUpperCase() + RESET + "]";
                if (s.getType().equalsIgnoreCase("VIP")) {
                    display = RED + "[" + GREEN_BG + s.getCode().toUpperCase() + RESET + RED + "]";
                }
            } else {
                // GHẾ CHƯA ĐẶT : Không in Xanh lá
                if (s.getType().equalsIgnoreCase("VIP")) {
                    display = RED + "[" + s.getCode().toUpperCase() + "]" + RESET;
                } else {
                    display = "[" + s.getCode().toUpperCase() + "]";
                }
            }

            System.out.print(display + " ");

            // Tạo khoảng cách giữa các nhóm ghế
            int num = Integer.parseInt(s.code.substring(1));
            if ((num == 2 && row != 'H') || (num == 13 && row != 'H')) {
                System.out.print("    "); // khoảng cách giữa nhóm ghế
            }
            // Hàng H chia đều 10 ghế
            if (row == 'H' && num == 5) {
                System.out.print("     ");
            }
        }
        System.out.println();
    }

    System.out.println("                 ---------------------------------------------------------- ");
    System.out.println("Chú thích: Ghế VIP màu đỏ, ghế đã đặt sẽ in màu xanh lá.");    
}


    private List<ShowTime> docSC() {
    List<ShowTime> showtimes = new ArrayList<>();
    File file = new File(System.getProperty("user.dir") + "\\showtimes.csv");

    if (!file.exists()) {
        System.out.println("⚠ Chưa có suất chiếu nào. Vui lòng tạo lịch chiếu trước.");
        return showtimes;
    }

    try (Scanner sc = new Scanner(file, "UTF-8")) {
        boolean isFirstLine = true;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (isFirstLine) { // bỏ header
                isFirstLine = false;
                continue;
            }
            String[] parts = line.split(",");
            if (parts.length >= 9) {
                ShowTime st = new ShowTime(
                        parts[0].trim(), // id phim
                        parts[1].trim(), // tên phim
                        parts[2].trim(), // id phòng
                        parts[3].trim(), // tên phòng
                        parts[4].trim(), // loại phòng
                        parts[5].trim(), // ngày
                        parts[6].trim(), // giờ
                        parts[7].trim(), // giá thường
                        parts[8].trim()  // giá VIP
                );
                showtimes.add(st);
            }
        }
    } catch (Exception e) {
        System.out.println("Lỗi đọc showtimes.csv: " + e.getMessage());
    }

    return showtimes;
}



    public void themSuatChieu() { //Bỏ qua trùng lịch vì ngồi gần 7 tiếng vẫn không biết cách sửa lỗi date time hoặc .trim()
        Scanner scanner = new Scanner(System.in, "UTF-8");

        // 1. Hiển thị danh sách phim
        System.out.println("=== DANH SÁCH PHIM ===");
        List<Movie> movies = docCSV(); // đọc movies.csv
        if (movies.isEmpty()) {
            System.out.println("Chưa có phim nào. Vui lòng thêm phim trước!");
            return;
        }
        for (Movie m : movies) {
            System.out.println(m.id + " - " + m.name);
        }

        System.out.print("Chọn Mã phim: ");
        String movieId = scanner.nextLine();
        Movie selectedMovie = movies.stream().filter(m -> m.id.equals(movieId)).findFirst().orElse(null);
        if (selectedMovie == null) {
            System.out.println("Không tìm thấy phim!");
            return;
        }

        // 2. Hiển thị danh sách phòng
        System.out.println("=== DANH SÁCH PHÒNG CHIẾU ===");
        List<Room> rooms = docCSVRoom(); // đọc rooms.csv
        if (rooms.isEmpty()) {
            System.out.println("Chưa có phòng chiếu nào. Vui lòng thêm phòng!");
            return;
        }
        for (Room r : rooms) {
            System.out.println(r.id + " - " + r.name + " (" + r.type + ")");
        }

        System.out.print("Chọn Mã phòng: ");
        String roomId = scanner.nextLine();
        Room selectedRoom = rooms.stream().filter(r -> r.id.equals(roomId)).findFirst().orElse(null);
        if (selectedRoom == null) {
            System.out.println("Không tìm thấy phòng!");
            return;
        }

        // 3. Nhập ngày và giờ (String)
        System.out.print("Nhập ngày (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine().trim();

        System.out.print("Nhập giờ (HH:mm): ");
        String timeStr = scanner.nextLine().trim();

        // 4. Tính giá vé
        int basePrice = Integer.parseInt(selectedMovie.price.replaceAll("[^0-9]", ""));
        double vipPrice = basePrice * 1.15; // ghế VIP +15%
        if (selectedRoom.type.equalsIgnoreCase("3D")) vipPrice *= 1.10;
        if (selectedRoom.type.equalsIgnoreCase("IMAX")) vipPrice *= 1.20;

        // 5. Ghi vào showtimes.csv
        File f = new File(System.getProperty("user.dir") + "\\showtimes.csv");
        List<String> lines = new ArrayList<>();
        try {
            if (f.exists()) {
                try (Scanner sc = new Scanner(f, "UTF-8")) {
                    while (sc.hasNextLine()) lines.add(sc.nextLine());
                }
            } else {
                lines.add("MovieID,MovieName,RoomID,RoomName,RoomType,Date,Time,Price,VIPPrice");
            }

            lines.add(String.join(",", movieId, selectedMovie.name, roomId, selectedRoom.name, selectedRoom.type,
                    dateStr, timeStr,
                    String.valueOf(basePrice), String.format("%.0f", vipPrice)));

            try (PrintWriter pw = new PrintWriter(f, "UTF-8")) {
                for (String line : lines) pw.println(line);
            }

        } catch (Exception e) {
            System.out.println("Lỗi ghi showtimes.csv: " + e.getMessage());
            return;
        }

        System.out.println("✔ Thêm suất chiếu thành công!");
    }

    // Hàm phụ chuyển giá vé dạng "157.000vnđ" -> 157000
    private double parsePrice(String priceStr) {
        priceStr = priceStr.replaceAll("[^0-9]", ""); // loại bỏ chữ và dấu
        if (priceStr.isEmpty()) return 0;
        return Double.parseDouble(priceStr);
    }

    private void suaThongTinSuatChieu() {
        Scanner sc = new Scanner(System.in, "UTF-8");
    List<ShowTime> showtimes = docSC();
    if (showtimes.isEmpty()) {
        System.out.println("Chưa có suất chiếu nào để sửa.");
        return;
    }

    danhSachSuatChieu();

    System.out.print("Nhập Mã phim của suất chiếu muốn sửa: ");
    String movieId = sc.nextLine().trim();
    System.out.print("Nhập Ngày (yyyy-MM-dd) của suất chiếu muốn sửa: ");
    String date = sc.nextLine().trim();
    System.out.print("Nhập Giờ (HH:mm) của suất chiếu muốn sửa: ");
    String time = sc.nextLine().trim();

    ShowTime target = null;
    for (ShowTime st : showtimes) {
        if (st.id.trim().equals(movieId) && st.date.trim().equals(date) && st.time.trim().equals(time)) {
            target = st;
            break;
        }
    }

    if (target == null) {
        System.out.println("Không tìm thấy suất chiếu phù hợp để sửa.");
        return;
    }

    // Nhập thông tin mới
    System.out.print("Nhập Ngày mới (yyyy-MM-dd) [" + target.date + "]: ");
    String newDate = sc.nextLine().trim();
    if (!newDate.isEmpty()) target.date = newDate;

    System.out.print("Nhập Giờ mới (HH:mm) [" + target.time + "]: ");
    String newTime = sc.nextLine().trim();
    if (!newTime.isEmpty()) target.time = newTime;

    System.out.print("Nhập Giá thường mới [" + target.nprice + "]: ");
    String nprice = sc.nextLine().trim();
    if (!nprice.isEmpty()) target.nprice = nprice;

    System.out.print("Nhập Giá VIP mới [" + target.vprice + "]: ");
    String vprice = sc.nextLine().trim();
    if (!vprice.isEmpty()) target.vprice = vprice;

    // Ghi lại CSV
    File f = new File(System.getProperty("user.dir") + "\\showtimes.csv");
    try (PrintWriter pw = new PrintWriter(f, "UTF-8")) {
        pw.println("MovieID,MovieName,RoomID,RoomName,RoomType,Date,Time,Price,VIPPrice");
        for (ShowTime st : showtimes) {
            pw.println(String.join(",", st.id, st.name, st.roomId, st.nameroom, st.type,
                    st.date, st.time, st.nprice, st.vprice));
        }
    } catch (Exception e) {
        System.out.println("Lỗi ghi showtimes.csv: " + e.getMessage());
    }

    System.out.println("✔ Sửa suất chiếu thành công!");
    }

    private void xoaSuatChieu() {
    Scanner sc = new Scanner(System.in, "UTF-8");
    List<ShowTime> showtimes = docSC();
    if (showtimes.isEmpty()) {
        System.out.println("Chưa có suất chiếu nào để xóa.");
        return;
    }

    danhSachSuatChieu();    

    System.out.print("Nhập Mã phim của suất chiếu muốn xóa: ");
    String movieId = sc.nextLine().trim();
    System.out.print("Nhập Ngày (yyyy-MM-dd) của suất chiếu muốn xóa: ");
    String date = sc.nextLine().trim();
    System.out.print("Nhập Giờ (HH:mm) của suất chiếu muốn xóa: ");
    String time = sc.nextLine().trim();

    boolean removed = showtimes.removeIf(st ->
            st.id.trim().equals(movieId) &&
            st.date.trim().equals(date) &&
            st.time.trim().equals(time)
    );

    if (!removed) {
        System.out.println("Không tìm thấy suất chiếu phù hợp để xóa.");
        return;
    }

    // Ghi lại CSV
    File f = new File(System.getProperty("user.dir") + "\\showtimes.csv");
    try (PrintWriter pw = new PrintWriter(f, "UTF-8")) {
        pw.println("MovieID,MovieName,RoomID,RoomName,RoomType,Date,Time,Price,VIPPrice");
        for (ShowTime st : showtimes) {
            pw.println(String.join(",", st.id, st.name, st.roomId, st.nameroom, st.type,
                    st.date, st.time, st.nprice, st.vprice));
        }
    } catch (Exception e) {
        System.out.println("Lỗi ghi showtimes.csv: " + e.getMessage());
    }

    System.out.println("✔ Xóa suất chiếu thành công!");
    }
     
    private void danhSachSuatChieu() {
        List<ShowTime> showtimes = docSC();

        if (showtimes.isEmpty()) {
            System.out.println("Chưa có suất chiếu nào.");
            return;
        }

        System.out.println("===================================== DANH SÁCH SUẤT CHIẾU =====================================");
        System.out.println("| %-7s | %-20s | %-8s | %-9s | %-10s | %-15s | %-8s | %-10s | %-10s |".formatted(
                "Mã Phim", "Tên Phim", "Mã Phòng", "Tên Phòng", "Loại Phòng", "Ngày", "Giờ", "Giá vé", "VIP"
        ));

        for (ShowTime st : showtimes) {
            System.out.println("| %-7s | %-20s | %-8s | %-9s | %-10s | %-15s | %-8s | %-10s | %-10s |".formatted(
                    st.id,
                    st.name,
                    st.roomId,
                    st.nameroom,
                    st.type,
                    st.date,
                    st.time,
                    st.nprice,
                    st.vprice
            ));
        }
    }

    private List<Seat> docSeatCSV() {
    List<Seat> seats = new ArrayList<>();
    File file = new File(System.getProperty("user.dir") + "\\seats.csv");
    if (!file.exists()) {
        System.out.println("⚠ Chưa có ghế nào. Vui lòng tạo sơ đồ phòng trước.");
        return seats;
    }
        try (Scanner sc = new Scanner(file, "UTF-8")) {
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");

            if (parts.length == 4) {
                seats.add(new Seat(
                            parts[0].trim(),
                            parts[1].trim(),
                            parts[2].trim(),
                            parts[3].trim()
                ));
            }
        }
    } catch (Exception e) {
        System.out.println("Lỗi đọc seats.csv: " + e.getMessage());
    }

    return seats;
}


    private void updateSeatCSV(String roomId, List<Seat> seats) {
        File file = new File(System.getProperty("user.dir") + "\\seats.csv");
        List<String> lines = new ArrayList<>();

        // Nếu file chưa tồn tại, tạo mới
        if (!file.exists()) {
            System.out.println("⚠ File seats.csv không tồn tại!");
            return;
        }

        // Đọc tất cả dòng từ file
        try (Scanner sc = new Scanner(file, "UTF-8")) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    String rId = parts[0].trim();
                    String code = parts[1].trim();
                    String type = parts[2].trim();
                    String status = parts[3].trim();

                    // Nếu là phòng hiện tại, cập nhật trạng thái ghế
                    if (rId.equals(roomId)) {
                        Seat seat = seats.stream()
                                .filter(s -> s.getCode().equalsIgnoreCase(code))
                                .findFirst()
                                .orElse(null);
                        if (seat != null) {
                            status = seat.getStatus();
                        }
                    }

                    lines.add(rId + "," + code + "," + type + "," + status);
                } else {
                    // giữ nguyên các dòng khác
                    lines.add(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc seats.csv: " + e.getMessage());
            return;
        }

        // Ghi lại toàn bộ file với trạng thái mới
        try (PrintWriter pw = new PrintWriter(file, "UTF-8")) {
            for (String l : lines) {
                pw.println(l);
            }
        } catch (Exception e) {
            System.out.println("Lỗi ghi seats.csv: " + e.getMessage());
        }
    }

    private void datVe() {
    Scanner scanner = new Scanner(System.in, "UTF-8");

    // 1. Hiển thị danh sách phim
    List<Movie> movies = docCSV();
    if (movies.isEmpty()) {
        System.out.println("⚠ Chưa có phim nào.");
        return;
    }
    System.out.println("=== DANH SÁCH PHIM ===");
    for (Movie m : movies) {
        System.out.println(m.id + " - " + m.name);
    }

    System.out.print("Chọn Mã phim: ");
    String movieId = scanner.nextLine();
    Movie selectedMovie = movies.stream().filter(m -> m.id.equals(movieId)).findFirst().orElse(null);
    if (selectedMovie == null) {
        System.out.println("⚠ Phim không tồn tại!");
        return;
    }

    // 2. Lấy danh sách suất chiếu của phim
    List<ShowTime> showtimes = docSC();
    List<ShowTime> phimShowtimes = new ArrayList<>();
    for (ShowTime st : showtimes) {
        if (st.id.equals(movieId)) phimShowtimes.add(st);
    }
    if (phimShowtimes.isEmpty()) {
        System.out.println("⚠ Phim này chưa có suất chiếu.");
        return;
    }

    // 3. Hiển thị danh sách suất chiếu
    System.out.println("=== DANH SÁCH SUẤT CHIẾU ===");
    for (int i = 0; i < phimShowtimes.size(); i++) {
        ShowTime st = phimShowtimes.get(i);
        System.out.printf("%d. Phòng: %s | Loại: %s | Ngày: %s | Giờ: %s | Giá vé: %s | VIP: %s%n",
                i + 1, st.nameroom, st.type, st.date, st.time, st.nprice, st.vprice);
    }

    System.out.print("Chọn suất chiếu (số): ");
    int showIndex = scanner.nextInt() - 1;
    scanner.nextLine();
    if (showIndex < 0 || showIndex >= phimShowtimes.size()) {
        System.out.println("⚠ Lựa chọn không hợp lệ!");
        return;
    }

    ShowTime selectedShow = phimShowtimes.get(showIndex);

    // 4. Hiển thị sơ đồ ghế
    List<Seat> seats = new ArrayList<>();
    File seatFile = new File(System.getProperty("user.dir") + "\\seats.csv");
    if (!seatFile.exists()) {
        System.out.println("⚠ seats.csv không tồn tại!");
        return;
    }

    try (Scanner sc = new Scanner(seatFile, "UTF-8")) {
        sc.nextLine(); // bỏ header
        while (sc.hasNextLine()) {
            String[] parts = sc.nextLine().split(",");
            if (parts.length >= 4 && parts[0].trim().equals(selectedShow.roomId)) {
                seats.add(new Seat(
                        parts[0].trim(),
                        parts[1].trim(),
                        parts[2].trim(),
                        parts[3].trim()
                ));
            }
        }
    } catch (Exception e) {
        System.out.println("Lỗi đọc seats.csv: " + e.getMessage());
        return;
    }

    if (seats.isEmpty()) {
        System.out.println("Phòng này chưa có ghế.");
        return;
    }

    // ===== MÀU ANSI =====
    final String RED = "\u001B[31m";
    final String GREEN_BG = "\u001B[42m";
    final String RESET = "\u001B[0m";

    System.out.println("\n                ==================== SƠ ĐỒ GHẾ PHÒNG  ====================");
    System.out.println("                                            MÀN HÌNH                      ");
    System.out.println("                 ---------------------------------------------------------- ");

    // Nhóm ghế theo hàng
    Map<Character, List<Seat>> rowMap = new TreeMap<>();
    for (Seat s : seats) {
        char row = s.code.toUpperCase().charAt(0);
        rowMap.putIfAbsent(row, new ArrayList<>());
        rowMap.get(row).add(s);
    }

    // In từng hàng
    for (char row : rowMap.keySet()) {
        List<Seat> rowSeats = rowMap.get(row);
        rowSeats.sort(Comparator.comparingInt(s -> Integer.parseInt(s.code.substring(1))));

        if (row == 'H') {
            System.out.print("H: ");
            System.out.print("              "); // 8 dấu cách trước H1 (F1, F2, và khoảng cách nhóm)
        } else {
            System.out.print(row + ": ");
        }

        for (int i = 0; i < rowSeats.size(); i++) {
            Seat s = rowSeats.get(i);
            String display;

           // GHẾ ĐÃ ĐẶT → nền xanh lá
            if (s.getStatus().equalsIgnoreCase("BOOKED")) {
                display = "[" + GREEN_BG + s.getCode().toUpperCase() + RESET + "]";
                if (s.getType().equalsIgnoreCase("VIP")) {
                    display = RED + "[" + GREEN_BG + s.getCode().toUpperCase() + RESET + RED + "]";
                }
            } else {
                // GHẾ CHƯA ĐẶT : Không in Xanh lá
                if (s.getType().equalsIgnoreCase("VIP")) {
                    display = RED + "[" + s.getCode().toUpperCase() + "]" + RESET;
                } else {
                    display = "[" + s.getCode().toUpperCase() + "]";
                }
            }

            System.out.print(display + " ");

            // Tạo khoảng cách giữa các nhóm ghế
            int num = Integer.parseInt(s.code.substring(1));
            if ((num == 2 && row != 'H') || (num == 13 && row != 'H')) {
                System.out.print("    "); // khoảng cách giữa nhóm ghế
            }
            // Hàng H chia đều 10 ghế
            if (row == 'H' && num == 5) {
                System.out.print("     ");
            }
        }
        System.out.println();
    }

    System.out.println("                 ---------------------------------------------------------- ");
    System.out.println("Chú thích: Ghế VIP màu đỏ, ghế đã đặt sẽ in màu xanh lá.");

    List<String> chosenSeats = new ArrayList<>();
while (true) {
    System.out.print("Nhập ghế muốn đặt (vd: a1) hoặc 'x' để kết thúc: ");
    String seatCode = scanner.nextLine().trim();

    if (seatCode.equalsIgnoreCase("x"))
        break;

    Seat seat = seats.stream()
                     .filter(s -> s.getCode().equalsIgnoreCase(seatCode))
                     .findFirst()
                     .orElse(null);

    if (seat == null) {
        System.out.println("⚠ Ghế không tồn tại.");
        continue;
    }

    if (seat.getStatus().equalsIgnoreCase("BOOKED")) {
        System.out.println("⚠ Ghế đã được đặt.");
        continue;
    }

    chosenSeats.add(seatCode);
    seat.setStatus("BOOKED"); // đánh dấu ghế đã đặt
    System.out.println("✅ Ghế " + seatCode + " đã được chọn thành công.");
}

// Thông báo sau khi vòng lặp kết thúc
if (chosenSeats.isEmpty()) {
    System.out.println("⚠ Bạn chưa chọn ghế nào.");
} else {
    System.out.println("🎉 Bạn đã chọn các ghế: " + String.join(", ", chosenSeats));
    System.out.println("✅ Đặt ghế thành công!");
}

// ===== THU THẬP THÔNG TIN KHÁCH HÀNG =====
System.out.print("Nhập mã khách hàng: ");
String customerId = scanner.nextLine().trim();

System.out.print("Nhập tên khách hàng: ");
String customerName = scanner.nextLine().trim();

System.out.print("Nhập số điện thoại: ");
String customerPhone = scanner.nextLine().trim();

if (customerId.isEmpty() || customerName.isEmpty() || customerPhone.isEmpty()) {
    System.out.println("⚠ Thông tin khách hàng không hợp lệ!");
    return;
}

    // 6. Tính tổng tiền
double total = 0;
for (String code : chosenSeats) {
    Seat s = seats.stream()
                  .filter(seat -> seat.code.equalsIgnoreCase(code))
                  .findFirst()
                  .orElse(null);
    if (s == null) continue;

    // Chọn giá theo loại ghế và parse từ String sang double
    double price = Double.parseDouble(selectedShow.nprice.replace(",", ""));
    if (s.type.equalsIgnoreCase("VIP")) {
        price = Double.parseDouble(selectedShow.vprice.replace(",", ""));
    }

    total += price;
}

// Hiển thị tổng tiền có phân cách hàng nghìn
System.out.println("Tổng tiền: " + String.format("%,.0f", total) + " VNĐ");
System.out.println("Ghế đã đặt: " + String.join(", ", chosenSeats));

    // 7. Lưu vào tickets.csv
File file = new File(System.getProperty("user.dir") + "\\tickets.csv");
List<String> lines = new ArrayList<>();
try {
    // 1. Đọc file nếu đã tồn tại
    if (file.exists()) {
        try (Scanner sc = new Scanner(file, "UTF-8")) {
            while (sc.hasNextLine()) lines.add(sc.nextLine());
        }
    } else {
        // nếu chưa tồn tại, thêm header
        lines.add("MovieID,MovieName,RoomID,RoomName,RoomType,Date,Time,Seat,Price,CustomerID,CustomerName,CustomerPhone");


    }

    // 2. Thêm từng ghế đã chọn
    for (String seatCode : chosenSeats) {
        Seat s = seats.stream()
                      .filter(seat -> seat.getCode().equalsIgnoreCase(seatCode))
                      .findFirst()
                      .orElse(null);
        if (s == null) continue;

        // Chọn giá theo loại ghế (vẫn là String)
        String price = selectedShow.nprice;
        if (s.type.equalsIgnoreCase("VIP")) price = selectedShow.vprice;

        // Thêm dòng mới vào danh sách
        lines.add(String.join(",",
        selectedShow.id,
        selectedShow.name,
        selectedShow.roomId,
        selectedShow.nameroom,
        selectedShow.type,
        selectedShow.date,
        selectedShow.time,
        seatCode.toUpperCase(),
        price,
        customerId,
        customerName,
        customerPhone
));


    }

    // 3. Ghi lại file
    try (PrintWriter pw = new PrintWriter(file, "UTF-8")) {
        for (String line : lines) pw.println(line);
    }

} catch (Exception e) {
    System.out.println("Lỗi lưu vé: " + e.getMessage());
    return;
}

System.out.println("✔ Lưu vé vào tickets.csv thành công!");

    // 8. Cập nhật trạng thái ghế trong seats.csv
    updateSeatCSV(selectedShow.roomId, seats);

    // 9. Tạo hóa đơn và lưu vào invoices.csv
    String invoiceId = "HD" + System.currentTimeMillis();  // mã hóa đơn tự sinh
    int ticketCount = chosenSeats.size();

    Invoice invoice = new Invoice(
        invoiceId,
        customerName,
        ticketCount,
        total,
        selectedShow.date // ← ngày suất chiếu từ showtime
    );


    saveInvoice(invoice);

    System.out.println("✔ Hóa đơn đã được tạo: " + invoiceId);
    System.out.println("📄 Tổng tiền: " + String.format("%,.0f", total) + " VNĐ");
    System.out.println("📥 Đã lưu vào invoices.csv");

}

    public void huyVe() {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        File ticketsFile = new File("tickets.csv");
        File seatFile = new File("seats.csv");
        File customerFile = new File("customers.csv");

        if (!ticketsFile.exists() || !seatFile.exists() || !customerFile.exists()) {
            System.out.println("⚠ Chưa đủ dữ liệu. Vui lòng kiểm tra tickets.csv, seats.csv, customers.csv.");
            return;
        }

        boolean done = false;

        while (!done) {
            hienThiDanhSachKhachHang();

            System.out.print("Nhập Mã khách hàng muốn hủy vé (hoặc '0' để thoát): ");
            String customerId = scanner.nextLine().trim();
            if (customerId.equals("0")) break;

            // Đọc vé khách hàng
            List<String> allTicketLines = new ArrayList<>();
            List<String> customerTicketLines = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(ticketsFile))) {
                String line;
                boolean firstLine = true;
                while ((line = br.readLine()) != null) {
                    if (firstLine) {
                        allTicketLines.add(line);
                        firstLine = false;
                        continue;
                    }
                    allTicketLines.add(line);
                    String[] parts = line.split(",");
                    if (parts.length < 12) continue;
                    if (parts[9].equalsIgnoreCase(customerId)) {
                        customerTicketLines.add(line);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }

            if (customerTicketLines.isEmpty()) {
                System.out.println("⚠ Khách hàng này chưa có vé.");
                continue; // quay lại vòng lặp để nhập lại
            }

            // Hiển thị vé của khách hàng
            System.out.println("=== VÉ CỦA KHÁCH HÀNG " + customerId + " ===");

            // In header bảng
            System.out.printf("| %-4s | %-20s | %-8s | %-10s | %-12s | %-6s | %-5s |%n",
                    "STT", "Phim", "Mã Phòng", "Phòng", "Ngày", "Giờ", "Ghế");

            // In từng vé
            for (int i = 0; i < customerTicketLines.size(); i++) {
                String[] parts = customerTicketLines.get(i).split(",");
                String movieName = parts[1];
                String roomId    = parts[2];
                String roomName  = parts[3];
                String date      = parts[5];
                String time      = parts[6];
                String seat      = parts[7];

                System.out.printf("| %-4d | %-20s | %-8s | %-10s | %-12s | %-6s | %-5s |%n",
                        i + 1, movieName, roomId, roomName, date, time, seat);
            }

            // Chọn vé hủy
            int choice = -1;
            while (choice < 0 || choice > customerTicketLines.size()) {
                System.out.print("Nhập số thứ tự vé muốn hủy (0 = tất cả, -1 = thoát): ");
                try {
                    choice = Integer.parseInt(scanner.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("⚠ Vui lòng nhập số hợp lệ!");
                    continue;
                }
                if (choice == -1) break;
                if (choice < 0 || choice > customerTicketLines.size()) {
                    System.out.println("⚠ Lựa chọn không hợp lệ!");
                }
            }
            if (choice == -1) continue; // thoát quay lại nhập mã khác

            List<String> ticketsToRemove = new ArrayList<>();
            if (choice == 0) ticketsToRemove.addAll(customerTicketLines);
            else ticketsToRemove.add(customerTicketLines.get(choice - 1));

            // Cập nhật tickets.csv
            List<String> updatedTickets = new ArrayList<>();
            updatedTickets.add(allTicketLines.get(0)); // header
            for (String line : allTicketLines.subList(1, allTicketLines.size())) {
                if (!ticketsToRemove.contains(line)) updatedTickets.add(line);
            }
            try (PrintWriter pw = new PrintWriter(ticketsFile, "UTF-8")) {
                for (String l : updatedTickets) pw.println(l);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

            // Cập nhật seats.csv
            List<String> seatLines = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(seatFile))) {
                String line;
                while ((line = br.readLine()) != null) seatLines.add(line);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

            for (String ticketLine : ticketsToRemove) {
                String[] t = ticketLine.split(",");
                String roomId = t[2];
                String seatCode = t[7];
                for (int i = 1; i < seatLines.size(); i++) {
                    String[] s = seatLines.get(i).split(",");
                    if (s.length < 4) continue;
                    if (s[0].equals(roomId) && s[1].equalsIgnoreCase(seatCode)) {
                        s[3] = "AVAILABLE";
                        seatLines.set(i, String.join(",", s));
                    }
                }
            }

            try (PrintWriter pw = new PrintWriter(seatFile, "UTF-8")) {
                for (String l : seatLines) pw.println(l);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Cập nhật customers.csv
            List<String> customerLines = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(customerFile))) {
                String line;
                while ((line = br.readLine()) != null) customerLines.add(line);
            } catch (Exception e) {
                e.printStackTrace();
            }

            for (int i = 1; i < customerLines.size(); i++) {
                String[] c = customerLines.get(i).split(",");
                if (c[0].equalsIgnoreCase(customerId)) {
                    try {
                        int count = Integer.parseInt(c[3]);
                        count -= ticketsToRemove.size();
                        if (count < 0) count = 0;
                        c[3] = String.valueOf(count);
                        customerLines.set(i, String.join(",", c));
                    } catch (NumberFormatException e) {
                        c[3] = "0";
                        customerLines.set(i, String.join(",", c));
                    }
                }
            }

            try (PrintWriter pw = new PrintWriter(customerFile, "UTF-8")) {
                for (String l : customerLines) pw.println(l);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("✔ Hủy vé thành công!");
            done = true; // thoát vòng lặp
        }
}


    private void thongKeHoaDonTheoKhachHang() {
        System.out.println("Chức năng thống kê hóa đơn theo khách hàng đang được phát triển...");
        // TODO: Xuất hóa đơn, lưu thông tin giao dịch
    }

    private void xemHoaDon() {
        File file = new File("invoices.csv");
        if (!file.exists()) {
            System.out.println("⚠ Chưa có hóa đơn nào.");
            return;
        }

        System.out.println("===================================== DANH SÁCH HÓA ĐƠN =====================================");
        System.out.println("| %-15s | %-20s | %-7s | %-15s | %-12s | %-8s |".formatted(
                "Mã HĐ", "Tên KH", "Số vé", "Tổng tiền", "Ngày chiếu", "Tháng"
        ));

        try (Scanner sc = new Scanner(file, "UTF-8")) {
            sc.nextLine(); // bỏ header

            while (sc.hasNextLine()) {
                String[] p = sc.nextLine().split(",");
                if (p.length < 6) continue;

                String invoiceId = p[0];
                String customerName = p[1];
                String ticketCount = p[2];
                String total = p[3];
                String showDate = p[4];
                String showMonth = p[5];

                System.out.println("| %-15s | %-20s | %-7s | %-15s | %-12s | %-8s |".formatted(
                        invoiceId,
                        customerName,
                        ticketCount,
                        String.format("%,.0f", Double.parseDouble(total)),
                        showDate,
                        showMonth
                ));
            }

        } catch (Exception e) {
            System.out.println("Lỗi đọc invoices.csv: " + e.getMessage());
        }

        System.out.println("==============================================================================================\n"); 
    }

    public Map<String, Customer> generateCustomerStats(List<Ticket> tickets) {
        Map<String, Customer> customers = new LinkedHashMap<>();
        for (Ticket t : tickets) {
            String id = t.customerId;
            if (!customers.containsKey(id)) {
                customers.put(id, new Customer(t.customerId, t.customerName, t.phone));
            }
            customers.get(id).incrementTickets();
        }
        return customers;
    }


    public void writeCustomerCSV(Map<String, Customer> customers) {
        File file = new File("customers.csv");
        try (PrintWriter pw = new PrintWriter(file, "UTF-8")) {
            pw.println("CustomerID,CustomerName,Phone,TotalTickets");
            for (Customer c : customers.values()) {
                pw.println(c.customerId + "," +
                        c.customerName + "," +
                        c.phone + "," +
                        c.totalTickets);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void capNhatDanhSachKhachHang() {
        System.out.println("=== CẬP NHẬT DANH SÁCH KHÁCH HÀNG ===");
        List<Ticket> tickets = readTicketsCSV();
        if (tickets.isEmpty()) {
            System.out.println("⚠ Chưa có vé nào trong hệ thống!");
            return;
        }
        Map<String, Customer> customers = generateCustomerStats(tickets);
        writeCustomerCSV(customers);
        System.out.println("✔ Cập nhật danh sách khách hàng thành công!");
    }

    public void hienThiDanhSachKhachHang() {
        File file = new File("customers.csv");

        if (!file.exists()) {
            System.out.println("⚠ Chưa có danh sách khách hàng. Vui lòng cập nhật trước.");
            return;
        }

        List<Customer> customers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                if (firstLine) { // bỏ header
                    firstLine = false;
                    continue;
                }
                if (line.trim().isEmpty()) continue;

                String[] parts = line.split(",");
                if (parts.length < 4) continue;

                Customer c = new Customer(parts[0].trim(), parts[1].trim(), parts[2].trim());
                c.totalTickets = parts[3].trim();
                customers.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // In ra bảng đẹp mắt
        System.out.println("=== DANH SÁCH KHÁCH HÀNG ===");
        System.out.printf("%-10s | %-35s | %-15s | %-10s%n", "Mã KH", "Tên KH", "SĐT", "Tổng vé");
        for (Customer c : customers) {
            System.out.printf("%-10s | %-35s | %-15s | %-10s%n",
                    c.customerId, c.customerName, c.phone, c.totalTickets);
        }
        System.out.println("Tổng số khách hàng: " + customers.size());
    }

    private void doanhThuTheoNgay(String ngay) {
        File file = new File("invoices.csv");
        if (!file.exists()) {
            System.out.println("Chưa có hóa đơn.");
            return;
        }

        double total = 0;

        try (Scanner sc = new Scanner(file)) {
            sc.nextLine(); // bỏ header

            while (sc.hasNextLine()) {
                String[] p = sc.nextLine().split(",");
                String date = p[4];
                double money = Double.parseDouble(p[3]);

                if (date.equals(ngay)) {
                    total += money;
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc file");
        }

        System.out.println("📅 Doanh thu ngày " + ngay + ": " + String.format("%,.0f", total) + " VNĐ");

    }

    public void doanhThuTheoThang(String month) { // month = "2025-11"
        File file = new File("invoices.csv");
        if (!file.exists()) {
            System.out.println("Chưa có hóa đơn.");
            return;
        }

        double total = 0;

        try (Scanner sc = new Scanner(file)) {
            sc.nextLine();

            while (sc.hasNextLine()) {
                String[] p = sc.nextLine().split(",");
                String invoiceMonth = p[5];
                double money = Double.parseDouble(p[3]);

                if (invoiceMonth.equals(month)) {
                    total += money;
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc file");
        }

        System.out.println("📆 Doanh thu tháng " + month + ": " + String.format("%,.0f", total) + " VNĐ");
    }


    private void danhSachVeBanRaTheoPhim() {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        File file = new File("tickets.csv");
        
        if (!file.exists()) {
            System.out.println("⚠ Chưa có vé nào.");
            return;
        }

        List<Movie> movies = docCSV();
        if (movies.isEmpty()) {
            System.out.println("⚠ Chưa có phim nào.");
            return;
        }
        System.out.println("=== DANH SÁCH PHIM ===");
        for (Movie m : movies) {
            System.out.println(m.id + " - " + m.name);
        }

        // Nhập phim muốn xem vé
        System.out.print("Nhập Mã phim hoặc Tên phim: ");
        String keyword = scanner.nextLine().trim().toLowerCase();

        List<String[]> tickets = new ArrayList<>();

        try (Scanner sc = new Scanner(file, "UTF-8")) {
            String header = sc.nextLine(); // bỏ header

            while (sc.hasNextLine()) {
                String[] p = sc.nextLine().split(",");
                if (p.length < 12) continue;

                String movieId = p[0].trim().toLowerCase();
                String movieName = p[1].trim().toLowerCase();

                if (movieId.equals(keyword) || movieName.contains(keyword)) {
                    tickets.add(p);
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc tickets.csv: " + e.getMessage());
            return;
        }

        if (tickets.isEmpty()) {
            System.out.println("⚠ Không tìm thấy vé cho phim này.");
            return;
        }

        // In bảng
        System.out.println("===================================== DANH SÁCH VÉ THEO PHIM =====================================");
        System.out.println("| %-7s | %-19s | %-8s | %-9s | %-10s | %-10s | %-6s | %-4s | %-10s | %-15s |".formatted(
                "Mã Phim", "Tên Phim", "Mã Phòng", "Tên Phòng", "Loại Phòng", "Ngày", "Giờ", "Ghế", "Giá vé", "Khách hàng"
        ));

        for (String[] t : tickets) {
            System.out.println("| %-7s | %-19s | %-8s | %-9s | %-10s | %-10s | %-6s | %-4s | %-10s | %-15s |".formatted(
                    t[0],           // MovieID
                    t[1],           // MovieName
                    t[2],           // RoomID
                    t[3],           // RoomName
                    t[4],           // RoomType
                    t[5],           // Date
                    t[6],           // Time
                    t[7],           // Seat
                    t[8],           // Price
                    t[10]           // CustomerName
            ));
        }

        System.out.println("====================================================================================================\n");
    }

    public void top3PhimBanChay() {
        File file = new File("tickets.csv");
        if (!file.exists()) {
            System.out.println("⚠ Chưa có vé để thống kê.");
            return;
        }

        // MovieID -> [MovieName, TicketCount]
        Map<String, MovieStats> map = new HashMap<>();

        try (Scanner sc = new Scanner(file, "UTF-8")) {
            sc.nextLine(); // bỏ header

            while (sc.hasNextLine()) {
                String[] p = sc.nextLine().split(",");

                if (p.length < 2) continue;

                String movieId = p[0].trim();
                String movieName = p[1].trim();

                map.putIfAbsent(movieId, new MovieStats(movieName));
                map.get(movieId).count++;
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc tickets.csv: " + e.getMessage());
            return;
        }

        // Convert map → list
        List<Map.Entry<String, MovieStats>> list = new ArrayList<>(map.entrySet());

        // Sắp xếp giảm dần theo số vé
        list.sort((a, b) -> b.getValue().count - a.getValue().count);

        System.out.println("\n🔥 TOP 3 PHIM BÁN CHẠY NHẤT:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            MovieStats ms = list.get(i).getValue();
            System.out.printf("%d. %s (%s) — %d vé%n",
                    i + 1,
                    ms.name,
                    list.get(i).getKey(),
                    ms.count
            );
        }
    }

    // Lớp phụ để lưu thông tin
    class MovieStats {
        String name;
        int count = 0;

        public MovieStats(String name) {
            this.name = name;
        }
    }




}