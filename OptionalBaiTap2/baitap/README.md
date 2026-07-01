Phân tích độ phức tạp thời gian:

Gọi N là độ dài của chuỗi đầu vào (string.length()).

1. Các thao tác khởi tạo ban đầu
   - Kiểm tra điều kiện, khởi tạo StringBuilder và thêm ký tự đầu tiên đều là các thao tác cơ bản.
   - Độ phức tạp: O(1).
2. Vòng lặp for chính: Vòng lặp này chạy từ i = 1 đến N - 1, tức là lặp đúng N - 1 lần. Bên trong vòng lặp, ta xét hai nhánh của câu lệnh if-else:
   - Nhánh if (Khi ký tự hiện tại lớn hơn ký tự cuối của current):
     - Thao tác append vào StringBuilder có độ phức tạp trung bình (amortized) là O(1).
   - Nhánh else (Khi tính chất tăng dần bị ngắt quãng):
     - current.length() và max.length() tốn O(1).
     - max.setLength(0) và current.setLength(0) tốn O(1) (vì Java chỉ đặt lại con trỏ đếm kích thước count = 0 chứ không xóa mảng character bên trong).
     - max.append(current): Thao tác này sao chép toàn bộ ký tự từ current sang max. Độ phức tạp của nó phụ thuộc vào chiều dài của chuỗi current tại thời điểm đó, gọi là K (K nhỏ hơn hoặc bằng N).
3. Đánh giá trường hợp xấu nhất (Worst-case) trong vòng lặp
   - Một ký tự chỉ được thêm vào current tối đa 1 lần.
   - Khi nhánh else xảy ra, chuỗi current bị "đập đi xây lại" (reset). Tổng số ký tự được sao chép qua lệnh max.append(current) trong tất cả các lần lọt vào nhánh else cộng lại không thể vượt quá N.
   - Do đó, hành động sao chép chuỗi không làm thay đổi bản chất tuyến tính của thuật toán.
4. Thao tác kiểm tra cuối cùng và in kết quả
   - Thao tác kiểm tra cuối và toString() sẽ tốn thời gian tỉ lệ thuận với độ dài chuỗi kết quả: O(N).
