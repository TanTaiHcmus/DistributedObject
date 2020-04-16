import java.util.HashMap;
import java.util.Map;

public class InFormationHero {

    private static Map<String, String> myHeroInf = new HashMap<>();

    InFormationHero()
    {
        myHeroInf.put("Yasuo", "Kẻ Bất Dung Thứ");
        myHeroInf.put("Master Yi", "Kiếm Sư Wuju");
        myHeroInf.put("Lux", "Tiểu Thư Ánh Sáng");
        myHeroInf.put("Riven", "Kẻ Lưu Đày");
        myHeroInf.put("Zed", "Chúa Tể Bóng Tối");
    }

	public static String getInformationHero(String name) {
        if (myHeroInf.containsKey(name))
            return myHeroInf.get(name);
        return "N/A";
	}
}
