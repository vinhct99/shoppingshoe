

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

                    <a class="navbar-brand" href="trangchu.jsp">Soccershoes.vn</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarResponsive">
                        <ul class="navbar-nav ml-auto">

                            <li class="nav-item active">
                                <input class="btn-dark"  type="submit" name="trangchu" value="Trang chủ" />
                            </li>
                            </form>
                            <form action="ProductController" method="post">
                                <li class="nav-item">
                                    <input class="btn-dark"  type="submit" name="sanpham" value="Sản Phẩm" />
                                </li>
                            </form>
                            <form action="CartController" method="post">
                                <li class="nav-item">
                                    <input class="btn-dark"  type="submit" name="giohang" value="Giỏ Hàng" />
                                </li>
                            </form>
                            <form action="LoginController" method="post">
                                <li class="nav-item">
                                    <input class="btn-dark"  type="submit" name="lg" value="Đăng nhập" />
                                </li>
                            </form>
                        </ul>
                    </div>
                </div>
            </nav>
            <br><br>
            <!-- Page Content -->
            <div class="container">


                <div class="row">

                    <div class="col-lg-4">

                        <h1 class="my-4">VIN Shoes</h1>
                        <div class="list-group">


                        </div>

                    </div>
                    <!-- /.col-lg-3 -->

                    <div class="col-lg-4">
                        <form action="ManageController" method="post">
                            <table class="table table-bordered">
                                <tr>

                                    <td>Mã SP <br><input type="text" name="maSP" style="width: 100%"></td>
                                </tr>
                                <tr>

                                    <td>Tên SP <br><input type="text" name="tenSP" style="width: 100%"></td>
                                </tr>
                                <tr>

                                    <td>Thương hiệu <br><input type="text" name="type" style="width: 100%"></td>
                                </tr>
                                <tr>

                                    <td>Giá <br><input type="text" name="gia" style="width: 100%"></td>
                                </tr>
                                <tr>

                                    <td>Kích thước <br><input type="text" name="kichthuoc" style="width: 100%"></td>
                                </tr>
                                <tr>

                                    <td>Thông tin sản phẩm <br><input type="text" name="thongtinSP" style="width: 100%"></td>
                                </tr>
                                <tr>

                                    <td>Link ảnh <br><input type="text" name="anhSP" style="width: 100%"></td>
                                </tr>


                                <tr>
                                    <td><input class="btn-dark"  type="submit" name="update" value="Sửa" /></td>
                                </tr>

                            </table>

                            </form>

                    </div>  



                    


                </div>
                <!-- /.col-lg-4 -->

            </div>
            <!-- /.row -->

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

