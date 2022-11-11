
<%@page import="Controller.ProductController"%>
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

        <title>Soccer Shoes</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
                        <!-- brand -->
                        <form action="TypeProductController" method="get">
                            <div class="list-group">

                                <input class="btn-outline-dark"  type="submit" name="adidas" value="Adidas" />
                                <input class="btn-outline-dark"  type="submit" name="nike" value="Nike" />

                            </div>
                        </form>



                    </div>
                    <!-- /.col-lg-3 -->

                    <div class="col-lg-9">
                        <br>
                        <!-- Search -->
                        <form action="ProductController" method="post">
                            <input type="text" placeholder="Nhập tên sản phẩm..." name="txtSearch">
                            <button type="submit" name="btnSearch"><i class="fa fa-search"></i></button>
                            &emsp;&emsp;&emsp;&emsp;
                            Giá từ: <input type="text" placeholder="" name="from" style="width:  50px">
                            Đến : <input type="text" placeholder="" name="to" style="width:  50px">$
                            <button type="submit" name="btnSearchGia"><i class="fa fa-search"></i></button>
                            &emsp;&emsp;&emsp;&emsp;
                            <input class="btn-outline-dark"  type="submit" name="asc" value="Giá tăng dần" />
                            <input class="btn-outline-dark"  type="submit" name="desc" value="Giá giảm dần" />
                        </form>


                        <div class="row">

                            <!-- list item -->
                            <c:forEach items="${lstProduct}" var="item">
                                <div class="col-lg-4 col-md-6 mb-4">
                                    <form action="ProductDetailController" method="get">
                                        <div class="card h-100">
                                            <a href="#"><img class="card-img-top" src="images/${item.getAnhSP()}" alt=""></a>
                                            <div class="card-body">
                                                <h4 class="card-title">
                                                    <a href="#">${item.getTenSP()} - ${item.getMaSP()}</a>
                                                    <input type="hidden" name="masp" value="${item.getMaSP()}">
                                                </h4>
                                                <h5>$${item.getGia()}</h5>
                                            </div>
                                            <div class="card-footer">
                                                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>

                                                <input class="btn-dark"  type="submit" name="muahang" value="Mua Hàng" />
                                                </form>
                                            </div>
                                        </div>                                             
                            </div>
                            </c:forEach>

                            <div style="clear: both"> </div>                                                        
                                        <ul class="pagination">
                                            <%
                                                Product p = new Product();
                                                ArrayList<Product> arr = new ArrayList<Product>();
                                                arr = p.getListProduct("", "", "", "", "");
                                                int a, b;
                                                int limit = arr.size() / 9;
                                                if (limit * 9 < arr.size()) {
                                                    limit += 1;
                                                }
                                                for (int i = 1; i <= limit; i++) {
                                                    a = (i - 1) * 9;
                                                    b = i * 9;
                                                    if (b > arr.size()) {
                                                        b = arr.size();
                                                    }
                                            %>
                                            <li><a href="ProductController?start=<%= a%>&end=<%= b%>&sanpham=sanpham"><%=i%> </a></li>
                                                <%
                                                    }
                                                %>
                                        </ul>
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

