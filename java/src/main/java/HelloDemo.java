import java.util.Map;
import java.util.TreeMap;

/**
 * @author pengjian
 * @since 2022-05-16
 */
public class HelloDemo {

    public static void main(String[] args) {
        String str = "toggle_13_3\n" +
                "toggle_13_2\n" +
                "toggle_1_5\n" +
                "fill_14_4\n" +
                "fill_18_3\n" +
                "toggle_5_3\n" +
                "toggle_5_4\n" +
                "toggle_1_2\n" +
                "toggle_1_3\n" +
                "fill_14_3\n" +
                "fill_14_2\n" +
                "toggle_1_4\n" +
                "fill_10_3\n" +
                "fill_10_2\n" +
                "toggle_21\n" +
                "fill_6_4\n" +
                "fill_2_8\n" +
                "toggle_22\n" +
                "fill_2_7\n" +
                "fill_6_2\n" +
                "fill_2_6\n" +
                "toggle_20\n" +
                "fill_2_5\n" +
                "fill_2_4\n" +
                "fill_2_3\n" +
                "fill_2_2\n" +
                "toggle_23\n" +
                "fill_21_2\n" +
                "fill_21_3\n" +
                "toggle_6_4\n" +
                "fill_6_5\n" +
                "toggle_14_3\n" +
                "toggle_14_2\n" +
                "fill_15_3\n" +
                "toggle_4_3\n" +
                "toggle_4_4\n" +
                "fill_11_3\n" +
                "undefined\n" +
                "fill_11\n" +
                "fill_12\n" +
                "fill_13\n" +
                "fill_11_2\n" +
                "fill_14\n" +
                "fill_10\n" +
                "toggle_21_2\n" +
                "fill_5_5\n" +
                "fill_5_4\n" +
                "fill_5_2\n" +
                "fill_19\n" +
                "fill_15\n" +
                "fill_16\n" +
                "fill_17\n" +
                "fill_18\n" +
                "resignNumber\n" +
                "fill_4\n" +
                "fill_22\n" +
                "toggle_8\n" +
                "toggle_9_6\n" +
                "fill_5\n" +
                "fill_23\n" +
                "toggle_7\n" +
                "fill_6\n" +
                "fill_24\n" +
                "toggle_9_8\n" +
                "fill_7\n" +
                "fill_25\n" +
                "toggle_9\n" +
                "toggle_9_7\n" +
                "fill_8\n" +
                "toggle_4\n" +
                "fill_9\n" +
                "toggle_3\n" +
                "fill_20\n" +
                "toggle_6\n" +
                "toggle_9_4\n" +
                "fill_21\n" +
                "toggle_5\n" +
                "toggle_9_3\n" +
                "toggle_10_3\n" +
                "toggle_10_4\n" +
                "toggle_2\n" +
                "toggle_1\n" +
                "toggle_10_2\n" +
                "toggle_9_9\n" +
                "fill_9_4\n" +
                "fill_2\n" +
                "fill_3\n" +
                "fill_9_2\n" +
                "fill_5_6\n" +
                "toggle_15_3\n" +
                "toggle_15_2\n" +
                "toggle_11_4\n" +
                "fill_16_3\n" +
                "toggle_3_3\n" +
                "toggle_3_4\n" +
                "fill_26\n" +
                "fill_12_3\n" +
                "fill_27\n" +
                "fill_12_2\n" +
                "fill_28\n" +
                "fill_29\n" +
                "fill_33\n" +
                "fill_34\n" +
                "fill_35\n" +
                "fill_36\n" +
                "fill_30\n" +
                "fill_31\n" +
                "fill_32\n" +
                "toggle_22_2\n" +
                "fill_8_2\n" +
                "fill_4_5\n" +
                "fill_4_4\n" +
                "fill_4_2\n" +
                "contractNumber\n" +
                "fill_37\n" +
                "fill_38\n" +
                "fill_39\n" +
                "fill_23_3\n" +
                "fill_44\n" +
                "fill_45\n" +
                "fill_46\n" +
                "fill_47\n" +
                "fill_40\n" +
                "fill_41\n" +
                "toggle_8_3\n" +
                "fill_42\n" +
                "toggle_8_4\n" +
                "fill_43\n" +
                "toggle_11_3\n" +
                "fill_4_9\n" +
                "fill_8_4\n" +
                "fill_4_8\n" +
                "fill_4_7\n" +
                "toggle_10\n" +
                "toggle_11\n" +
                "toggle_14\n" +
                "undefined_7\n" +
                "toggle_16_2\n" +
                "toggle_15\n" +
                "undefined_8\n" +
                "toggle_12\n" +
                "undefined_9\n" +
                "toggle_12_3\n" +
                "toggle_13\n" +
                "undefined_3\n" +
                "toggle_2_4\n" +
                "undefined_5\n" +
                "undefined_16\n" +
                "fill_17_3\n" +
                "toggle_6_3\n" +
                "fill_48\n" +
                "fill_13_2\n" +
                "undefined_14\n" +
                "fill_49\n" +
                "undefined_15\n" +
                "toggle_2_2\n" +
                "undefined_12\n" +
                "undefined_2\n" +
                "toggle_2_3\n" +
                "fill_13_3\n" +
                "undefined_10\n" +
                "undefined_11\n" +
                "toggle_18\n" +
                "toggle_19\n" +
                "toggle_16\n" +
                "undefined_7_7\n" +
                "toggle_17\n" +
                "fill_3_7\n" +
                "fill_7_2\n" +
                "fill_3_5\n" +
                "fill_3_4\n" +
                "fill_3_3\n" +
                "fill_3_2\n" +
                "fill_20_3\n" +
                "toggle_7_3\n" +
                "toggle_7_4\n" +
                "toggle_12_2\n" +
                "fill_3_9\n" +
                "fill_7_4\n" +
                "fill_3_8\n";

        String[] split = str.split("\n");
        Map<Object, Object> map = new TreeMap<>();
        for (int i = 0; i < split.length; i++) {
            map.put(split[i], "");
        }

        map.forEach((k,v)->System.out.println(k));
    }
}
