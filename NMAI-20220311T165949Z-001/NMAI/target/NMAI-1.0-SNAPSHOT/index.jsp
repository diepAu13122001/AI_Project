<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>s
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link
            rel="shortcut icon"
            type="image/x-icon"
    />
    <title>Admin</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="HomePage/indexx.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <style>
        .header {
            width: 82%;
        }
        @media only screen and (max-width: 1024px){
            .header {
                width: 100%;
            }
        }
        /*@media only screen and (min-width: px){*/
        /*    .header {*/
        /*        width: 100%;*/
        /*    }*/
        /*}*/
    </style>
</head>
<body>
<!-- ======== sidebar-nav start =========== -->
<aside class="sidebar-nav-wrapper text-center">
    <div class="navbar-logo me-2">
        <h5 class="fs-4" style="font-family: Corbel"><img
                src="https://iweb.tatthanh.com.vn/pic/3/blog/images/image(751).png" style="width: 90px; height: 60px;"
                alt="Nnail">LDGrils</h5>
    </div>
    <nav class="sidebar-nav">
        <ul>
            <span class="divider"><hr/></span>
            <li class="nav-item nav-home">
                <a
                        href="index.jsp"
                >
                    <i class="material-icons text-danger">home</i>
                    <span class="text ms-4"> Trang chủ</span>
                </a>
            </li>
            <span class="divider"><hr/></span>
            <li class="nav-item nav-home">
                <a
                        href="Cards/cars.html"
                >
                    <i class="bi bi-heart-pulse text-danger"></i>
                    <span class="text ms-1">Workout And Eatting</span>
                </a>
            </li>
            <span class="divider"><hr/></span>
            <li class="nav-item nav-home">
                <a
                        href="AboutUs/index.html"
                >
                    <i class="bi bi-person-hearts text-danger"></i>
                    <span class="text mx-3 ms-4">About Us</span>
                </a>
            </li>
            <span class="divider"><hr/></span>
            <li class="nav-item nav-home">
                <a
                        href="ChatBot"
                >
                    <i class="bi bi-chat-heart-fill text-danger"></i>
                    <span class="text mx-3 ms-4">Chatbot</span>
                </a>
            </li>
            <span class="divider"><hr/></span>
            </li>
            <li class="nav-item nav-home">
                <a
                        href="Account/index.html"
                >
                    <i class="bi bi-person-bounding-box text-danger"></i>
                    <span class="text mx-3 ms-4">Tài khoản</span>
                </a>
            </li>
        </ul>
    </nav>
</aside>

<main class="main-wrapper">
    <header class="header position-fixed" style="top: 0px; z-index: 99;box-shadow: 3px 1px 3px 1px  #ebebd5;">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-5 col-md-5 col-6">
                    <div class="header-left d-flex align-items-center">
                        <div class="menu-toggle-btn mr-20">
                            <button
                                    id="menu-toggle"
                                    class="main-btn bg-danger-500 btn-hover"
                            >
                                <i class="material-icons text-white">subject</i>
                            </button>
                        </div>
                        <div class="header-search d-none d-md-flex">
                            <form action="#">
                                <input type="text" placeholder="Search..."/>
                                <button><i class="lni lni-search-alt"></i></button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-lg-7 col-md-7 col-6">
                    <div class="header-right">
                        <!-- profile start -->
                        <div class="profile-box ml-15">
                            <button
                                    class="dropdown-toggle bg-transparent border-0"
                                    type="button"
                                    id="profile"
                                    data-bs-toggle="dropdown"
                                    aria-expanded="false"
                            >
                                <div class="profile-info">
                                    <div class="info">
                                        <h6>Daisy Thi</h6>
                                        <div class="image">
                                            <img
                                                    src="https://vuonmattroi.com/wp-content/uploads/2021/05/cuc-hoa-mi-co-ve-dep-mong-manh-yeu-ot-nhung-suc-song-manh-liet.jpg"
                                                    alt=""
                                            />
                                            <span class="status"></span>
                                        </div>
                                    </div>
                                </div>
                                <i class="lni lni-chevron-down"></i>
                            </button>
                            <ul
                                    class="dropdown-menu dropdown-menu-end"
                                    aria-labelledby="profile"
                            >
                                <li>
                                    <a href="#0"> <i class="lni lni-cog"></i> Settings </a>
                                </li>
                                <li>
                                    <a href="#0"> <i class="lni lni-exit"></i> Sign Out </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!-- ========== header end ========== -->

    <!-- ========== section start ========== -->
    <div class="body" style="margin-top:150px">
        <section class="section mt-5">
            <div class="container-fluid mt-5">
                <h2>Số liệu</h2>
                <div class="row mt-3" id="cart">
                    <div class="col-xl-3 col-lg-4 col-sm-6">
                        <div class="icon-card mb-30">
                            <div class="icon purple">
                                <i class="material-icons">local_florist</i>
                            </div>
                            <div class="content">
                                <h6 class="mb-10">Ngày kinh sắp tới</h6>
                                <h3 class="text-bold mb-10">4 ngày nữa</h3>
                                <p class="text-sm text-success">
                                    <span class="text-gray">Tính từ 28 ngày trước</span>
                                </p>
                            </div>
                        </div>
                        <!-- End Icon Cart -->
                    </div>
                    <!-- End Col -->
                    <div class="col-xl-3 col-lg-4 col-sm-6">
                        <div class="icon-card mb-30">
                            <div class="icon success">
                                <i class="material-icons">local_play</i>
                            </div>
                            <div class="content">
                                <h6 class="mb-10">kcal còn lại</h6>
                                <h3 class="text-bold mb-10">678 calories</h3>
                                <p class="text-sm text-success">
                                    <i class="lni lni-arrow-up"></i> +278
                                    <span class="text-gray">calories còn lại</span>
                                </p>
                            </div>
                        </div>
                        <!-- End Icon Cart -->
                    </div>
                    <!-- End Col -->
                    <div class="col-xl-3 col-lg-4 col-sm-6">
                        <div class="icon-card mb-30">
                            <div class="icon primary">
                                <i class="material-icons">card_membership</i>
                            </div>
                            <div class="content">
                                <h6 class="mb-10">Thời gian tập</h6>
                                <h3 class="text-bold mb-10">45 phút</h3>
                                <p class="text-sm text-danger">
                                    <i class="lni lni-arrow-down"></i>90 phút
                                    <span class="text-gray">Đạt 40%</span>
                                </p>
                            </div>
                        </div>
                        <!-- End Icon Cart -->
                    </div>
                    <!-- End Col -->
                    <div class="col-xl-3 col-lg-4 col-sm-6">
                        <div class="icon-card mb-30">
                            <div class="icon orange">
                                <i class="material-icons">account_box</i>
                            </div>
                            <div class="content">
                                <h6 class="mb-10">BMI</h6>
                                <h3 class="text-bold mb-10">16.7</h3>
                                <p class="text-sm text-danger">
                                    <i class="lni lni-arrow-down"></i>
                                    <span class="text-gray"> So với 30 ngày trước</span>
                                </p>
                            </div>
                        </div>
                        <!-- End Icon Cart -->
                    </div>
                    <!-- End Col -->
                </div>
                <!-- End Row -->
                <div class="card-style mb-30">
                    <h5>Lượng calo nạp qua từng giờ trong ngày</h5>
                    <canvas id="myChart1" class="w-100 mt-5"></canvas>
                </div>
                <div class="row">
                    <div class="col-lg-7">
                        <div class="card-style cricle-style mb-30">
                            <h5>biểu đồ theo dõi định dưỡng (theo ngày).</h5>
                            <canvas id="myChart2" class="w-100"></canvas>
                        </div>
                    </div>
                    <!-- End Col -->
                    <div class="col-lg-5">
                        <div class="card-style cricle-style mb-30">
                            <h5>Biểu đồ...</h5>
                            <canvas id="myChart3" class="w-100 mt-5"></canvas>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-5">
                        <div class="card-style documen-style mb-30">
                            <div id="datepicker"></div>
                        </div>
                    </div>
                    <!-- End Col -->
                    <div class="col-lg-7">
                        <div class="card-style mb-30 documen-style">
                            <h5>Top 10 sản phẩm bán chạy nhất</h5>
                            <table class="table">
                                <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">First</th>
                                    <th scope="col">Last</th>
                                    <th scope="col">Handle</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <th scope="row">1</th>
                                    <td>Mark</td>
                                    <td>Otto</td>
                                    <td>@mdo</td>
                                </tr>
                                <tr>
                                    <th scope="row">2</th>
                                    <td>Jacob</td>
                                    <td>Thornton</td>
                                    <td>@fat</td>
                                </tr>
                                <tr>
                                    <th scope="row">3</th>
                                    <td colspan="2">Larry the Bird</td>
                                    <td>@twitter</td>
                                </tr>
                                <tr>
                                    <th scope="row">4</th>
                                    <td colspan="2">Larry the Bird</td>
                                    <td>@twitter</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
    <!-- ========== section end ========== -->

    <!-- ========== footer start =========== -->
    <footer class="footer">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-6 order-last order-md-first">
                    <div class="copyright text-center text-md-start">
                        <p class="text-sm">
                            Designed and Developed by
                            <a
                                    href="https://plainadmin.com"
                                    rel="nofollow"
                                    target="_blank"
                            >
                                PlainAdmin
                            </a>
                        </p>
                    </div>
                </div>
                <!-- end col-->
                <div class="col-md-6">
                    <div
                            class="
                  terms
                  d-flex
                  justify-content-center justify-content-md-end
                "
                    >
                        <a href="#0" class="text-sm">Term & Conditions</a>
                        <a href="#0" class="text-sm ml-15">Privacy & Policy</a>
                    </div>
                </div>
            </div>
            <!-- end row -->
        </div>
        <!-- end container -->
    </footer>
    <!-- ========== footer end =========== -->
</main>
</body>
<script src="HomePage/main.js"></script>
<script src="HomePage/index.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>
<script>
    var xValues = [100, 200, 300, 400, 500, 600, 700, 800, 900, 1000];

    new Chart("myChart1", {
        type: "line",
        data: {
            labels: xValues,
            datasets: [{
                data: [860, 1140, 1060, 1060, 1070, 1110, 1330, 2210, 7830, 2478],
                borderColor: "red",
                fill: false
            },]
        },
        options: {
            legend: {display: false}
        }
    });
    var xValuess = ["Italy", "France", "Spain", "USA", "Argentina"];
    var yValues = [55, 49, 44, 24, 15];
    var barColors = [
        "#b91d47",
        "#00aba9",
        "#2b5797",
        "#e8c3b9",
        "#1e7145"
    ];

    new Chart("myChart2", {
        type: "doughnut",
        data: {
            labels: xValuess,
            datasets: [{
                backgroundColor: barColors,
                data: yValues
            }]
        },
        options: {
            title: {
                display: true,
                text: "World Wide Wine Production 2018"
            }
        }
    });

    new Chart("myChart3", {
        type: "pie",
        data: {
            labels: xValuess,
            datasets: [{
                backgroundColor: barColors,
                data: yValues
            }]
        },
        options: {
            title: {
                display: true,
                text: "World Wide Wine Production 2018"
            }
        }
    });
    $(function () {
        $("#datepicker").datepicker({minDate: "-3M -15D", maxDate: "+3M +15D", changeMonth: true, changeYear: true});
    });
</script>
</html>