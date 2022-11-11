

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

            <!-- Page Content -->
            <div class="container">

                <div class="row">

                    <div class="col-lg-3">
                        <h1 class="my-4">VIN Shoes</h1>

                    </div>
                    <!-- /.col-lg-3 -->

                    <div class="col-lg-9">
                        <form action="CartController" method="get">
                            <c:forEach items="${lstProduct}" var="item">
                                <div class="card mt-4">
                                    <img class="card-img-top img-fluid" src="images/${item.getAnhSP()}" alt="">
                                    <input type="hidden" value="${item.getAnhSP()}" name="anhsp">
                                    <div class="card-body">
                                        <h3 class="card-title">${item.getTenSP()} - ${item.getMaSP()}</h3>
                                        <input type="hidden" value="${item.getTenSP()}" name="tensp">
                                        <input type="hidden" value="${item.getMaSP()}" name="masp">
                                        <h4>$${item.getGia()}</h4>
                                        <input type="hidden" value="${item.getGia()}" name="gia">
                                        <span class="text-warning">&#9733; &#9733; &#9733; &#9733; &#9734;</span>
                                        Size<input type="text" name="size" style="width:  20%">
                                        Số lượng<input type="text" name="soluong" style="width:  20%">
                                    </div>
                                </div>
                                <!-- /.card -->

                                <div class="card card-outline-secondary my-4">
                                    <div class="card-header">
                                        Chi tiết sản phẩm
                                    </div>
                                    <div class="card-body">
                                        <p>${item.getThongtinSP()}</p>
                                    </c:forEach>



                                    <input class="btn-dark"  type="submit" name="themvaogiohang" value="Thêm vào giỏ hàng" />
                                    <p>${mes}</p>
                                    </form>
                                </div>
                            </div>
                            <!-- /.card -->

                    </div>
                    <!-- /.col-lg-9 -->

                </div>

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





