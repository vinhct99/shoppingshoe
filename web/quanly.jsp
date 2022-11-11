

<%@page import="Model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>VIN Soccer</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/shop-item.css" rel="stylesheet">

    </head>

    <body>
        <form action="trangchu" method="post">
            <!-- Navigation -->
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
                <div class="container">

                    <a class="navbar-brand" href="./trangchu">Soccershoes.vn</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarResponsive">
                        <ul class="navbar-nav ml-auto">

                            <li class="nav-item active">
                                <input class="btn-dark"  type="submit" name="trangchuAdmin" value="Trang chủ" />
                            </li>
                            </form>
                            <form action="ProductController" method="post">
                                <li class="nav-item">
                                    <input class="btn-dark"  type="submit" name="sanphamAdmin" value="Sản Phẩm" />
                                </li>
                            </form>
                            <form action="CartController" method="post">
                                <li class="nav-item">
                                    <input class="btn-dark"  type="submit" name="giohangAdmin" value="Giỏ Hàng" />
                                </li>
                            </form>
                            <form action="LoginController" method="post">
                                <li class="nav-item">
                                    <input class="btn-dark"  type="submit" name="lo" value="Đăng xuất" />
                                </li>
                            </form>
                        </ul>
                    </div>
                </div>
            </nav>

            <!-- Page Content -->
            <div class="container">
                <h2>Danh sách tất cả sản phẩm</h2>
                <form action="ManageController" method="post">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Mã SP</th>
                                <th>Tên SP</th>
                                <th>Thương hiệu</th>
                                <th>Giá</th>
                                <th>Kích thước</th>
                                <th>Thông tin</th>
                                <th>Ảnh</th>
                                <th>Thao tác</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${lstProduct}" var="item">
                        <tr>
                            <td>${item.getMaSP()}</td>
                            <input type="hidden" value="${item.getMaSP()}" name="id">
                            <td>${item.getTenSP()}</td>
                            <td>${item.getType()}</td>
                            <td>${item.getGia()}</td>
                            <td>${item.getKichthuoc()}</td>
                            <td>${item.getThongtinSP()}</td>
                            <td><img class="card-img-top" src="images/${item.getAnhSP()}" alt=""></td>

                            <td colspan="2"><a class="" href="suasanpham.jsp">Sửa</a>
                                <input type="submit" value="Xóa" name="delete">
                            </td>
                        </c:forEach>
                        </tr>      
                        <tr>
                            <td><a class="" href="themsanpham.jsp">Thêm mới</a></td>
                        </tr>

                        </tbody>
                    </table>
                </form>
            </div>
            <!-- /.container -->

            <footer class="py-5 bg-dark">
                <div class="container">
                    <p class="m-0 text-center text-white">Copyright &copy; SoccerShoes.vn</p>
                </div>
                <!-- /.container -->
            </footer>

            <!-- Bootstrap core JavaScript -->
            <script src="vendor/jquery/jquery.min.js"></script>
            <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>

</html>

