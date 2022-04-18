package com.example.nmai.Test;

import com.example.nmai.pages.MealManagement;

import java.util.ArrayList;

public class DataOfTest {
    private static DataOfTest instance;
    public static DataOfTest getInstance(){
        if (instance == null){
            instance = new DataOfTest();
        }
        return instance;
    }
    public ArrayList<String> test(){
        ArrayList<String> list = new ArrayList<>();
        String bot1 = "Bây giờ chúng ta hãy bắt đầu với câu hỏi đầu tiên nhé. Lý do chính khiến bạn muốn thực hiện phần Kiểm Tra Sức Khoẻ là gì?";
        String human1 = "Tôi muốn có những thói quen lãnh mạnh hơn";
        String human2 = "Tôi muốn trở nên năng động hơn";
        String human3 = "Tôi muốn giảm cân";
        String human4 = "Tôi muốn cảm thấy bớt căng thẳng";
        String human5 = "Tôi muốn bớt lo âu";
        list.add(bot1);
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);
        list.add(human5);
        return list;
    }

}
