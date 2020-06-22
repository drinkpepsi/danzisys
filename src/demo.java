import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class demo {

    public void paixu() {
        int[] nums = new int[]{1, 7, 5, 8, 4};
        int ischarge;
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            ischarge = 0;
            for (int j = 0; j < nums.length - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    ischarge = 1;
                }

            }
            if (ischarge == 0) {
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public void haoni(int n, char start, char tansfer, char target) {
        if (n == 1) {
            System.out.println(start + "-->" + target);

        } else {
            haoni(n - 1, start, target, tansfer);
            System.out.println(start + "-->" + target);
            haoni(n - 1, tansfer, start, target);

        }

    }

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("zhang", "31");//存放键值对

        System.out.println(map.containsKey("zhang"));//键中是否包含这个数据
        System.out.println(map.containsKey("daniu"));
        System.out.println("=========================");

        System.out.println(map.get("zhang"));//通过键拿值
        System.out.println(map.get("daniu"));
        System.out.println("=========================");

        System.out.println(map.isEmpty());//判空
        System.out.println(map.size());
        System.out.println("=========================");

        System.out.println(map.remove("zhang"));//从键值中删除
        System.out.println(map.containsKey("zhang"));
        System.out.println(map.get("zhang"));//获取值
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println("=========================");

        map.put("zhang", "31");
        System.out.println(map.get("zhang"));
        map.put("zhang", "32");
        System.out.println(map.get("zhang"));
        System.out.println("=========================");

        map.put("zhang", "31");
        map.put("cheng", "32");
        map.put("yun", "33");

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("=========================");

        for (String values : map.values()) {
            System.out.println(values);
        }
        System.out.println("=========================");

        map.clear();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "1");
        map.put("E", "2");
        map.put("F", "3");
        map.put("G", "1");
        map.put("H", "2");
        map.put("I", "3");
        for (Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }
        System.out.println("=========================");

        // you can not remove item in map when you use the iterator of map
        // for(Entry<String,String> entry : map.entrySet()){
        // if(!entry.getValue().equals("1")){
        // map.remove(entry.getKey());
        // }
        // }

        // if you want to remove items, collect them first, then remove them by
        // this way.
        List<String> removeKeys = new ArrayList<String>();
        for (Entry<String, String> entry : map.entrySet()) {
            if (!entry.getValue().equals("1")) {
                removeKeys.add(entry.getKey());
            }
        }
        for (String removeKey : removeKeys) {
            map.remove(removeKey);
        }
        for (Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }
        System.out.println("=========================");

    }

}

