package com.example.nmai;

import com.example.nmai.pages.ChatBot;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public ArrayList<ArrayList<String>> intro() {
        ArrayList<String> strings1 = new ArrayList<>();
        ArrayList<String> strings2 = new ArrayList<>();
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<ChatBot> introData = new ArrayList<>();
        String bot1 = "Xin chào, Chào mừng bạn đến với phần Kiểm tra sức khỏe! Rất vui được gặp bạn.";
        String human1 = "Xin Chào tôi cũng rất vui được gặp bạn.";

        introData.add(new ChatBot(bot1, human1));
        String bot2 = "Kiểm tra sức khỏe được xây dựng dựa trên những nghiên cứu và chỉ dẫn dành cho người " +
                "trưởng thành, do đó ứng dụng này chỉ thích hợp cho người dùng từ 18 tuổi trở lên, " +
                "ngoại trừ phụ nữ có thai. Xin vui lòng lưu ý rằng nguy cơ mắc bệnhXin vui lòng lưu ý " +
                "rằng nguy cơ mắc bệnh cũng như hướng dẫn về dinh dưỡng và hoạt động chi được tính " +
                "dựa theo một số yếu tố và dữ liệu chọn lọc từ nhóm dân cư trung bình. " +
                "Do đó, người dùng mắc bệnh mãn tính hoặc bị khuyết tật có thể có những nhu cầu" +
                " và nguy cơ mắc bệnh khác so với kết quả được đưa ra. Những nguy cơ mắc bệnh được tính toán " +
                "dựa trên giá thiết rằng những nhân tố rủi ro và lối sống của người dùng sẽ giữ nguyên trạng " +
                "trong tương lai. Những đánh giá này chỉ mang tính chất tham khảo, không phải là chỉ định của " +
                "bác sĩ hay chẩn đoán bệnh. Điều này cũng không thể thay thế bác sĩ hay những chỉ định của " +
                "bác sĩ dành cho bạn. Nếu bạn có thắc mắc về bất kỳ thông tin nào mà mình nhận được, xin vui lòng " +
                "tham vấn bác sĩ.";
        String human2 = understood;
        introData.add(new ChatBot(bot2, human2));
        String bot3 = "Kiểm Tra Sức Khoẻ giúp bạn hiểu rõ những tác động của lối sống thường nhật đến sức khỏe của mình trong tương lai. " +
                "Chúng ta sẽ cùng nhau đi qua những câu hỏi trong 3 mục, bao quát tất cả các khía cạnh sức khỏe của bạn. Sau đó, " +
                "kết quả sẽ được thể hiện qua Bản Song Sinh Điện Tử để bạn có thể dễ dàng theo dõi.";
        String human3 = great;
        introData.add(new ChatBot(bot3, human3));
        String bot4 = "Tôi sẽ là người cùng đồng hành với bạn trong suốt quá trình này. Nhưng trước khi chúng ta bắt đầu, " +
                "tôi có một điều cần thổ lộ.... Tôi là một chatbot.";
        String human4 = "Chatbot là gì?"; // + human 5 is an option
        String bot5 = "Chatbot là một chương trình máy tính thông minh có thể hiểu và phản hồi phù hợp với những gì bạn nói ... giống như trò chuyện với một người bạn trên một ứng dụng nhắn tin tức thời.";
        String human5 = understood;
        String bot6 = "Tôi đã được tạo ra từ lòng thương yêu của các bác sĩ để đánh giá sức khỏe của bạn và cung cấp thông tin về những nguy cơ mắc bệnh tiềm ẩn cũng như những điều cần làm tiếp theo.";
        String bot7 = "Tôi cũng được dạy cách coi trọng quyền riêng tư, vì vậy thông tin mà bạn cung cấp sẽ được bảo mật theo đúng chính sách quyền riêng tư của chúng tôi.";
        String bot8 = "Nếu bạn muốn biết thêm về việc tôi đã được tạo ra như thế nào, bao gồm cả cách tôi bảo vệ dữ liệu về bạn, bạn có thể xem trên trang web của Babylon: https://www.babylonhealth.com/.";
        String bot9 = "Bạn đã sẵn sàng để hoàn thành hồ sơ của mình chưa?";
        String human6 = readyForGo;

        return list;
    }

    public void targetOfTest() {
        String bot1 = "Bây giờ chúng ta hãy bắt đầu với câu hỏi đầu tiên nhé. Lý do chính khiến bạn muốn thực hiện phần Kiểm Tra Sức Khoẻ là gì?";
        String human1 = "Tôi muốn có những thói quen lãnh mạnh hơn";
        String human2 = "Tôi muốn trở nên năng động hơn";
        String human3 = "Tôi muốn giảm cân";
        String human4 = "Tôi muốn cảm thấy bớt căng thẳng";
        String human5 = "Tôi muốn bớt lo âu";
        String human6 = "Tôi đang cảm thấy phiền muộn";
        String human7 = "Tôi muốn biết xem mình có nguy cơ bị mắc bệnh gì nghiêm trọng không?";
        String human8 = "Tôi lo lắng về một chứng bệnh mà một thành viên trong gia đình mắc phải.";
        String bot2 = "Tuyệt vời, vậy chúng ta hãy cùng tìm hiểu xem liệu có cách đơn giản nào mà bạn có thể làm để trở nên khoẻ mạnh hơn không nhé.";
    }

    public void getBMI() {
        String bot1 = "Bây giờ chúng ta sẽ đi qua một số thông tin cơ bản về bạn...";
        String bot2 = "Hãy cho tôi biết độ tuổi của bạn? Bạn chỉ cần gõ độ tuổi của mình vào ô sau...";
        String human1 = "";
        String bot3 = "Tiếp theo, chúng ta sẽ cùng nhau tình chỉ số khối cơ thể (BMI) của bạn nhé. Đây là một cách đơn giản để kiểm tra xem cân nặng có phù hợp với chiều cao của bạn hay không";
        String bot4 = "Trước tiên, hãy cho tôi biết bạn cao bao nhiêu? Bạn có thể nhập câu trả lời như thế này: 178cm";
        String bot5 = "Bạn đừng quên đơn vị đo lường nhé cm";
        String human2 = "";
        String bot6 = "Và bạn nặng bao nhiêu cân? Bạn có thể gõ câu trả lời như thế này: 75kg";
        String bot7 = "cũng đừng quên đơn vị đo lường nhé: kg";
        String human3 = "";
        String bot8 = "Cảm ơn bạn, tôi đã thêm chỉ số khối cơ thể (BMI) vào kết quả của bạn";
    }
}
