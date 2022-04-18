package com.example.nmai.Data;

import com.example.nmai.pages.*;

import java.util.ArrayList;

public class DataOfChatBot {
    private static DataOfChatBot instance;

    // string[] always has 2 elements: one is botMsgList and one for humanMsgList
    private Object[] introductionList;
    private Object[] getTargets;
    private Object[] getBMI;
    private Object[] getPersonalInformation;
    private Object[] psychoTest;
    private Object[] nutrientTest;
    private Object[] bloodTest;
    private Object[] bloodVesselTest;
    private Object[] boneTest;
    private Object[] bowelTest;
    private Object[] brainTest;
    private Object[] heartTest;
    private Object[] jointTest;
    private Object[] kidneyTest; // than
    private Object[] liverTest; // gan
    private Object[] lungTest;
    private Object[] pancreasTest; // tuyen tuy
    private Object[] genitalTest; // co quan sinh duc
    private Object[] skinTest;


    private final static Object understood = "Tôi hiểu rồi, chúng ta tiếp tục thôi.";
    private final static Object great = "Vậy thì tốt quá!";
    private final static Object readyForGo = "Dĩ nhiên rồi, chúng ta hãy tiếp tục thôi!";

    public DataOfChatBot() {
        setIntroductionList();
        setGetTargets();
        setGetBMI();
        setGetPersonalInformation();
        setPsychoTest();
        setNutrientTest();
        setBloodTest();
        setBloodVesselTest();
        setBoneTest();
        setBowelTest();
        setBrainTest();
        setHeartTest();
        setJointTest();
        setKidneyTest();
        setLiverTest();
        setLungTest();
        setPancreasTest();
        setGenitalTest();
        setSkinTest();
    }

    public static DataOfChatBot getInstance() {
        if (instance == null) {
            instance = new DataOfChatBot();
        }
        return instance;
    }

    public Object[] getIntroductionList() {
        return introductionList;
    }

    public void setIntroductionList() {
        Object[] introductionList = new Object[2];
        ArrayList<Object[]> humanMsgList = new ArrayList<>();
        ArrayList<Object[]> botMsgList = new ArrayList<>();
        botMsgList.add(new Object[]{0, "Xin chào, Chào mừng bạn đến với phần Kiểm tra sức khỏe! Rất vui được gặp bạn."});
        humanMsgList.add(new Object[]{1, "Xin chào, tôi cũng rất vui được gặp bạn."});
        botMsgList.add(new Object[]{1, "Kiểm tra sức khỏe được xây dựng dựa trên những nghiên cứu và chỉ dẫn dành cho người " +
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
                "tham vấn bác sĩ."});
        humanMsgList.add(new Object[]{2, understood});
        botMsgList.add(new Object[]{2, "Kiểm Tra Sức Khoẻ giúp bạn hiểu rõ những tác động của lối sống thường nhật đến sức khỏe của mình trong tương lai. " +
                "Chúng ta sẽ cùng nhau đi qua những câu hỏi trong 3 mục, bao quát tất cả các khía cạnh sức khỏe của bạn. Sau đó, " +
                "kết quả sẽ được thể hiện qua Bản Song Sinh Điện Tử để bạn có thể dễ dàng theo dõi."});
        humanMsgList.add(new Object[]{3, great});
        botMsgList.add(new Object[]{3, "Tôi sẽ là người cùng đồng hành với bạn trong suốt quá trình này. Nhưng trước khi chúng ta bắt đầu, " +
                "tôi có một điều cần thổ lộ.... Tôi là một chatbot."});
        botMsgList.add(new Object[]{4, understood});
        botMsgList.add(new Object[]{, });
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});
        botMsgList.add(new Object[]{});


        introductionList[0] = botMsgList;
        introductionList[1] = humanMsgList;
        this.introductionList = introductionList;
    }

    public Object[] getGetTargets() {
        return getTargets;
    }

    public void setGetTargets() {
        this.getTargets = getTargets;
    }

    public Object[] getGetBMI() {
        return getBMI;
    }

    public void setGetBMI() {
        this.getBMI = getBMI;
    }

    public Object[] getGetPersonalInformation() {
        return getPersonalInformation;
    }

    public void setGetPersonalInformation() {
        this.getPersonalInformation = getPersonalInformation;
    }

    public Object[] getPsychoTest() {
        return psychoTest;
    }

    public void setPsychoTest() {
        this.psychoTest = psychoTest;
    }

    public Object[] getNutrientTest() {
        return nutrientTest;
    }

    public void setNutrientTest() {
        this.nutrientTest = nutrientTest;
    }

    public Object[] getBloodTest() {
        return bloodTest;
    }

    public void setBloodTest() {
        this.bloodTest = bloodTest;
    }

    public Object[] getBloodVesselTest() {
        return bloodVesselTest;
    }

    public void setBloodVesselTest() {
        this.bloodVesselTest = bloodVesselTest;
    }

    public Object[] getBoneTest() {
        return boneTest;
    }

    public void setBoneTest() {
        this.boneTest = boneTest;
    }

    public Object[] getBowelTest() {
        return bowelTest;
    }

    public void setBowelTest() {
        this.bowelTest = bowelTest;
    }

    public Object[] getBrainTest() {
        return brainTest;
    }

    public void setBrainTest() {
        this.brainTest = brainTest;
    }

    public Object[] getHeartTest() {
        return heartTest;
    }

    public void setHeartTest() {
        this.heartTest = heartTest;
    }

    public Object[] getJointTest() {
        return jointTest;
    }

    public void setJointTest() {
        this.jointTest = jointTest;
    }

    public Object[] getKidneyTest() {
        return kidneyTest;
    }

    public void setKidneyTest() {
        this.kidneyTest = kidneyTest;
    }

    public Object[] getLiverTest() {
        return liverTest;
    }

    public void setLiverTest() {
        this.liverTest = liverTest;
    }

    public Object[] getLungTest() {
        return lungTest;
    }

    public void setLungTest() {
        this.lungTest = lungTest;
    }

    public Object[] getPancreasTest() {
        return pancreasTest;
    }

    public void setPancreasTest() {
        this.pancreasTest = pancreasTest;
    }

    public Object[] getGenitalTest() {
        return genitalTest;
    }

    public void setGenitalTest() {
        this.genitalTest = genitalTest;
    }

    public Object[] getSkinTest() {
        return skinTest;
    }

    public void setSkinTest() {
        this.skinTest = skinTest;
    }

    public Object getBotMsgList(Object[] MsgData) {
        return MsgData[0];
    }

    public Object getHumanMsgList(Object[] MsgData) {
        return MsgData[1];
    }
}
