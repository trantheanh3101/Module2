package MVC_Exercise.LibraryManeger.controller;

//Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo.
// Mỗi tài liệu gồm có các thuộc tính sau:
// Mã tài liệu(Mã tài liệu là duy nhất), Tên nhà xuất bản, số bản phát hành.
//Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
//Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
//Các báo cần quản lý thêm: Ngày phát hành.
//Yêu cầu 1: Xây dựng các lớp để quản lý tài liệu cho thư viện một cách hiệu quả.
//Yêu cầu 2: Xây dựng lớp QuanLySach có các chức năng sau
//Thêm mới tài liêu: Sách, tạp chí, báo.
//Xoá tài liệu theo mã tài liệu.
//Hiện thị thông tin về tài liệu.
//Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
//Thoát khỏi chương trình.

import MVC_Exercise.LibraryManeger.view.LibraryView;

public class Main {
    public static void main(String[] args) {
        LibraryView view = new LibraryView();
        LibraryController libraryController = new LibraryController(view);
        libraryController.run();
    }
}
