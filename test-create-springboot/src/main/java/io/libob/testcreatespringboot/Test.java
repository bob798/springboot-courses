//package io.libob.testcreatespringboot;
//
//import org.apache.commons.collections4.CollectionUtils;
//import org.apache.commons.lang3.StringUtils;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Test {
//    public static void main(String[] args) {
//        User jack = new User(1, "jack", 29);
//        User libob = new User(2, "libob", 28);
//        User anda = new User(3, "anda", 25);
//        List<User> users = new ArrayList<>();
//        users.add(jack);
//        users.add(libob);
//        users.add(anda);
//        // 输出 jack,libob,anda 你很棒哦，点赞
//        System.out.println(parseName(users));
//
//        // 输出 29,28,25 你很棒哦，点赞
//        System.out.println(parseAge(users));
//
//        updateAge(users);
//    }
//
//    /**
//     * 输出用户的年龄以逗号分割
//     *
//     * @param users 用户list
//     * @return
//     */
//    public static String parseAge(List<User> users) {
//        if (users == null || users.isEmpty()) {
//            return "";
//        }
//
//        List<Integer> ages = new ArrayList<>();
//        for (User u : users) {
//            ages.add(u.getAge());
//        }
//        return StringUtils.join(ages, ",");
//    }
//
//    /**
//     * 输出用户的年龄以逗号分割
//     *
//     * @param users 用户list
//     * @return
//     */
//    public static void updateAge(List<User> users) {
//        if (users == null || users.isEmpty()) {
//            return;
//        }
//
//        List<Integer> ages = new ArrayList<>();
//        for (User u : users) {
//            u.setAge(25);
//        }
//
//        for (User u : users) {
//            System.out.println(u.getName() + "--->" + u.getAge());
//        }
//    }
//
//    /**
//     * 输出用户的名字以逗号分割
//     *
//     * @param users 用户list
//     * @return
//     */
//    public static String parseName(List<User> users) {
//        // 使用Apache common Collections工具包的CollectionUtils 工具类
//        // 导入成功
//        if (CollectionUtils.isEmpty(users)) return "";
//        /**
//         * 1. 找到pom依赖信息 2. 放到项目pom文件中 3. 导入依赖 4. 代码使用
//         *
//         */
//
//        List<String> names = new ArrayList<>();
//        for (User u : users) {
//            if (u.getId() == 1) {
//                names.add(u.getName());
//            }
//        }
//        // 使用apache common lang3的stringutils工具类
//
//        return StringUtils.join(names, ",");
//    }
//}
