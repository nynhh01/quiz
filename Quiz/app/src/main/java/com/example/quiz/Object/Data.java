package com.example.quiz.Object;

import android.widget.Toast;

import com.example.quiz.R;

import java.util.ArrayList;
import java.util.Collections;

public class Data {
    static ArrayList<Question> listQuestion;
    static ArrayList<Theme> listTheme;
    static int numberTheme;
    static int totalScore;
    static int start = 0;

    public static void InitQuestions(){
        if(start == 1) return;
        start = 1;
        listQuestion = new ArrayList<Question>();

        // Dia ly
        int id = 0;
        int theme = 0;
        {
            listQuestion.add(new Question(NewId("DL", id++), "Thủ đô của đất nước Australia là gì?",
                    new String[]{"Sydney", "Melbourne", "Canberra", "Brisbane"}, 2, 0, theme));

            listQuestion.add(new Question(NewId("DL", id++), "Thủ đô của đất nước Mỹ là gì?",
                    new String[]{"Washington D.C.", "New York City", "Los Angeles", "Chicago"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("DL", id++), "Thủ đô của đất nước Anh là gì?",
                    new String[]{"London", "Manchester", "Liverpool", "Birmingham"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("DL", id++), "Thủ đô của đất nước Pháp là gì?",
                    new String[]{"Paris", "Marseille", "Lyon", "Toulouse"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("DL", id++), "Thủ đô của đất nước Ý là gì?",
                    new String[]{"Rome", "Milan", "Naples", "Florence"}, 0, 0, theme));

// Thêm 5 câu hỏi mức độ 1 - khó
            listQuestion.add(new Question(NewId("DL", id++), "Dãy núi cao nhất thế giới là gì?",
                    new String[]{"Himalaya", "Andes", "Alps", "Rockies"}, 0, 1, theme));

            listQuestion.add(new Question(NewId("DL", id++), "Hồ lớn nhất thế giới là gì?",
                    new String[]{"Hồ Baikal", "Hồ Michigan", "Hồ Vịnh", "Hồ Biển"}, 0, 1, theme));

            listQuestion.add(new Question(NewId("DL", id++), "Quốc gia có diện tích lớn nhất thế giới là gì?",
                    new String[]{"Nga", "Canada", "Trung Quốc", "Mỹ"}, 1, 1, theme));

            listQuestion.add(new Question(NewId("DL", id++), "Dòng sông dài nhất thế giới là gì?",
                    new String[]{"Amazon", "Nile", "Mississippi", "Yangtze"}, 1, 1, theme));

            listQuestion.add(new Question(NewId("DL", id++), "Quốc gia nằm ở cực Nam của châu Phi là gì?",
                    new String[]{"Nam Cực", "Nam Sudan", "Nam Phi", "Namibia"}, 2, 1, theme));
        }

        // Khoa hoc
        id = 0;
        theme++;
        {
            listQuestion.add(new Question(NewId("KH", id++), "Công thức hóa học của nước là gì?",
                    new String[]{"H2O", "CO2", "NaCl", "C6H12O6"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("KH", id++), "Nguyên tố hóa học phổ biến nhất trong vỏ Trái Đất là gì?",
                    new String[]{"Oxy", "Silic", "Nhôm", "Sắt"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("KH", id++), "Loại pin điện tử thông dụng nhất hiện nay là gì?",
                    new String[]{"Pin lithium-ion", "Pin kiềm", "Pin niken-cadmium", "Pin năng lượng mặt trời"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("KH", id++), "Quá trình biến đổi của chất từ trạng thái rắn sang trạng thái khí gọi là gì?",
                    new String[]{"Sốc nhiệt", "Đông đặc", "Chưng cất", "Sublimation"}, 3, 0, theme));

            listQuestion.add(new Question(NewId("KH", id++), "Đơn vị đo áp suất trong hệ đo lường SI là gì?",
                    new String[]{"Pascal", "Bar", "Newton", "Hertz"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("KH", id++), "Ánh sáng mặt trời cần mất bao lâu để đến Trái Đất?",
                    new String[]{"8 phút", "8 giờ", "8 ngày", "8 tuần"}, 0, 1, theme));

            listQuestion.add(new Question(NewId("KH", id++), "Nguyên tử có phần tử nào làm cho nó trở thành ion?",
                    new String[]{"Proton", "Neutron", "Electron", "Photon"}, 2, 1, theme));

            listQuestion.add(new Question(NewId("KH", id++), "Đơn vị đo nhiệt độ nào được sử dụng rộng rãi trong khoa học?",
                    new String[]{"Độ Fahrenheit", "Độ Celsius", "Độ Kelvin", "Độ Rankine"}, 2, 1, theme));

            listQuestion.add(new Question(NewId("KH", id++), "Quá trình quang hợp xảy ra trong bộ phận nào của cây?",
                    new String[]{"Rễ", "Thân", "Hoa", "Lá"}, 3, 1, theme));

            listQuestion.add(new Question(NewId("KH", id++), "Loại hạt nhân nào được tạo ra trong quá trình hạt nhân phân hạch?",
                    new String[]{"Hạt nhân phi động", "Hạt nhân phi tức thì", "Hạt nhân phi tử", "Hạt nhân phi định thức"}, 1, 1, theme));
        }

        // lịch sử
        id = 0;
        theme++;
        {
            listQuestion.add(new Question(NewId("LS", id++), "Năm nào diễn ra Chiến tranh Điện Biên Phủ?",
                    new String[]{"1954", "1965", "1975", "1986"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("LS", id++), "Ai là người lãnh đạo cuộc Tổng tiến công và nổi dậy mùa xuân năm 1975?",
                    new String[]{"Võ Nguyên Giáp", "Hồ Chí Minh", "Lê Duẩn", "Nguyễn Hữu Thọ"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("LS", id++), "Ngày nào được gọi là Ngày Giải phóng miền Nam, thống nhất đất nước?",
                    new String[]{"30/4/1975", "2/9/1945", "19/5/1954", "1/5/1960"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("LS", id++), "Trận chiến nào được coi là điểm đánh dấu sự thất bại của thực dân Pháp tại Việt Nam?",
                    new String[]{"Trận Điện Biên Phủ", "Trận Đông Quan", "Trận Đồng Khởi", "Trận Cầu Giấy"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("LS", id++), "Điều gì đã kết thúc chiến tranh Việt Nam?",
                    new String[]{"Hiệp định Paris", "Hiệp định Geneva", "Hiệp định Panmunjom", "Hiệp định Rambouillet"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("LS", id++), "Chiến dịch Hồ Chí Minh được tiến hành vào năm nào?",
                    new String[]{"1972", "1968", "1975", "1965"}, 1, 1, theme));

            listQuestion.add(new Question(NewId("LS", id++), "Trận Điện Biên Phủ kéo dài trong bao lâu?",
                    new String[]{"56 ngày", "100 ngày", "180 ngày", "365 ngày"}, 2, 1, theme));

            listQuestion.add(new Question(NewId("LS", id++), "Ai là người chỉ huy quân đội Việt Nam trong cuộc Tổng tiến công và nổi dậy mùa xuân năm 1975?",
                    new String[]{"Võ Nguyên Giáp", "Lê Đức Anh", "Trần Độ", "Văn Tiến Dũng"}, 3, 1, theme));

            listQuestion.add(new Question(NewId("LS", id++), "Trận chiến nào được coi là cuộc đấu tranh đẫm máu nhất trong lịch sử Việt Nam?",
                    new String[]{"Trận kỷ niệm", "Trận Điện Biên Phủ", "Trận Bình Giả", "Trận Hòa Bình"}, 1, 1, theme));

            listQuestion.add(new Question(NewId("LS", id++), "Quân đội Việt Nam đã giành chiến thắng ở trận nào để chấm dứt chiến tranh Việt Nam?",
                    new String[]{"Trận Đồng Hới", "Trận Đông Quan", "Trận Đồng Lộc", "Trận Ấp Bắc"}, 2, 1, theme));
        }

        // Tiếng anh
        id = 0;
        theme++;
        {
            listQuestion.add(new Question(NewId("TA", id++), "What is the opposite of 'hot'?",
                    new String[]{"Cold", "Wet", "Big", "Fast"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("TA", id++), "Which word means 'a person who flies an aircraft'?",
                    new String[]{"Pilot", "Driver", "Doctor", "Teacher"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("TA", id++), "What is the capital city of France?",
                    new String[]{"Paris", "London", "Rome", "Berlin"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("TA", id++), "What is the plural form of the word 'child'?",
                    new String[]{"Children", "Childs", "Childes", "Childies"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("TA", id++), "Which word is a synonym of 'happy'?",
                    new String[]{"Joyful", "Sad", "Angry", "Tired"}, 0, 0, theme));

            listQuestion.add(new Question(NewId("TA", id++), "What is the longest river in Africa?",
                    new String[]{"Nile", "Amazon", "Congo", "Zambezi"}, 0, 1, theme));

            listQuestion.add(new Question(NewId("TA", id++), "Who wrote the play 'Romeo and Juliet'?",
                    new String[]{"William Shakespeare", "Jane Austen", "Charles Dickens", "Mark Twain"}, 0, 1, theme));

            listQuestion.add(new Question(NewId("TA", id++), "What is the chemical symbol for gold?",
                    new String[]{"Au", "Ag", "Fe", "Cu"}, 0, 1, theme));

            listQuestion.add(new Question(NewId("TA", id++), "Which planet is known as the 'Red Planet'?",
                    new String[]{"Mars", "Venus", "Jupiter", "Saturn"}, 0, 1, theme));

            listQuestion.add(new Question(NewId("TA", id++), "Who painted the famous artwork 'The Starry Night'?",
                    new String[]{"Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Michelangelo"}, 0, 1, theme));
        }
        numberTheme = theme + 1;
        InitTheme();
        totalScore = 0;
    }
    static void InitTheme(){
        listTheme = new ArrayList<Theme>();
        int[] idPictures = {R.drawable.img_dia_ly, R.drawable.img_khoa_hoc, R.drawable.img_lich_su, R.drawable.img_tieng_anh};
        String[] nameTheme = {"Địa lý", "Khoa học", "Lịch sử", "Tiếng Anh"};
        String[] informationsTheme = {
                "Địa lý là một lĩnh vực nghiên cứu về các phương diện về Trái đất, bao gồm các thành phần vật lý, nhân chủng, kinh tế và xã hội.",
                "Khoa học là việc nghiên cứu tổ chức tri thức về tự nhiên và xã hội, dựa trên quan sát, thử nghiệm và lý thuyết.",
                "Lịch sử là việc tìm hiểu về quá khứ của con người, các sự kiện quan trọng, nhân vật lịch sử và tác động của chúng lên thế giới hiện tại.",
                "Tiếng Anh là một ngôn ngữ phổ biến trên toàn cầu, được sử dụng trong giao tiếp, học tập và kinh doanh."
        };
        for(int i = 0; i < numberTheme; i++){
            listTheme.add(new Theme(NewId("ID_THEME", i), idPictures[i], nameTheme[i], informationsTheme[i]));
        }
        for(int i =0; i< listQuestion.size(); i++){
            listTheme.get(listQuestion.get(i).getTheme()).addQuestion(listQuestion.get(i));
        }
    }
    public static ArrayList<Question> getQuestion(int type, int lv){
        ArrayList<Question> result = new ArrayList<>();
        ArrayList<Question> data = listTheme.get(type).getQuestions();
        for(Question i : data)
            if(i.getLevel() == lv){
                result.add(i);
                result.get(result.size() - 1).randomAnswer();
            }
        // trộn ngẫu nhiên các phàn tử trong mảng result
        Collections.shuffle(result);
        return result;
    }
    public static ArrayList<Question> getQuestion(){
        return listQuestion;
    }
    public static ArrayList<Question> getQuestion(int type){
        return listTheme.get(type).getQuestions();
    }
    public static Question findQuestion(String id){
        for(int i = 0; i<listQuestion.size(); i++)
            if(listQuestion.get(i).getId().equals(id))
                return listQuestion.get(i);
        return null;
    }
    static String NewId(String key, int id) {
        return String.format("%s%03d", key, id);
    }
    public static ArrayList<Theme> getListTheme(){return listTheme;}
    public static int getTotalScore(){return totalScore;}
    public static void setTotalScore(int value){totalScore = value;}
}
