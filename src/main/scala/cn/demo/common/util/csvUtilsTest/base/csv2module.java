package cn.demo.common.util.csvUtilsTest.base;

import cn.demo.common.util.CsvUtils;
import cn.demo.common.util.csvUtilsTest.modules.User;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
public class csv2module {

    public static void main(String[] args) throws Exception {
        String filePath = "D:\\workspace\\tmp\\csvtest2.csv";
        try {
            List<User> result = new CsvUtils().readCsv2Objects(filePath, ',', User.class, new User().csvMap());
            for (User stu : result){
                System.out.println(stu.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

