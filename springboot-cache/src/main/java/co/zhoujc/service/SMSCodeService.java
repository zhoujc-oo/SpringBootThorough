package co.zhoujc.service;

import co.zhoujc.domain.SMSCode;
import org.springframework.stereotype.Service;

/**
 * 定义实现验证的接口
 * @Author zhoujc
 * @Date 2022/2/26
 */
public interface SMSCodeService {

    public String sendCodeToSMS(String tele);

    public boolean checkCode(SMSCode smscode);
}
