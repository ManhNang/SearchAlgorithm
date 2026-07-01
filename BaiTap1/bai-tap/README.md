Phân tích độ phức tạp thời gian

1. Khởi tạo và lấy ký tự đầu tiên: Hành động này tốn thời gian hằng số: O(1).
2. Vòng lặp for duyệt qua chuỗi:
   - Vòng lặp này chạy từ i = 1 đến N - 1, tức là lặp lại N - 1 lần.
   - Bên trong vòng lặp, chúng ta có các thao tác:
     - string.charAt(i): Lấy ký tự tại chỉ mục i của chuỗi -> O(1).
     - max.getLast(): Lấy phần tử cuối cùng của một LinkedList -> O(1) (vì Java LinkedList lưu trữ tham chiếu đến phần tử cuối cùng tail).
     - max.add(...): Thêm một phần tử vào cuối LinkedList -> O(1).
   - Vì tất cả các thao tác bên trong vòng lặp đều là O(1), tổng thời gian cho vòng lặp này là:(N - 1) x O(1) = O(N)
3. Vòng lặp in kết quả:
   - Trong trường hợp xấu nhất (chuỗi tăng dần hoàn toàn, ví dụ: "abcdef"), số lượng phần tử trong danh sách max sẽ bằng đúng độ dài của chuỗi ban đầu (N).
   - Việc duyệt qua danh sách và in từng ký tự sẽ tốn thời gian tỉ lệ thuận với số phần tử trong danh sách -> O(N).
