import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Word<String, String>[] words = new Word[]
        {
            new Word<>("Java", "Là một ngôn ngữ lập trình cấp cao, hướng đối tượng mà bạn đang học"),
                    new Word<>("Kotlin", "Là một ngôn ngữ lập trình đa nền tảng, tương thích hoàn toàn với Java, " +
                            "nếu thích bạn cứ học."),
                    new Word<>("C", "Là ngôn ngữ lập trình kinh điển trong các trường học."),
                    new Word<>("Objective-C", "Ngôn ngữ được dùng để viết ứng dụng trên các thiết bị của Apple."),
                    new Word<>("Swift", "Là ngôn ngữ được dùng để thay thế cho Objective-C."),
        };

        Dictionary<String, String> dictionary = new Dictionary<>(words);

        Scanner sc = new Scanner(System.in);
        String language;
        do {
            // Lặp đến khi language là "q" hoặc "Q"
            System.out.print("Nhập ngôn ngữ bạn muốn biết, nhấn Q để thoát: ");
            language = sc.nextLine();
            // Tra từ
            String result = dictionary.findWord(language);
            if (result != null) {
                // In kết quả nếu tra ra từ
                System.out.println(result);
            } else {
                // Không tìm thấy từ cần tra
                System.out.println("Chưa có dữ liệu về ngôn ngữ bạn cần");
            }
        } while (language != null && !language.equalsIgnoreCase("q"));
    }
}