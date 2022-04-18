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
                <ul>
                    <li>
                        <a href="#">Đánh giá toàn diện</a>
                        <ul>
                            <li><a href="#">Gan</a></li>
                            <li><a href="#">Tuyến tụy</a></li>
                            <li><a href="#">Tuyến giáp</a></li>
                            <li><a href="#">Thận</a></li>
                            <li><a href="#">Tim</a></li>
                            <li><a href="#">Mạch máu</a></li>
                            <li><a href="#">Máu</a></li>
                            <li><a href="#">Phổi</a></li>
                            <li><a href="#">Cơ quan sinh dục</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">Dinh dưỡng</a>
                    </li>
                    <li>
                        <a href="#">Tâm lý</a>
                    </li>
                    <li>
                        <a href="#">Kết quả</a>
                        <ul>
                            <li><a href="#">Đánh giá toàn diện</a></li>
                            <li><a href="#">Dinh dưỡng</a></li>
                            <li><a href="#">Tâm lý</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <div class="wrapper">
                <div class="title">Đánh giá toàn diện</div>
                <div class="box">
                    <div class="item">
                        <div class="icon">
                            <i class="fa fa-robot"></i>
                        </div>
                        <div class="msg">
                            <p>Question 0 for num 1</p></div>
                    </div>
                </div>
                <div class="option-area" id="radio-area">
                    <div class='radio-options'></div>
                </div>
                <div class="option-area" id="checkbox-area">
                    <div class='checkboxes'></div>
                    <i id="choosing-options-btn" class="fa fa-paper-plane" onclick="postCheckboxOptions()"></i>
                </div>
                <div class="typing-area">

                    <div class="input-field">
                        <input id="typing" type="text" placeholder="Type you message">
                        <i id="send" class="fa fa-paper-plane" aria-hidden="true" onclick="humanMessage()"></i>
                    </div>
                </div>
                <div class="result-btn">
                    <button>Xem kết quả</button>
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
    const radioType = "radioOptions";
    const checkboxType = "checkboxes";
    const oneAnswer = "oneAnswer";
    const numberInput = "number";
    const none = "none";
    const done = "done";

    var questionData = [];
    questionData.push({id: 0, content: 'Question 0 for num 1', nextMsgType: radioType});
    questionData.push({id: 1, content: "Question 1 for num 2", nextMsgType: oneAnswer});
    questionData.push({id: 2, content: "Question 2 for num 3", nextMsgType: oneAnswer});
    questionData.push({id: 3, content: "Question 3 for num 4", nextMsgType: numberInput});
    questionData.push({id: 4, content: "Question 4 for num 5", nextMsgType: checkboxType});
    questionData.push({id: 5, content: "end of this conversation", nextMsgType: done});

    var answerData = [];
    answerData.push({id: 1, content: 'Option 1 for question 0'});
    answerData.push({id: 1, content: 'Option 2 for question 0'});
    answerData.push({id: 2, content: "answer for question 1"});
    answerData.push({id: 3, content: "answer for question 2"});
    answerData.push({id: 4, content: ""});
    answerData.push({
        id: 5,
        content: [{isSpecial: false, checkbox: 'Option 1 for question 4'},
            {isSpecial: true, checkbox: 'Option 2 for question 4'},
            {isSpecial: false, checkbox: 'Option 3 for question 4'}]
    });

    getNextHumanMsg();

    function setHumanMsg(id, type, answerList) {
        var content = null;
        for (let i = 0; i < answerList.length; i++) {
            if (answerList[i].id === id) {
                content = answerList[i].content;
            }
        }
        if (type === radioType) {
            var options = getOptions(answerList, id);
            removeRadioItems();
            for (let item in options) {
                createRadioOption(item, options);
            }
            isRadioOption();
        } else if (type === checkboxType) {
            isCheckboxOption();
            removeCheckboxItems();
            for (let item in content) {
                createCheckboxOption(item, content);
            }
        } else if (type === oneAnswer) {
            isTyping();
            setInputField(content);
        } else if (type === numberInput) {
            isTyping();
        } else if (type === none) {
            isNone();
        } else if (type === done) {
            isDone();
        }
    }

    // function to find duplicates answerList's id and return optionList
    function getOptions(answerList, id) {
        var options = [];
        let counts = {}
        for (let i = 0; i < answerList.length; i++) {
            if (counts[answerList[i].id]) {
                counts[answerList[i].id] += 1
            } else {
                counts[answerList[i].id] = 1
            }
        }
        if (counts[id] >= 2) {
            for (let i = 0; i < answerList.length; i++) {
                if (id === answerList[i].id) {
                    options.push(answerList[i]);
                }
            }
        }
        return options;
    }

    function getNextBotMsgByCheckboxOptions(options) {
        let botMsg = "";
        for (let i = 0; i < answerData.length; i++) {
            if (Array.isArray(answerData[i].content)) {
                var checkboxes = [];
                for (let item in answerData[i].content) {
                    checkboxes.push(answerData[i].content[item].checkbox);
                }
                if (options.every(e => checkboxes.includes(e))) {
                    for (let j = 0; j < questionData.length; j++) {
                        if ((answerData[i].id) === questionData[j].id) {
                            botMessage(questionData[j].content);
                            botMsg = questionData[j].content;
                        }
                    }
                }
            }
        }
        getNextHumanMsg(botMsg);
    }

    function getNextBotMsg(humanMsg) {
        let botMsg = "";
        for (let i = 0; i < answerData.length; i++) {
            if (answerData[i].content === humanMsg) {
                for (let j = 0; j < questionData.length; j++) {
                    if (answerData[i].id === questionData[j].id) {
                        botMessage(questionData[j].content);
                        botMsg = questionData[j].content;
                    }
                }
            } else if (answerData[i].content === "") {
                for (let j = 0; j < questionData.length; j++) {
                    if (questionData[j].content === getLastMsg()) {
                        if ((questionData[j].id) === answerData[i].id) {
                            botMessage(questionData[j].content);
                            botMsg = questionData[j].content;
                        }
                    }
                }
            }
        }
        getNextHumanMsg(botMsg);
    }

    function getLastMsg() {
        let id = 0;
        let botMsg = "";
        for (let i = 0; i < answerData.length; i++) {
            if (document.querySelectorAll('.box .item').item(document.querySelectorAll('.box .item').length - 1).textContent === answerData[i].content) {
                id = answerData[i].id;
            } else {
                if (document.querySelectorAll('.box .item').length > 2) {
                    if (document.querySelectorAll('.box .item').item(document.querySelectorAll('.box .item').length - 3).textContent === answerData[i].content) {
                        id = answerData[i].id + 1;
                    }
                }
            }
        }
        for (let i = 0; i < questionData.length; i++) {
            if (questionData[i].id === id) {
                botMsg = questionData[i].content;
            }
        }
        return botMsg;
    }

    function getNextHumanMsg(botMsg) {
        if (botMsg === undefined) {
            botMsg = document.querySelectorAll('.box .item').item(document.querySelectorAll('.box .item').length - 1).textContent.trim();
        }
        console.log(botMsg)
        var id = 0;
        var type = "";
        for (let i = 0; i < questionData.length; i++) {
            if (questionData[i].content === botMsg) {
                id = questionData[i].id + 1;
                type = questionData[i].nextMsgType;
            }
        }
        console.log(type);
        setHumanMsg(id, type, answerData);
    }

    // functions to hide or exist an answer method
    function removeRollbackBtns() {
        document.querySelectorAll('.item.right')[document.querySelectorAll('.item.right').length - 1].removeChild(document.querySelector('.item.right i'));
    }

    function addRollbackBtn() {
        $('.item.right').prepend($('<i class="fa fa-rotate-left" onclick="rollBackClick()"></i>'));
        for (let i = 0; i < document.querySelectorAll('.item.right').length - 1; i++) {
            document.querySelectorAll('.item.right')[i].removeChild(document.querySelector('.item.right i'));
        }
    }

    function isDone() {
        document.getElementById("checkbox-area").hidden = true;
        document.getElementsByClassName("typing-area")[0].hidden = true;
        document.getElementById("radio-area").hidden = true;
        document.getElementsByClassName("result-btn")[0].hidden = false;
    }

    function isNone() {
        document.getElementById("checkbox-area").hidden = true;
        document.getElementsByClassName("typing-area")[0].hidden = true;
        document.getElementById("radio-area").hidden = true;
        document.getElementsByClassName("result-btn")[0].hidden = true;

    }

    function isTyping() {
        document.getElementById("checkbox-area").hidden = true;
        document.getElementsByClassName("typing-area")[0].hidden = false;
        document.getElementById("radio-area").hidden = true;
        document.getElementsByClassName("result-btn")[0].hidden = true;
    }

    function isRadioOption() {
        document.getElementById("checkbox-area").hidden = true;
        document.getElementsByClassName("typing-area")[0].hidden = true;
        document.getElementById("radio-area").hidden = false;
        document.getElementsByClassName("result-btn")[0].hidden = true;
    }

    function removeRadioItems() {
        for (let j = 0; j < document.querySelectorAll('.radio-options label').length; j++) {
            document.querySelector('.radio-options').removeChild(document.querySelectorAll('.radio-options label')[j]);
        }
    }

    function isCheckboxOption() {
        document.getElementById("checkbox-area").hidden = false;
        document.getElementsByClassName("input-field")[0].hidden = true;
        document.getElementById("radio-area").hidden = true;
        document.getElementsByClassName("result-btn")[0].hidden = true;
    }

    function removeCheckboxItems() {
        for (let j = 0; j < document.querySelectorAll('.checkboxes label').length; j++) {
            document.querySelector('.checkboxes').removeChild(document.querySelectorAll('.checkboxes label')[j]);
        }
    }

    // end functions for answer-method existence

    // function for radio option (users just choose one option to answer)
    function clickRadioOption(text) {
        setTimeout(function () {
            $('.box').append($('<div class="item right">' +
                '<i class="fa fa-rotate-left" onclick="rollBackClick()"></i>' +
                '<div class="msg">' +
                '<p>' + text.replaceAll("`", "'") + '</p>' +
                '</div>' +
                '</div>'));
            getNextBotMsg(text.replaceAll("`", "'"));
        }, 100);
    };

    // create radio option
    function createRadioOption(id, options) {
        setTimeout(function () {
            var text = options[id].content.replaceAll("'", "`");
            $('.radio-options').append($('<label onclick="clickRadioOption(\'' + text + '\')">' + text.replaceAll("`", "'") + '</label>'))
        }, 100);
    }

    // end radio function

    // functions for checkbox options (users can choose many options for 1 answer)
    function postCheckboxOptions() {
        setTimeout(function () {
            removeRollbackBtns();
            let values = [];
            let checkedOptions = document.querySelectorAll('.checkboxes label input[type="checkbox"]:checked');
            for (let j = 0; j < checkedOptions.length; j++) {
                values.push(document.querySelectorAll('.checkboxes label').item(j).textContent)
            }
            $('.box').append($('<div class="item right">' +
                '<i class="fa fa-rotate-left" onclick="rollBackClick()"></i>' +
                '<div class="msg">' +
                '<p>' + values + '</p>' +
                '</div>' +
                '</div>'));
            getNextBotMsgByCheckboxOptions(values);
        }, 100);
    }

    function createCheckboxOption(id, checkboxList) {
        if (checkboxList[id].isSpecial) {
            setTimeout(function () {
                var text = checkboxList[id].checkbox.replaceAll("'", "`");
                $('.checkboxes').append($('<label title="special-option-label" onclick="specialOptionClick()">' + text.replaceAll("`", "'") + '<input type="checkbox" id="special-option"/><span class="mark"></span></label>'))
            }, 100);
        } else {
            setTimeout(function () {
                var text = checkboxList[id].checkbox.replaceAll("'", "`");
                $('.checkboxes').append($('<label onclick="normalOptionClick()">' + text.replaceAll("`", "'") + '<input type="checkbox"/><span class="mark"></span></label>'))
            }, 100);
        }
    }

    // function for special option (if choose this option, users can't choose anymore others)
    function normalOptionClick() {
        document.getElementById("special-option").checked = false;
    }

    function specialOptionClick() {
        let checkedOptions = document.querySelectorAll('.checkboxes label input[type="checkbox"]:checked:not(#special-option)');
        checkedOptions.forEach(checkedBox => {
            checkedBox.checked = false;
        });
    }

    // end checkbox functions

    // functions for send button (users must type something to answer)
    function setInputField(message) {
        document.getElementById("typing").disabled = true;
        if (message != null || message.trim() !== "") {
            document.getElementById("typing").value = message;
        }
    }

    function humanMessage() {
        setTimeout(function () {
            removeRollbackBtns();
            let msg = document.getElementById("typing").value;
            if (msg !== "") {
                $('.box').append($('<div class="item right">' +
                    '<i class="fa fa-rotate-left" onclick="rollBackClick()"></i>' +
                    '<div class="msg">' +
                    '<p>' + msg + '</p>' +
                    '</div>' +
                    '</div>'));
                document.getElementById("typing").value = null;
                document.getElementById("typing").disabled = false;
                getNextBotMsg(msg);
            }
        }, 100);
    };

    function botMessage(bot) {
        setTimeout(function () {
            $('.box').append($('<div class="item">' +
                '<div class="icon">' +
                '<i class="fa fa-robot"></i>' +
                '</div>' +
                '<div class="msg">' +
                '<p>' + bot + '</p>' +
                '</div>' +
                '</div>'));
            window.scrollTo(0, document.body.scrollHeight);
        }, 200);
    };
    // end typing functions

    // function for roll-back button (delete the last answer to choose another one)
    function rollBackClick() {
        // document.querySelectorAll('.item.right')[document.querySelectorAll('.item.right').length - 1].add(document.querySelector('.item.right i'));
        document.querySelector('.box').removeChild(document.querySelectorAll('.item.right')[document.querySelectorAll('.item.right').length - 1])
        document.querySelector('.box').removeChild(document.querySelectorAll('.item')[document.querySelectorAll('.item').length - 1])
        removeRadioItems();
        removeCheckboxItems();
        addRollbackBtn();
        getNextHumanMsg();
    }

    // $(document).keypress(function (e) {
    //     if (e.keyCode == 13) {
    //         humanMessage();
    //     }
    // });
</script>
</body>
</html>
