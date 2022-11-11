
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
                       <h1 class="my-4">VIN Soccer</h1>
                        <div class="list-group">
                        </div>

                    </div>
                    <!-- /.col-lg-3 -->

                    <div class="col-lg-9">

                        <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                            </ol>
                            <div class="carousel-inner" role="listbox">
                                <div class="carousel-item active">
                                    <img class="d-block img-fluid" src="images/store-1.jpg"  alt="First slide">
                                </div>
                                <div class="carousel-item">
                                    <img class="d-block img-fluid" src="images/store-5.jpg" alt="Second slide">
                                </div>
                                <div class="carousel-item">
                                    <img class="d-block img-fluid" src="images/store-6.jpg" alt="Third slide">
                                </div>
                            </div>
                            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="sr-only">Previous</span>
                            </a>
                            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="sr-only">Next</span>
                            </a>
                        </div>

                        <div class="row">
                            <p>SoccerShoes.vn – Website bán lẻ giày bóng đá Online
                                Mua hàng trực tuyến mang lại sự tiện lợi, chủ động, lựa chọn đa dạng, với các dịch vụ hỗ trợ mua hàng, bán hàng, thanh toán an toàn, giao hàng chuyên nghiệp.
                                Với phương châm “Mong 1 người đến vạn lần, hơn vạn người đến 1 lần”, SoccerShoes.vn không ngừng nỗ lực, cải tiến đáp ứng nhu cầu mua giày đá bóng của khách hàng.
                                Các sản phẩm được đăng trên SoccerShoes.vn luôn được mô tả chân thực về chất lượng mẫu mã. Đảm bảo quý khách hàng nhận được giá trị lớn nhất (đôi giày tốt nhất) khi đặt mua giày tại shop.</p>

                        </div>
                        <!-- /.row -->

                    </div>
                    <!-- /.col-lg-9 -->

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

