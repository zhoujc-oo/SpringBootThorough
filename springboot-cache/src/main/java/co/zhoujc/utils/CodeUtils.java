package co.zhoujc.utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Component
public class CodeUtils {

    /**
     * 处理生成的tele数始终为六位，如果不满六位则一0代替
     */
    private String[] patch = {"000000", "00000", "0000", "000", "00", "0", ""};

    public String generator(String tele) {
        int hash = tele.hashCode();
        int encrypthion = 20206666;
        long result = hash ^ encrypthion;
        long nowTime = System.currentTimeMillis();
        result = result ^ nowTime;
        long code = result % 1000000;
        code = code < 0 ? -code : code;
        String codeStr = code + "";
        int len = codeStr.length();
        return patch[len] + codeStr;
    }

    @Cacheable(value = "smsCode",key = "#tele")
    public String get(String tele){
        return null;
    }
}
