<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link
            rel="shortcut icon"
            type="image/x-icon"
    />
    <title>Accessory</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="HomePage/indexx.css">
    <script src="HomePage/main.js"></script>
    <link rel="stylesheet" href="HomePage/indexx.css">
    <script src="HomePage/index.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">

    <style>
        @import url('https://fonts.googleapis.com/css2?family=Barlow:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,100;0,200;0,300;1,100;1,200&display=swap');

        .header {
            width: 82%;
        }

        @media only screen and (max-width: 1024px) {
            .header {
                width: 100%;
            }
        }

        body {
            font-family: "Barlow", sans-serif;
            background-color: #f4f7f6;
            margin-top: 20px;
        }

        .list {
            position: marker;
            width: 20%;
        }

        .wrapper {
            width: 80%;
        }

        .wrapper .title {
            background: #434651;
            color: white;
            line-height: 2.5;
            border-radius: 5px 5px 0 0;
            text-align: center;
            font-size: 20px;
        }

        .wrapper .box {
            border: 1px solid #efefef;
            padding: 10px 15px;
            min-height: 400px;
            max-height: 400px;
        }

        .wrapper .box .item {
            display: flex;
            float: left;
            margin-top: 10px;
            margin-right: 200px;
        }

        .wrapper .box .item .icon {
            background: #434651;
            color: white;
            width: 40px;
            height: 40px;
            line-height: 40px;
            border-radius: 50%;
        }

        .wrapper .box .item .icon i {
            margin: 10px 10px;
        }

        .wrapper .box .item .msg {
            background: rgb(213 -1 0 / 0.5);
            color: white;
            border-radius: 10px;
            margin-left: 10px;
            margin-right: 50px;
        }

        .wrapper .box .item .msg p {
            padding: 10px 20px 10px 20px;
        }

        .wrapper .box .item.right {
            float: right;
            margin-left: 50%;
            margin-right: -65px;
        }

        .wrapper .box .item.right .msg {
            background: #efefef;
            color: #333;
        }

        .wrapper .typing-area {
            width: 100%;
            height: 50px;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 10px;
        }

        .wrapper .typing-area .input-field {
            width: 100%;
            position: relative;
            top: 20px;
        }

        .wrapper .typing-area .input-field input {
            font-family: "Barlow", sans-serif;
            width: 90%;
            padding: 10px;
            border: 1px solid transparent;
            border-radius: 3px;
            outline: none;
            transition: 0.3s all ease;
        }

        .wrapper .typing-area .input-field input:focus {
            border-color: rgb(213 -1 0 / 0.5);
        }

        .wrapper .typing-area .input-field input:valid ~ i {
            opacity: 1;
            pointer-events: auto;
        }

        .wrapper .typing-area .input-field i {
            font-size: 20px;
            background: transparent;
            color: lightgray;
            padding: 5px 10px;
            cursor: pointer;
            transition: 0.3s all ease;
        }

        .wrapper .typing-area .input-field i:hover {
            color: rgb(213 -1 0 / 0.5);
        }

        .people-list .chat-list li {
            padding: 10px 15px;
            list-style: none;
            border-radius: 3px
        }

        .people-list .chat-list li:hover {
            background: #efefef;
            cursor: pointer
        }

        .people-list .chat-list li.active {
            background: #efefef
        }

        .people-list .chat-list img {
            width: 45px;
            border-radius: 50%
        }

        .people-list img {
            float: left;
            border-radius: 50%
        }

        .chat .chat-header img {
            float: left;
            border-radius: 40px;
            width: 40px
        }

        .chat .chat-history ul {
            padding: 0
        }

        .chat .chat-history ul li {
            list-style: none;
            margin-bottom: 30px
        }

        .chat .chat-history ul li:last-child {
            margin-bottom: 0
        }

        .chat .chat-history .message-data img {
            border-radius: 40px;
            width: 40px
        }

        .clearfix:after {
            visibility: hidden;
            display: block;
            font-size: 0;
            content: " ";
            clear: both;
            height: 0
        }

        li {
            list-style: none;
            cursor: pointer;
        }

        ul {
            padding-left: 20px;
        }

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
                        href="ChatBot.jsp"
                >
                    <i class="bi bi-chat-heart-fill text-danger"></i>
                    <span class="text mx-3 ms-4">Chatbox</span>
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
    <div class="container py-5">
        <div class="row clearfix" style="margin-top:80px">
            <div class="list">
                <h3>Các phần cần kiểm tra </h3>
                <li>1. Đánh giá toàn diện
                    <ul>Gan</ul>
                    <ul>Tim</ul>
                    <ul>Máu</ul>
                    <ul>Mạch máu</ul>
                    <ul>Thận</ul>
                    <ul>Phổi</ul>
                    <ul>Gan</ul>
                    <ul>Gan</ul>
                    <ul>Gan</ul>
                    <ul>Gan</ul>
                    <ul>Gan</ul>
                </li>
                <li>2. Dinh dưỡng</li>
                <li>3. Tâm lý</li>
            </div>
            <div class="wrapper">
                <div class="title">Kiểm tra tổng quát</div>
                <div class="box">
                    <c:forEach items="${bots}" var="i">
                        <div class="item">
                            <div class="icon">
                                <i class="fa fa-robot"></i>
                            </div>
                            <div class="msg">
                                <p>${i}</p>
                            </div>
                        </div>
                        <c:forEach items="${humans}" var="i">
                            <div class="item right">
                                <div class="msg">
                                    <p>${i}</p>
                                </div>
                            </div>

                        </c:forEach>
                    </c:forEach>
                    <div class="item right">
                        <div class="msg">
                            <p>Chào bạn, có thể giúp gì cho bạn? Đây là một câu nói dài, nhưng mminhd khồng bik viết gì
                                cho dâif, nên không thể viết dài. Mong là không dài quá sự cho phép</p>
                        </div>
                    </div>
                    <div class="item right">
                        <div class="msg">
                            <p>Chào, tôi muốn hỏi chút chuyện ... </p>
                        </div>
                    </div>
                    <div class="item">
                        <div class="icon">
                            <i class="fa fa-robot"></i>
                        </div>
                        <div class="msg">
                            <p id="bot">Chào bạn, có thể giúp gì cho bạn? Đây là một câu nói dài, nhưng mminhd khồng bik
                                viết gì
                                cho dâif, nên không thể viết dài. Mong là không dài quá sự cho phép</p>
                        </div>
                    </div>
                </div>
                <div class="typing-area">
                    <div class="input-field">
                        <input id="typing" type="text" placeholder="Type you message">
                        <i id="send" class="fa fa-paper-plane" aria-hidden="true" onclick="humanMessage()"></i>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>

<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script>
    var msg = document.getElementById("typing");

    // for human messages
    function setInputField(message) {
            msg.value = message;
            msg.disabled = true;
            // $('.box').append($('<div class="item right">' +
            //     '<div class="msg">' +
            //     '<p>' + msg.value + '</p>' +
            //     '</div>' +
            //     '</div>'));
            // msg.value = null;
    };
    setInputField("how can I got you?");
    function humanMessage() {
        setTimeout(function () {
            if (msg.value.trim() != "") {
                $('.box').append($('<div class="item right">' +
                    '<div class="msg">' +
                    '<p>' + msg.value + '</p>' +
                    '</div>' +
                    '</div>'));
                msg.value = null;
                botMessage();
            }
        }, 100);
    };

    let i = 0;
    var Fake = [
        'Hi there, I\'m Jesse and you?',
        'Nice to meet you',
        'How are you?',
        'Not too bad, thanks',
        'What do you do?',
        'That\'s awesome',
        'Codepen is a nice place to stay',
        'I think you\'re a nice person',
        'Why do you think that?',
        'Can you explain?',
        'Anyway I\'ve gotta go now',
        'It was a pleasure chat with you',
        'Time to make a new codepen',
        'Bye',
        ':)'
    ]

    function botMessage() {
        setTimeout(function () {
            $('.box').append($('<div class="item">' +
                '<div class="icon">' +
                '<i class="fa fa-robot"></i>' +
                '</div>' +
                '<div class="msg">' +
                '<p>' + Fake[i] + '</p>' +
                '</div>' +
                '</div>'));
            i++;
            if (i == 13) i = 0;
        }, 1000 + (Math.random() * 20) * 100);
    };

    $(document).keypress(function (e) {
        if (e.keyCode == 13) {
            humanMessage();
        }
    });

    function getPresentTime() {
        const d = new Date();
        const presentTime = document.querySelectorAll("#presentTime");
        const input = document.getElementById("typing");
        input.value = "fggfd";
        input.readOnly = true;
        const bot = document.getElementById("bot");
        input.addEventListener("click", function () {
            bot.value = input.value;
            window.location.reload();
            console.log(bot.value);
        })
        for (let i = 0; i < presentTime.length; i++) {
            presentTime[i].innerHTML = changeDate(d.getDay()) + " " + d.getHours() + " : " + d.getMinutes();
            console.log(presentTime[i].value);
        }
    }

    // getPresentTime();

    function changeDate(date) {
        if (date == 0) {
            return "Sun"
        } else if (date == 1) {
            return "Mon"
        } else if (date == 2) {
            return "Tue"
        } else if (date == 3) {
            return "Wed"
        } else if (date == 4) {
            return "Thu"
        } else if (date == 5) {
            return "Fri"
        } else if (date == 6) {
            return "Sat"
        }


    }
</script>
</body>
</html>
